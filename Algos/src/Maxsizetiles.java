import java.util.Scanner;

public class Maxsizetiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String[] x = sc.nextLine().split(" ");
            int l = Integer.parseInt(x[0]),b=Integer.parseInt(x[1]);
            System.out.println((l*b)/(gcd(l,b)*gcd(l,b)));
        }
        
	}
	
	static int gcd(int l,int b){
		if(b==0) return l;
		return gcd(b,l%b);
		
	}

}
