package generic;

import java.util.Scanner;

public class alpharotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int ascii,len = sc.nextInt();
    String inputString = sc.next();
    int factor=sc.nextInt();
    
    char[] chararray = inputString.toCharArray();
    for(char ch : chararray)
    	{
    	 ascii=ch;
    	 if((ascii>='A'&&ascii<='Z'))
    		 {if(ascii+factor%26<='Z')
    		    ascii+=factor%26;
    		  else
    			 ascii=ascii+factor%26-1-'Z'+'A';
    		 }
    	 if((ascii>='a'&&ascii<='z'))
		 {
    	 if(ascii+factor%26<='z')
		    ascii+=factor%26;
		  else
			 ascii=ascii+factor%26-1-'z'+'a';
		 }
    	 
    	 System.out.print(Character.toChars(ascii));
    	}
	}
}
