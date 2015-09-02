package generic;

import java.util.Scanner;

public class squareint_eff1 {
     	//efficient sorting using binary search

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] numlist=new int[n];
		int counter=0;
		for(int i=0;i<n;i++)
		{		
			String[] inputString = sc.nextLine().split(" ");
			int a=Integer.parseInt(inputString[0]);
			int b=Integer.parseInt(inputString[1]);
			int diff=(int) (Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a)))+1;
	    	System.out.println(diff);

	}

	}
}
