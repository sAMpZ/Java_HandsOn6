
public abstract class Environment {

	public static void main(String[] args) {
		
		Shark shark = new Shark();
		
		System.out.println(shark.kind + " is an " + shark.family + " which lives in " + shark.habitat + ", hence it is " + shark.type);

	}

}

class Animal extends Environment {
	
	String family = "Animal";

}

class Fish extends Animal {
	
	String habitat = "Water";
	String type = "Aquatic";

}

class Shark extends Fish{
	
	String kind = "Shark";

}

