package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class snakesandladders {
    static int calculateSteps(int[] board,int n){
    	
    	boolean[] visited=new boolean[n];
    	for(int i=0;i<n;i++)
    		visited[i]=false;
    	
    	Queue <queueEntry> q = new LinkedList<queueEntry>();
    	visited[0]=true;
    	queueEntry s = new queueEntry();
    	s.distance=0;
    	s.vertex=0;
    	q.add(s);
    	
    	queueEntry qe= new queueEntry();
    	while(!q.isEmpty()){
    		qe= q.peek();
    		int vertex = qe.vertex;
    		if(vertex==n-1)
    			break;
    		q.remove();
    		
    	for(int i = vertex+1;i<=vertex+6 && i<n;i++){
    		if(visited[i]==false){
    			queueEntry cell = new queueEntry();
    			cell.distance=qe.distance+1;
    			visited[i]=true;
    			if(board[i]!=-1){
    				cell.vertex=board[i];
    			}
    			else{
    				cell.vertex=i;
    			}
    			q.add(cell);
    		}
    	}
    	}
    	return qe.distance;
    }
    
    static class queueEntry{
    	int vertex;
    	int distance;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] board = new int[100];
		for(int i=0;i<board.length;i++){
			board[i]=-1;
		}
		//ladders
		board[31]=61;
		board[41]=67;
		board[12]=97;
		
		//snakes
		board[94]=12;
		board[96]=24;
		board[92]=36;
		board[78]=26;
		board[74]=18;
		board[48]=46;
		board[66]=16;
		
		System.out.println(calculateSteps(board,100));
	}

}
