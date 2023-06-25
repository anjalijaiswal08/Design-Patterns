package builderPattern;

public class Igloo implements HouseBuilder {
	
	private House house;
	public Igloo() {
		this.house = new House();
	}
	
	@Override
	public void buildRoof() {
		house.setRoof("Igloo roof");
		
	}

	@Override
	public void buildStructure() {
		house.setstructure("Igloo structure");
		
	}

	@Override
	public void buildBasement() {
		house.setbasement("Igloo Basement");
		
	}

	@Override
	public House getHouse() {
		return house;
	}

	@Override
	public void buildInterior() {
		house.setInterior("Igloo Interior");
		
	}

}
