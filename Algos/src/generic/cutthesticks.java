package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class cutthesticks {
    protected static int findmin(List<Integer> len){
    	int min=999999;
    	for(int i:len)
	    	 if (i<min)
	    	    min=i;
    	return min;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int min,n=Integer.parseInt(sc.nextLine());
	     String[] input = new String[n];
	     int[] elementsList = new int[n];
	     elementsList[0]=n;
	     
		 List<Integer> len=new ArrayList<Integer>();
		 
		 
		 input = sc.nextLine().split(" ");
		 for(int j=0;j<input.length;j++)
				 len.add(Integer.parseInt(input[j]));
		 
		Iterator<Integer> iter= len.iterator();
		System.out.println(len.size());
		
		while(!len.isEmpty()){
		min=findmin(len);
		int lencount=0;
		iter= len.iterator();
		while(iter.hasNext()){
			lencount++;
			int temp=iter.next();

			if(temp>min)
				{
				 len.set(lencount-1,temp-min);			 
				}
			else
				{
				iter.remove();
				lencount--;
				}
			
		}
		
	    if(len.size()!=0)System.out.println(len.size());
			 
	}
	}
}

