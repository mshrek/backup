package datastructures;

public class longseq {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char[] D={'4','3'};
        char[][] L=new char[D.length][D.length];
        for(int i=0;i<D.length;i++)
        	for(int j=0;j<i;j++)
        		if(D[j]<D[i] && L[i].length<L[j].length+1)
        			L[i]=L[j];
            L[i]
        System.out.println(L[D.length-1]);

	}

}
