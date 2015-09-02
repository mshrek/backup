import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,3,5,2,2,4,11,7,6,9,10};
		Stack<Integer> evenarr = new Stack<Integer>();
		Stack<Integer> oddarr = new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2==0)
				evenarr.add(arr[i]);
			else
				oddarr.add(arr[i]);
		
		for(int j=0;j<arr.length;j++)
			{
			if(j%2==0)
				System.out.println(evenarr.pop());				 
			else
				System.out.println(oddarr.pop());
				 
			}
		
	}

}
