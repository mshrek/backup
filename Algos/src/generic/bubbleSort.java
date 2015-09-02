package generic;

/*pseudo code
 * 1.Start with index 0, compare the elements in pairs.
 * 2.Swap the heavier element with higher index. 
 * 3.Repeat this till the last element.
 * 4.At the end of the first iteration heaviest element will be at the last index
 * 5.Now start from second index and repeat steps 1-5 till the second last element.
 * 6.By the end of second iteration, the second heaviest element will be at the second last index
 * 7.Repeat till the last index
 *
 */

public class bubbleSort {
	
	protected  static void  sort(){
		int[] arr = {1,-1,0,100,3,4,23,78,91,23,11,51};
		System.out.println("Original Array:");
		printsortedArray(arr);
		
		for(int i=arr.length-1;i>1;i--)
			
		{   System.out.println("\n####STARTING ITERATION = "+(arr.length-i)+" #####");
			for(int j=0;j<i;j++)
			{   System.out.print("Array state during "+(j+1)+" comparison is ");	   
				if(arr[j]>arr[j+1])
					swap(arr,j); 
				printsortedArray(arr);
				System.out.println();
			}
			System.out.println();
			System.out.print("Sorted Array after "+(arr.length-i)+" iteration is :");
			printsortedArray(arr);
			System.out.println();
		}
		
		System.out.println("\n======Final Sorted Array====");
		printsortedArray(arr);
	}
    protected static void swap(int[] arr,int j){
    	int temp;
    	temp=arr[j];
    	arr[j]=arr[j+1];
    	arr[j+1]=temp;
    }
    
    protected static void  printsortedArray(int [] arr){
    	for(int i : arr)
			System.out.print(i+" ");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort();

	}

}
