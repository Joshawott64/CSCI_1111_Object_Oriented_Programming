
public class Pokemon {
	// Data fields
	private String name;
	private String type;
	private String region;
	private int evoNum;
	private String classification;
	private boolean legendary;
	
	// Default constructor
	public Pokemon() {
	}
	
	// Construct a Pokemon w/ specified name, type, region, and isLegendary
	public Pokemon(String name, String type, String region, int evoNum, 
			String classification, boolean legendary) {
		this.name = name;
		this.type = type;
		this.region = region;
		this.evoNum = evoNum;
		this.classification = classification;
		this.legendary = legendary;
	}
	
	// Returns name
	public String getName() {
		return name;
	}
	
	// Sets a new name
	public void setName(String newName) {
		name = newName;
	}
	
	// Returns type
	public String getType() {
		return type;
	}
	
	// Sets a new type
	public void setType(String newType) {
		type = newType;
	}
	
	// Returns region
	public String getRegion() {
		return region;
	}
		
	// Sets a new region
	public void setRegion(String newRegion) {
		region = newRegion;
	}
	
	// Returns evoNum
	public int getEvoNum() {
		return evoNum;
	}
	
	// Sets a new evoNum
	public void setEvoNum(int newEvoNum) {
		evoNum = newEvoNum;
	}
	
	// Returns classification
	public String getClassification() {
		return classification;
	}
	
	// Sets a new classification
	public void setClassification(String newClassification) {
		classification = newClassification;
	}
	
	// Returns legendary
	public boolean isLegendary() {
		return legendary;
	}
	
	// Set a new legendary
	public void setLegendary(boolean newLegendary) {
		legendary = newLegendary;
	}
	
}
