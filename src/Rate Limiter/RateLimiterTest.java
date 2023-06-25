import java.util.concurrent.TimeUnit;

/**
 *
 * @author aayush This is a simple test for a rate limiter. We can build the
 *         RateLimitExecutor object and set the following attributes: a)
 *         instanceId — which acts as a key to uniquely identify the rate
 *         limiting policy b) threshold — the Transactions per second to be
 *         controlled (throttle limit) Based on this information, provision the
 *         rate limiter in a container class — Rate Limit Manager This class
 *         then pumps loads through iterations, and sleep time to control
 *         traffic ingestion.
 */
public class RateLimiterTest implements RateLimitListener {
// Number of iterations to be executed (simulate load generation)
	private static long iterations = 1000;
// Rate Limit to be sent in Transactions per Second.
// Inspect the TPS value in the prints and play around with this value. Increase this value to avoid throttling
	private static long thresholdToBeEnforced = 100;
// Sleep time between pumping traffic in milliseconds. Set to zero for uncontrolled traffic ingestion.
// Give a sleep time of 100 ms for example to pump traffic every 100 milliseconds and control the TPS
	private static long sleepTime = 0;

	public static void main(String[] args) throws InterruptedException {
		new RateLimiterTest().test();
	}

	private void test() throws InterruptedException {
// Setup and provision the rate limit
// User Defined Rate Limit Instance Id. Eg: HTTP Interface
		String instanceId = "HTTP Interface";
// Create an instance of Rate Limit Executor
		RateLimitExecutor rateLimiter = new RateLimitExecutor();
// Set the thresholds / second.
		rateLimiter.build(TimeUnit.SECONDS, thresholdToBeEnforced);
// Associate instance ID
		rateLimiter.setInstanceId(instanceId);
// Provision Rate Limit
		RateLimitManager.instance.provisionRateLimit(rateLimiter, instanceId, new RateLimitThrottleListener());
// Start the test
		for (int i = 0; i < iterations; i++) {
			RateLimitManager.instance.pegTraffic(instanceId);
			Thread.sleep(sleepTime);
		}
		try {
// Wait for graceful termination of worker thread from the pool
			RateLimitManager.instance.getThreadPool().awaitTermination(2, TimeUnit.SECONDS);
			RateLimitManager.instance.deProvisionRateLimit("HTTP Interface");
		} catch (InterruptedException e) {
			System.exit(0);
		}
		System.out.println("\n Test Ended \n");
		System.exit(1);
	}

	public void rateLimitThresholdBreached() {
		System.out.println("Rate Limit has been breached for: ");
	}

	public void rateLimitThresholdNormal() {
		System.out.println("Rate Limit is under control for: ");
	}
}
