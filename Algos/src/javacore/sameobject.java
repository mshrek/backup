package javacore;
 interface Vegetarian{}
 class Animal2{}
 class Deer extends Animal2 implements Vegetarian{}

public class sameobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d = new Deer();
		Animal2 a = d;
		Vegetarian v = d;
		Object o = d;
		
		System.out.println(d);
		System.out.println(a);
		System.out.println(v);
		System.out.println(o);
	}

}
