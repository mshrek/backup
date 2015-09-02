import java.util.Scanner;

public class Listrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
		int size = Integer.parseInt(sc.nextLine());
		int[] arr = new int[size];
		for(int j=0;j<size;j++){
			arr[j]=j;
		}
		rotateArr(arr);
		}
		
	}
	
	static void rotateArr(int[] arr){
		int i=0;
		int size=arr.length;
		while(i!=size){
			for(int j=0;j<=(size-i)/2;j++){
				int temp=0;
				int k=j+i;
				temp=arr[k];
				arr[k]=arr[size-1-k];
				arr[size-1-k]=temp;
			}
			i++;
	}
}

}
