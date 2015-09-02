package generic;
public class traverse {

	protected boolean traversematrix(){
    	int arr[][]={{1,2,3},{4,5,7},{5,6,8}};
    	int searchnumber=7;
    	
        int rows=arr[0].length;
        int cols=arr.length;
        int rowcounter=0,colcounter=cols-1;
        
        while(rowcounter<=rows-1 && colcounter!=-1){
        	if (arr[rowcounter][colcounter] == searchnumber)
        	    return true;
        	
        	if(searchnumber>arr[rowcounter][colcounter])
        		rowcounter+=1;
        	else 
        		colcounter-=1;
        	}
		return false;
        }

    	
	
	public static void main(String[] args) {
		traverse prog = new traverse();
		boolean flag = prog.traversematrix();
    	if(flag)
    		System.out.println("Search element found");
    	else
    		System.out.println("Search element not found");	 
	}
}


