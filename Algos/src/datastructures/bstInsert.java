package datastructures;

import java.io.Console;
import java.util.Scanner;

public class bstInsert {

	protected bstInsert left;
	protected bstInsert right;
	protected int data;
	
	public bstInsert(int data){
		this.data = data;
	}
	
public static void  main(String args []){
bstInsert root = new bstInsert(10);
insert(root);
printtree(root);
}

protected static void insert(bstInsert parent){
boolean flag=true;
do{
Scanner scan = new Scanner(System.in);
System.out.println("Parent node value = "+ parent.data);
System.out.println("Enter new node value ");

int nodeVal = scan.nextInt();
filldata(parent,nodeVal);
System.out.println("Enter more nodes !?(Y/N)");
String input = scan.next();
System.out.println(input);
if(input.equals("N"))
	flag=false;
System.out.println(flag);
} while(flag==true);
}

protected static void filldata(bstInsert parent,int nodevalue){
	if(parent.data<nodevalue)
		{
		 if(parent.right==null)
			 parent.right = new bstInsert(nodevalue);
		 else
			 filldata(parent.right,nodevalue);
		
		
		}

	if(parent.data>nodevalue)
	{
		
		 if(parent.left==null)
			 parent.left = new bstInsert(nodevalue);
		 else
			 filldata(parent.left,nodevalue);
	}
	
}

protected static String printtree(bstInsert parent){

	System.out.println("   "+parent.data);
	System.out.println("/		 \\");
	String nullprinter="";
	System.out.println(nullprinter);
	if(parent.left!=null)
		nullprinter=printtree(parent.left);
	else	
		nullprinter="leftNULL";
 	
	if(parent.right!=null)
		nullprinter=printtree(parent.right);	
	else
		nullprinter="rightNULL";
	
	
	
	/*
	if(parent.left!= null)
		System.out.println(parent.left.data);
	else
		System.out.println("NULL");
	if(parent.right!=null)
		System.out.println(parent.right.data);
	else
		System.out.println("NULL");
		*/
	return nullprinter;
}

}

