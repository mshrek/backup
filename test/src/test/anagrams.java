package test;

import java.util.Arrays;
import java.util.Stack;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "hello!";
		String b="!helol";
		char [] alist=a.toCharArray();
		char [] blist=b.toCharArray();
		boolean flag=true;
		
		if(alist.length!=blist.length)
		{
			System.out.println("Not anagram");
			return;
		}
		
		Arrays.sort(alist);
		Arrays.sort(blist);
		
		
		for(int i=0;i<alist.length;i++)
			if(alist[i]!=blist[i])
				flag=false;
				
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
			
	
	}
	
}
