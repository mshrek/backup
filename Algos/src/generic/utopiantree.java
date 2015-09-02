package generic;

import java.util.Scanner;

public class utopiantree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] hlist=new int[n];
		for(int i=0;i<n;i++){
			int height=1;
			int cycle = sc.nextInt();
			for(int j=1;j<=cycle;j++)
			{
				if(j%2==0)
					height+=1;
				else
					height*=2;
			}
			hlist[i]=height;
		}
		for(int i: hlist)
			System.out.println(i);
		
	}

}
