package generic;

import java.util.ArrayList;
import java.util.List;

public class stringreverse {

	public String revstring(String text){
		
		List<String> textsplit = new  ArrayList<String>();
		int listlength;
		//System.out.println("Original String ="+text);
		for (String a : text.split(" "))
			textsplit.add(a);
		listlength=textsplit.size();
		text="";
		for(int i=listlength-1;i>=0;i--)
			if(i==0)
				text+=textsplit.get(i);
			else
				text+=textsplit.get(i)+" ";
		//System.out.println("Reversed String ="+text);
       return text;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	}

}
