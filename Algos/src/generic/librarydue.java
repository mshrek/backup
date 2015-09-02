package generic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class librarydue {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String actualdate = sc.nextLine();
		String expecteddate=sc.nextLine();		
		String[] aclist= actualdate.split(" ");
		String[] exlist= expecteddate.split(" ");
		int[] acnumlist=new int[3],exnumlist=new int[3];
		long fine=0;
		for(int i=0;i<aclist.length;i++)
			{	
			 acnumlist[i]=Integer.parseInt(aclist[i]);
			 exnumlist[i]=Integer.parseInt(exlist[i]);
			}
			
		boolean yrflag = acnumlist[2]>exnumlist[2];
		boolean mthflag = acnumlist[1]>exnumlist[1];
		boolean dayflag = acnumlist[0]>exnumlist[0];
		
		if(yrflag)
		  fine=10000;
		else if(acnumlist[2]<exnumlist[2])
			 fine=0;
		     else if(mthflag)
			     fine=(acnumlist[1]-exnumlist[1])*500;
		         else if (acnumlist[1]==exnumlist[1])
		              if(dayflag)
		            	 fine=15*(acnumlist[0]-exnumlist[0]);
		              else
		            	 fine=0;
		              else
		        	     fine=0;

		System.out.println("Total fine = "+ fine);
	}

}
