package generic;

import java.util.Scanner;

public class beastmachine_timeout {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] val=new String[n];
    for(int i=0;i<n;i++){
    	;
    	int digits = sc.nextInt();
    	if(digits<3)    		
        {
    		  val[i]="-1";		 
        }
    	else
    	{
    		int x=0,y=0,max1=0,max2=0;
    		for(x=0;x<=digits/5;x++)
    			{
    				if((digits-5*x)%3==0 && (digits-5*x)/3 >max1)
    				{
    					max1=(digits-5*x)/3; //for 5
    				}
    			}
    		if(max1==0)
    			{
    			for(x=0;x<=digits/3;x++)
    			
				{
					if((digits-3*x)%5==0 && (digits-3*x)/5 >max2)
					{
						max2=(digits-3*x)/5;  //for 3
					}
				}
    	        }
    		
    		if(max1==0 && max2==0)
    			val[i]="-1";
    		else if(max1!=0)
    			{
    			String temp="";
    			for(int k=1;k<=digits;k++)
    			   {
    				if(k<=3*max1)
    					temp+="5";
    				else
    					temp+="3";
    			   }
    			val[i]=temp;
    			}
    		else
    		{
    		  String temp="";
    		  for(int k=1;k<=digits;k++)
 			   {
 				if(k<=5*max2)
 					temp+="3";
 				else
 					temp+="5";
 			   }
 			val[i]=temp;
    		}
    	}
    
    }    
    
    for(String s : val)
    	System.out.println(s);
	}
}
