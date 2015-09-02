package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine()),count=0;
        Map<Integer,ArrayList<Integer>> dict= new HashMap<Integer,ArrayList<Integer>>();
        
        for(int i=0;i<n;i++){
        	String[] input =sc.nextLine().split(" ");
        	ArrayList<Integer> arr = new ArrayList<Integer>();
        	int size=Integer.parseInt(input[0]);
        	for(int j=1;j<=size;j++){
        		arr.add(Integer.parseInt(input[j]));
        	}
        	dict.put(i+1, arr);      	
        }
        
        int q = Integer.parseInt(sc.nextLine());
        for(int k=0;k<q;k++){
        	String[] query = sc.nextLine().split(" ");
        	int line=Integer.parseInt(query[0]),search=Integer.parseInt(query[1]);
        	ArrayList<Integer> searcharr = dict.get(line);
        	if(search>searcharr.size() || search<0)
        		System.out.println("ERROR!");
        	else
        		System.out.println(searcharr.get(search-1));
        }
	}

}
