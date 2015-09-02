package generic;

import java.awt.List;
import java.util.LinkedList;

public class shortestPath {
    static int rows=10,cols=10;
    protected static void makeRandomMaze(boolean maze[][]){
    	    for(int i=0;i<rows;i++)
    	    	for(int j=0;j<cols;j++)
    	    		maze[i][j]= (int) (Math.random() * 3) == 1;
    	    maze[0][0] = false;
    	    maze[maze.length - 1][maze[0].length - 1] = false;
    		}
    	
    protected static void printMaze(boolean maze[][]){
    	for(int i=0;i<rows;i++)
	    	{
    		for(int j=0;j<cols;j++)
	    		{
	    		if(maze[i][j])
	    			System.out.print("#|");
	    		else
	    			System.out.print("_|");
	    		}
    	    System.out.println();
	    	}
    }
    
private static class Cell{
     public int row;
     public int col;

     public Cell(int row, int column)
     {
      this.row = row;
      this.col = column;
     }

     @Override
     public boolean equals(Object obj)
     {
      if (this == obj)
       return true;
      if ((obj == null) || (obj.getClass() != this.getClass()))
       return false;
      
      Cell cell = (Cell) obj;
      if (row == cell.row && col == cell.col)
       return true;
      return false;
     }

     @Override
     public String toString()
     {
      return "(" + row + "," + col + ")";
     }
}

protected static List findShortestPath(boolean[][] maze){
	int[][] levelMatrix = new int[maze.length][maze[0].length];
	LinkedList < cell > path = new LinkedList < cell >();
	return path;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 boolean[][] maze = new boolean[rows][cols];
		 makeRandomMaze(maze);
		 printMaze(maze);
		 
		 List path = findShortestPath(maze);
		 if (path == null)
		  {
		   System.out.println("No path possible");
		   return;
		  }
		 for (Cell cell : path)
		   System.out.print(cell + ",");
		 }


}
