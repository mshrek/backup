package generic;

import java.math.BigInteger;
import java.util.Scanner;

public class bigint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	     int n = sc.nextInt();
	     BigInteger fact = new BigInteger("1");
	     for(int i=1;i<=n;i++)
	            fact=fact.multiply(BigInteger.valueOf(i));
	     System.out.print(fact);
	}

}
