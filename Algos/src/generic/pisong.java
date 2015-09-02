package generic;

import java.util.Scanner;

public class pisong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		
		String output="",mainpattern="31415926535897932384626433833";
		String[] outputlist= new String[n];
		for(int j=0;j<n;j++){
			int spacecount=0,count=0;
			output="";
			String input= sc.nextLine();
			char[] inputchar = input.toCharArray();
			for(int i=0;i<inputchar.length;i++)
				{
				
				if(inputchar[i]>='a' && inputchar[i]<='z' || inputchar[i]>='A' && inputchar[i]<='Z' )
                  count++;
				if(inputchar[i]==' ')
				  { spacecount+=1;
					output+=count;
					count=0;
				
				}
				  }
			if(spacecount==0)
				output+=count;
			outputlist[j]=output;
				}
		for(String s:outputlist)
			{
			 
			 char[] chlist1=s.toCharArray();
			 char[] chlist2=mainpattern.toCharArray();
			 boolean flag=false;
			 
			 for(int m=0;m<chlist1.length;m++)
				 {
				 
				 if(chlist1[m]==chlist2[m])
					 flag=true;
			     else
					{
			    	 flag=false;
			    	 break;
					}
				 }
			 
			 if(!flag)
			 	System.out.println("It's not a pi song.");
			 else
				System.out.println("It's a pi song.");
			}
		      
	}
}
