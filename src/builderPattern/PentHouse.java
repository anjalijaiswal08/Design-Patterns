package builderPattern;

public class PentHouse implements HouseBuilder {
	
	private House house;
	
	public PentHouse() {
		this.house = new House();
	}

	@Override
	public void buildRoof() {
		house.setRoof("Penthouse roof");

		
	}

	@Override
	public void buildStructure() {
		house.setstructure("Penthouse structure");
		
	}

	@Override
	public void buildBasement() {
		house.setbasement("Penthouse basement");
		
	}

	@Override
	public House getHouse() {
		return house;
	}

	@Override
	public void buildInterior() {
		house.setInterior("Penthouse interior");
		
	}

}
