package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MaxminSubstr {
	static boolean _isbigbool = false;
	static boolean _issmallbool = false;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	TreeMap<Character,ArrayList<Integer>> charmap = new TreeMap<Character,ArrayList<Integer>>();
	
	char [] charlist= s.toCharArray();

	for(int i=0;i<s.length();i++){
		char key =charlist[i];
		if (charmap.containsKey(key))
				{
				 ArrayList<Integer> arr = new ArrayList<Integer>();
				 arr=charmap.get(key);
				 arr.add(i);
				 charmap.put(key,arr);
				}
		else{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(i);
			charmap.put(key,arr);
		}
	}
	
	
	int n =Integer.parseInt(sc.nextLine());
	/*
	for(Map.Entry<Character, ArrayList<Integer>> entry : charmap.entrySet()){
		
	}
	*/

	Object[] keylist=charmap.keySet().toArray();
	int keysize = keylist.length;
	
	char smallkey=(char) keylist[0];
	char bigkey=(char) keylist[--keysize];
	ArrayList<Integer> smallindex=charmap.get(smallkey);
	ArrayList<Integer> bigindex=charmap.get(bigkey);
	
	while((bigkey>=0) && (_isbigbool==false) && keysize>1){
		calculateSubstr(_issmallbool,_isbigbool,smallkey,smallindex,bigkey,bigindex,n,charlist.length,charlist);
		bigkey=(char)keylist[keysize--];
		bigindex=charmap.get(bigkey);
	}
	
	}
	
	static void calculateSubstr(boolean _issmall,boolean _isbig,char small,ArrayList<Integer> smallindex,char big,ArrayList<Integer> bigindex,int size,int max,char[] charlist){
		if(!_issmall){
		for(int i=smallindex.size()-1;i>=0;){
			if(smallindex.get(i)>(max-size))
				i--;
			else
			{   int index=smallindex.get(i);
				System.out.println(charlist[index]+""+charlist[index+1]+""+charlist[index+2]);
				_issmallbool=true;
				break;
			}
		}
		}
		
		if(!_isbig){
			for(int i=bigindex.size()-1;i>=0;){
				if(bigindex.get(i)>(max-size))
					i--;
				else
				{   int index=bigindex.get(i);
					System.out.println(charlist[index]+""+charlist[index+1]+""+charlist[index+2]);
					_isbigbool=true;
					break;
				}
			}
			} // missing case abcsza, abcsaz ( compare sza,saz)
		

	}
	
	
}
