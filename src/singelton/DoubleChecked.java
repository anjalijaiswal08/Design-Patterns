package singelton;

public class DoubleChecked {
	private static DoubleChecked obj = null;

	private DoubleChecked() {
	}

	public static DoubleChecked getInstance() {
		if (obj == null) {
			synchronized (DoubleChecked.class) {
				if (obj == null)
					obj = new DoubleChecked();
			}
		}
		return obj;
	}

}
