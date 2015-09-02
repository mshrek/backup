package generic;

import java.util.Scanner;

public class angryprofessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int student_in=0,n = Integer.parseInt(sc.nextLine());
		String[] output= new String[n];
		
		for(int i =0;i<n;i++){
			student_in=0;
			String l1 = sc.nextLine();
			String l2 = sc.nextLine();
			String[] l1list=l1.split(" ");
			String[] l2list=l2.split(" ");
			int N = Integer.parseInt(l1list[0]);
			int K = Integer.parseInt(l1list[1]);
			
			int[] numlist=new int[N];
			
			for(int j=0;j<N;j++)
				if(Integer.parseInt(l2list[j])<=0)
						student_in++;
				
			if(student_in<K)
			    	output[i]="YES";						
		    else
			        output[i]="NO";
			
				
		}
		for(String op: output)	
		   System.out.println(op);

	}

}
