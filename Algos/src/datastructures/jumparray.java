package datastructures;

import java.util.Scanner;

public class jumparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for(int t=0;t<T;t++){
			String[] _nmlist = sc.nextLine().split(" ");
			int n=Integer.parseInt(_nmlist[0]);
			int m=Integer.parseInt(_nmlist[1]);
			String[] _numlist = sc.nextLine().split(" ");
			int[] _numbers=new int[n];
			int[] _zeroindex =new int[n];
			int count=0;
			boolean flag=false;
			for(int x=0;x<_numlist.length;x++)
				{	
					_numbers[x]=Integer.parseInt(_numlist[x]);
					if(_numbers[x]==0)
						{
						 _zeroindex[count]=x;
						 count++;
						}
				}
		
			
			for(int j=0;j<_zeroindex.length;j++)
				{

				if (_zeroindex[j]+1==_zeroindex[j+1]){
					if((_zeroindex[j]+m)>_numbers.length-1)
					{
					 flag=true;
					 break;
					}				
				else if(_zeroindex[j]+m==_zeroindex[j+1])
				{   
					if((_zeroindex[j]+m)>_numbers.length-1)
					{
					 flag=true;
					 break;
					}
					j=j+m-1;
				}
					
				}  else
					  break;
		
					
				}
			
			if(!flag)
				System.out.println("NO");
			else
				System.out.println("YES");

	}
}
}