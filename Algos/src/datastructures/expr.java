package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class expr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		
	     Scanner sc = new Scanner(System.in);
	     //int n = Integer.parseInt(sc.nextLine());
	     Map<Character,Character> map1 = new HashMap<Character,Character>();
	     map1.put('(', ')');
	     map1.put('{', '}');
	     map1.put('[', ']');
	    while(sc.hasNext()){
	     Stack s = new Stack();
	     char [] ch = sc.nextLine().toCharArray();
	     
	     for(char ch1 : ch){
	    	
	    	if (map1.containsKey(ch1))
	    		s.push(ch1);
	    	else
	    	{   
	    		if(s.isEmpty())
	    			{
	    			System.out.println(false);
	    		    return;
	    			}
	    		else
	    		{
	    		Character x = (Character) s.pop();
	    		if((char)map1.get(x)!=ch1)
					{
	    			 System.out.println(false);
					 return;
					}
	    		}
    	
	    	}	
	     }
	     
	     if(s.isEmpty())
	    	 System.out.println(true);
	     else
	    	 System.out.println(false);
	}
	}
}

