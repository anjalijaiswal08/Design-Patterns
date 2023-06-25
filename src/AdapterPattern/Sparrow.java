package AdapterPattern;

public class Sparrow implements Bird {

	@Override
	public void makeSound() {
		System.out.println("Chirp Chirp");

	}

	@Override
	public void fly() {
		System.out.println("Sparrow fly");

	}

}
