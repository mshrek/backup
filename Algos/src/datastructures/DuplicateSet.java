package datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine()),count=0;
        HashSet <String> namephone= new HashSet<String>();
        for(int i=0;i<n;i++){
        	String name = sc.nextLine();
        	if(!namephone.contains(name)){
        		count++;
        		namephone.add(name);
        		System.out.println(count);
        	}
        	else
        		System.out.println(count);
        }
	}

}
