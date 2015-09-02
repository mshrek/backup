package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Map <String,Long> namephone= new HashMap<String,Long>();
        String name="";
        long number=0;
        for(int i=0;i<2*n;i++){
            if(i%2==0)
                {
                name=sc.nextLine();
                }
            else
                {
                number=Integer.parseInt(sc.nextLine());
                namephone.put(name,number);
                name="";
                }
        }
        while(sc.hasNext()){
        	String searchname=sc.nextLine();
        	if(namephone.get(searchname) != null){
        		System.out.println(searchname+"="+namephone.get(searchname));
        	}
        	else
        		System.out.println("Not found");
        }
        

	}

}
