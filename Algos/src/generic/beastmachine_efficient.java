package generic;

import java.util.Scanner;

public class beastmachine_efficient {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] val=new String[n];
    for(int i=0;i<n;i++){
    
    	int digits = sc.nextInt();
    	if(digits<3)    		
        {
    		  val[i]="-1";		 
        }
    	else
    	{
    		
    }    
    
    for(String s : val)
    	System.out.println(s);
	}
}
}
