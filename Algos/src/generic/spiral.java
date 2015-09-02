package generic;

import java.util.HashMap;
import java.util.Map;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [][] mat ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	int i=0,j=0,total=0,count=mat.length*mat[0].length;
	int north=4,south=2,east=1,west=3,dir=east;
	int row=mat.length,rowcount=mat.length;
	int col=mat[0].length,colcount=mat[0].length;
	while(total!=count)
	{
		switch(dir){
		case 1:System.out.println(mat[i][j]);
		       j++;
		       if(j==colcount-1)
		    	   {System.out.println(mat[i][j]);
		    	   i++;
		    	   colcount--;
		       	   dir=south;
		       	   total++;
		    	   }
		       break;
			
		case 2: System.out.println(mat[i][j]);
	       		i++;
	       		if(i==rowcount-1)
	    	    {System.out.println(mat[i][j]);
	       	    j--;
	    	    rowcount--;
	       	    dir=west;
	       	    total++;
	    	    }
	       		break;
			
		case 3:System.out.println(mat[i][j]);
	           j--;
	           if(j==col-colcount-1)
	    	   {System.out.println(mat[i][j]);
	           i--;
	    	   rowcount--;
	       	   dir=north;
	       	   total++;
	    	   }
	       break;
			
		case 4:System.out.println(mat[i][j]);
			  i--;
			  if(i==row-rowcount-1)
	    	   {System.out.println(mat[i][j]);
	    	   j++;
	    	   //colcount--;
	       	   dir=east;
	       	   total++;
	    	   }
	       break;
			
		}
		
		
	}
	
	}

}
