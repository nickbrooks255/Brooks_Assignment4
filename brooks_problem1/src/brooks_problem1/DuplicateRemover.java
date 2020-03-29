package brooks_problem1;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DuplicateRemover {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	   private Set<String> uniqueWords;
	   
	   //method remove to remove duplicate words
	   public void remove(String dataFile) {
		   Scanner scan = null;
	       try {
	    	   
	            uniqueWords = new HashSet<>(); 
	            //scanner to read file
	            scan = new Scanner(new File(dataFile)); 
	            
	            //reads file
	            while(scan.hasNextLine()) 
	            {
	            	//reads nextLine and converts to lowercase to ensure accuracy of unique words
	            	//& splits up the words using new line
	                String line = scan.nextLine().toLowerCase(); 
	                String[] words= line.split("\n"); 
	                
	                //adds words to the set
	                for(int i = 0; i < words.length; i++) {
	                    String str = words[i]; 
	                    uniqueWords.add(str); 
	                }
	            }

	        }
	       
	        catch(Exception except) 
	        {
	            System.out.println("Error opening: " + dataFile);
	        }
	        
	            scan.close();


	    }
	   
  
   //write set to outputfile
   public void Write(String outputFile) {
	   
	   FileWriter fileO = null;
	   
	   //try block opens file, searches through uniquewords, writes to file, then closes the file
       try {
    	   fileO = new FileWriter(outputFile); 
           		for(String s:uniqueWords) 
           			fileO.write(s+"\n"); 
           fileO.close(); 
       }
       
       catch(Exception except)
       {
    	   
           System.out.println("Error writing: "+outputFile);
       }

   }

}

