package datastructures;

import java.util.ArrayList;

/*
1 -> 3 -> 5 -> 6 -> NULL
2 -> 4 -> 7 -> NULL

15 -> NULL
12 -> NULL

NULL 
1 -> 2 -> NULL
*/
class Node{
	int data;
	Node next;
}
 
public class MergerLists {
	void MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
		double x = Math.sqrt(2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist1= new ArrayList<Integer>();
		ArrayList<Integer> arrlist2= new ArrayList<Integer>();
		arrlist1.add(1);
		arrlist1.add(3);
		arrlist1.add(5);
		arrlist1.add(6);
		
		arrlist2.add(2);
		arrlist2.add(4);
		arrlist2.add(7);
		
		Node A = new Node();
		Node B = new Node();
		Node HeadA=new Node();
		//Node HeadB = B;
		
		for(Integer a : arrlist1)
		{			
			Node temp = new Node();
			temp.data=a;
			temp.next=null;
			if(HeadA==null)
				{
				 HeadA = temp;
				 A = HeadA;
				}
				
			else
			{
				A.next=temp;
				A=A.next;
			}
		}
		
		
	}

}
