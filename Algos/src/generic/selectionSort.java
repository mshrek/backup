package generic;
/*pseudo code
 * 1.Assign min value to element at index=0.
 * 2.Traverse the array and compare the value of each element with the min value.
 * 3.If element value < min value, note down the index of the array element.
 * 4.If end of the array is reached, swap the new minimum array element with previous minimum array element.
 * 5.Repeat the process till the end of the array.
 */ 
public class selectionSort {
	protected static void sort(){
		int[] arr = { 1,2,-1,100,-23,34,-20,51,78};
		System.out.println("Original array ");
		printsortedArray(arr);
		System.out.println();
		int min,swapindex=-1,temp;
		for(int i=0;i<arr.length;i++)
			{	
			System.out.println("####ITERATION NUMBER = "+(i+1)+" #####");
			min=arr[i];
			swapindex=i;
			for(int j=i+1;j<arr.length;j++)
			{  
			   System.out.println("Minimum value "+min);
			   if(arr[j]<min)
				  {
				   min=arr[j];
				   swapindex=j;
				  }
			}
			temp=arr[i];
			arr[i]=arr[swapindex];
			arr[swapindex]=temp;
			System.out.println("Sorted array after "+(i+1)+" iteration:");
			printsortedArray(arr);
			System.out.println();
			}
		System.out.println();
		System.out.println("Final sorted array");
		printsortedArray(arr);
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
