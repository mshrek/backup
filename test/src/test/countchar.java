package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class countchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] slist =sc.nextLine().toCharArray();
		Map<Character,Integer>  map= new HashMap<Character,Integer>();
		
		for (int i=0;i<slist.length;i++){
		if(map.get(slist[i])==null)
			map.put(slist[i],1);
		else
		   map.put(slist[i],map.get(slist[i])+1);
		 
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			System.out.println(entry);
		}
		

	}

}
