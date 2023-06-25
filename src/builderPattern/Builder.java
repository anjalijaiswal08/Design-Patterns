package builderPattern;

public class Builder {
	public static void main(String [] args) {
		HouseBuilder igloo = new Igloo();
		CivilEngineer engineer = new CivilEngineer(igloo);
		engineer.constructHouse();
		House house = engineer.getHouse();
		System.out.println(house.getRoof());
	}

}
