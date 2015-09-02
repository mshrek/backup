package generic;

import java.util.Scanner;

public class clocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String[] val = in.nextLine().split(":");
        String direction,finaloutput="";
        direction = (val[val.length-1].substring(2, 4));
        
        for (int i=0;i<val.length;i++)
        	{ if(direction.equals("AM"))
        	   {if(val[0].equals("12"))        		  
        		    val[0]="00";
        		if(i!=val.length-1)       		           			
        		   finaloutput+=val[i]+":";       		   
        	    else
        	    	finaloutput+=val[i].substring(0,2);
        	   }
        	  else
              	{
        		if(Integer.parseInt(val[0])<12)
              		 val[0]=Integer.parseInt(val[0])+12+"";
              	if(i!=val.length-1)       		           			
         		   finaloutput+=val[i]+":";       		   
         	    else
         	    	finaloutput+=val[i].substring(0,2);      	 
        	    }
       
	}
        System.out.println(finaloutput);
	}
}
