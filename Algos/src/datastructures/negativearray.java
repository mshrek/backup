package datastructures;

import java.util.Scanner;

public class negativearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int n = Integer.parseInt(sc.nextLine());
	     int[] arr = new int[n];
	     String[] slist = sc.nextLine().split(" ");
	     for (int x=0;x<slist.length;x++){
	    	 arr[x]=Integer.parseInt(slist[x]);
	     }
	     int count=0;
	  
	     for(int i=0;i<n;i++){
	    	 int j=i;
	    	 int sum=0;
	    	 for(;j>=0;j--){
	    		 sum+=arr[j];
	    		 if(sum<0)
	    			 count+=1;
	    	 }
	     }
	     System.out.println(count);
	}

}
