package datastructures;

import java.util.*;


public class set {
	protected static void call1(){
		Set<String> set = new HashSet<String>();
		set.add(new String("hello"));
		set.add(new String("ram"));
		for(String i: set)
			System.out.println(i);
	}
	
	protected static void call2(){
		Set<String> set = new HashSet<String>();
		set.add(new String("hello"));
		set.add(new String("ram"));
		Iterator iter = set.iterator();
	    while(iter.hasNext())
	    {
	    	System.out.println(iter.next());
	    }
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call1();
        call2();
	}

}
