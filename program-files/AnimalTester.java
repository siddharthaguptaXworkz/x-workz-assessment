public class AnimalTester{
	public static void main(String[] args) {
		Animal animal = new Animal(300,true,"Lion","Feline");
		System.out.println("animal with name "+ animal.getName() + "is mammal " + animal.getIsMammal() + "of species "+ animal.getSpecies() );
		animal.setSpecies("Something else");
		System.out.println("animal with name "+ animal.getName() + "is mammal " + animal.getIsMammal() + "of species "+ animal.getSpecies() );
	}

}
