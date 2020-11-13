public class Animal{
	private int weight;
	private boolean isMammal;
	private String name;
	private String species;
	
	public Animal(int weight,boolean isMammal, String name,String species) {
		this.weight = weight;
		this.isMammal = isMammal;
		this.name = name;
		this.species = species;
	}
	
	public int getWeight() {
		return weight;
		
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public boolean getIsMammal() {
		return isMammal;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		
		this.species = species;
	}
	
	public void printAnimal(boolean includesIsMammal) {
		
	}
	
	public void printAnimal(boolean includesIsMamml, boolean includesWeight)
}