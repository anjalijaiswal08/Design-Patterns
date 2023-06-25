package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
		ToyDuck toyDuck = new PlasticDuck();
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		System.out.println("Sparrow");
		sparrow.fly();
		sparrow.makeSound();
		System.out.println("toyDuck");
		toyDuck.squeak();
		System.out.println("Bird Adapter");
		birdAdapter.squeak();
	}

}
