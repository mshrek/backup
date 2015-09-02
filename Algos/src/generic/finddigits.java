package generic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class finddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int count,i=0,next,n = Integer.parseInt(sc.nextLine());
    int[] output= new int[n];
    for(;i<n;i++)
    	{
    	 count=0;
    	 int num=Integer.parseInt(sc.nextLine());
    	 String[] numlist=(num+"").split("");
    	 for(String s:numlist)
    		  {next=Integer.parseInt(s); 
    		  if(next!=0)
    		    if(num%next==0)
    		      count++;
    		  }
  
    	 output[i]=count;
    	}
    for(int k:output)
    	System.out.println(k);
	}

}
