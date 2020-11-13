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
		if(includesIsMammal) {
			System.out.println("animal with name "+ animal.getName() + "is mammal " + animal.getIsMammal() + "of species "+ animal.getSpecies() + "weight "+animal.getWeight() );
		} else {
			System.out.println("animal with name "+ animal.getName() + "of species "+ animal.getSpecies()+ "weight "+animal.getWeight()  );
		}
	}
	
	public void printAnimal(boolean includesIsMammal, boolean includesWeight) {
		if(includesIsMammal && includesWeight) {
			System.out.println("animal with name "+ animal.getName() + "is mammal " + animal.getIsMammal() + "of species "+ animal.getSpecies()+ "weight "+animal.getWeight()  );
		} else if (!includesIsMammal && includesWeight) {
			System.out.println("animal with name "+ animal.getName() + "of species "+ animal.getSpecies()+ "weight "+animal.getWeight()  );
		} else if(!includesIsWeight && includesIsMammal) {
			System.out.println("animal with name "+ animal.getName() + "is mammal " + animal.getIsMammal() + "of species "+ animal.getSpecies() );
		} else {
			System.out.println("animal with name "+ animal.getName() + "is mammal " + animal.getIsMammal() + "of species "+ animal.getSpecies()+ "weight "+animal.getWeight()  );
		}
	}
}