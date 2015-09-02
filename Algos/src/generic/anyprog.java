package generic;
public class anyprog {
	interface traverse {
	boolean travelrightdown();
	}
	
	protected void maxmin(){
		/*pseudo code
		 * 1.Select elements in pairs starting from index 0
		 * 2.Initialize max=0, min=0.
		 * 3.Starting from first pair , find the greater of any pair.
		 * 4.Compare the greater of the pair with the max
		 * 5.Compare the lesser of the pair with the min
		 * 6.Repeat this step till the last pair. 
		 * 7.if n is odd then the last element, which is non paired, needs to be compared to the max and min.
		 * 8.The last updated max and min value would give us the required answer.
		 * 9.In total 3 comparisons would be done for a pair
		 * 10.If there are 'n' such pairs then in total n/2 * ( 1+ 1+ 1) comparisons would be done.
		 * 11.So in total 1.5*n comparisons would be done.
		 */
		int arr[]={1,-1,9,4,8,2,100,87,-20};
		int max=0,min=0,index=0;
		
	    for(;index<arr.length/2;index++){
	    	System.out.println("Value of index ="+index+" "+"Pairs compared ="+arr[index*2]+" and "+arr[index*2+1]);
	    	if(arr[index*2+1]>arr[index*2])
	    	{
	    		if(arr[index*2+1]>max)
	    	    	max=arr[index*2+1];
	    	    if(arr[index*2]<min)
	    	    	min=arr[index*2];
	    	}
	    	else
	    	{
	    		if(arr[index*2]>max)
	    	    	max=arr[index*2];
	    	    if(arr[index*2+1]<min)
	    	    	min=arr[index*2+1];
	    	}
	    }
	    
	    if(arr[2*index]>max)
	    	max=arr[2*index];
	    if(arr[2*index]<min)
	    	min=arr[2*index];
	    
	    System.out.println("Maximum of the array = "+max+" Minimum of the array ="+min);
	    
	}
    protected void traversematrix(){
    	int arr[][]={{1,2,3},{4,5,7},{5,6,8}};
    	int searchnumber=7;
    	
    	traverse travel = new traverse() {
    		
    	public boolean travelrightdown() {
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
    	};
    	
    	boolean flag = travel.travelrightdown();
    	if(flag)
    		System.out.println("Search element found");
    	else
    		System.out.println("Search element not found");
    	 
    }
	public static void main(String args[]){
		anyprog prog = new anyprog();
		prog.maxmin();
		//prog.traversematrix();
	}
}


