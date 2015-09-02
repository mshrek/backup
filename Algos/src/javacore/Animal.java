package javacore;
interface Organism {}
public class Animal {
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
	    Mammal m = new Mammal();
	    Dog d = new Dog();

	    System.out.println(m instanceof Animal);
	    System.out.println(d instanceof Mammal);
	    System.out.println(d instanceof Animal);
	    System.out.println();
	    System.out.println(m instanceof Organism);
	    System.out.println(d instanceof Organism);
	    System.out.println(a instanceof Organism);
	      
	   }

	
}
 class Mammal extends Animal implements Organism{
}

 class Reptile extends Animal{
}

 class Dog extends Mammal{
}