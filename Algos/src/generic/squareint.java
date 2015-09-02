package generic;

import java.util.Scanner;

public class squareint {
	protected static int checksquare(int num){
		for(int i=1;i<=num/2;i++)
			if(i*i==num)
				return 1;
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] sum=new int[n],numlist=new int[n];
		int counter=0;
		for(int i=0;i<n;i++)
		{		
			String[] inputString = sc.nextLine().split(" ");
			int a=Integer.parseInt(inputString[0]);
			int b=Integer.parseInt(inputString[1]);
			int temp=0;
			for(int j=a;j<=b;j++)
				 temp+=checksquare(j);

			sum[counter]=temp;
			counter++;
		}
		
		for(int i:sum)
			System.out.println(i);

	}

}
