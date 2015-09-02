import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class BusStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
			
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<n;i++)
			stack.push(sc.nextInt());
			
		Iterator<Integer> iter = stack.iterator();
		int max=0,sum=0;
		while(iter.hasNext()){
			int temp=iter.next();
			if(temp>max)
				max=temp;
			sum+=temp;
		}
		
		//System.out.println("max ="+max+" "+"sum ="+sum);
		for(int val=max;val<=sum;val++)
		{	int temp = val;
			for(int j=0;j<stack.size();j++)
			{
				
			}
		}
		
			
	}

}
