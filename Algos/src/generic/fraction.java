package generic;

import java.util.Scanner;

public class fraction {

	
	
	public static void main(String[] args) {
		int poscounter=0,negcounter=0,zercounter=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();     
        String inval = in.nextLine();
        while((n-->0) && (in.hasNextInt())){
        	int val = in.nextInt();        	
            if(val>0)
                poscounter++;
            else if (val <0)
                negcounter++;
            else
                zercounter++;
        }
        float total=poscounter+negcounter+zercounter;
        System.out.println(String.format("%.3f",(poscounter/total)));
        System.out.println(String.format("%.3f",(negcounter/total)));
        System.out.println(String.format("%.3f",(zercounter/total)));
    
	}

}
