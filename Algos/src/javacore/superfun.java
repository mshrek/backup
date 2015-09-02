package javacore;

class Animal1{
		public Animal1(){
			System.out.println("Animal1 created successfully");
		}

	   public void move(){
	      System.out.println("Animals can move");
	   }
}

class Dog1 extends Animal1{
		
	   public Dog1(){
		   System.out.println("Dog1 created successfully");
	   }
	   public void move(){
	      super.move(); // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
}

public class superfun{

	   public static void main(String args[]){

	      Animal1 b = new Dog1(); // Animal reference but Dog object
	      Animal1 c= new Animal1();
	      b.move(); //Runs the method in Dog class

	   }
	}