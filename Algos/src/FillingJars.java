import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FillingJars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
		HashMap<Integer,Integer> mapval = new HashMap<Integer,Integer>();
		for(int i=1;i<=n;i++)
			mapval.put(i, 0);
		for(int j=0;j<k;j++){
			String[] input = sc.nextLine().split(" ");
			int a=Integer.parseInt(input[0]),b=Integer.parseInt(input[1]),c=Integer.parseInt(input[2]);
			for(int x =a;x<=b;x++){
				int temp=mapval.get(x);
				mapval.put(x, temp+c); 
			}
			
		}
		
		int sum=0;
		for(Map.Entry<Integer, Integer> entry : mapval.entrySet()){
			sum+=entry.getValue();
		}
		System.out.println(sum/n);
	}

}
