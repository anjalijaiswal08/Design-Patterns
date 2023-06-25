package builderPattern;

//Builder Layer.
public interface HouseBuilder {
	public void buildRoof();
	public void buildStructure();
	public void buildBasement();
	public void buildInterior();
	public House getHouse();

}
