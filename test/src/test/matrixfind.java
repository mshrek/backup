package test;

public class matrixfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int x=17,i=0,j=mat.length-1;
		System.out.println("Starting element = "+mat[0][2]);
		boolean flag=true;
		while(i<mat[0].length && j>=0)
		{	if (mat[i][j]==x)
				{
				System.out.println("Element found at index i="+(i+1)+"and j="+(j+1));
				return;
				}
			if(mat[i][j]>x)
				{
					System.out.println("current element = "+mat[i][j]);
					j--;
				}
			else{
				
					System.out.println("current element = "+mat[i][j]);
					i++;
				}
			
		}
		if(flag)
			System.out.println("Element not found");
		
	}

}
