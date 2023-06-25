package builderPattern;

//Product
public class House implements HousePlan {
	private String roof;
	private String basement;
	private String structure;
	private String interior;

	@Override
	public void setRoof(String roof) {
		this.roof = roof;		
	}

	@Override
	public void setbasement(String basement) {
		this.basement = basement;		
	}

	@Override
	public void setstructure(String structure) {
		this.structure = structure;		
	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;		
	}
	
	public String getRoof() {
		return this.roof;
	}

}
