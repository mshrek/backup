package titbits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileReader {
	 protected static void writeFile(String answerData) throws java.io.IOException{
	        String data = answerData;
	        File file = new File(SavedanswerPath);
	        try{
	        if(!file.exists()){
	            System.out.println("File does not exist");
	            file.createNewFile();
	        }

	            try (FileWriter fileWriter = new FileWriter(file,true); BufferedWriter bufferWriter = new BufferedWriter(fileWriter)) {
	                bufferWriter.write(data);
	            }
	   
	    }
	        catch(IOException e){
	    	}
	    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writeFile("checking");

	}
    private static String SavedanswerPath = "/Users/srikanth.mannepalle/Desktop/filewrite.txt";
}
