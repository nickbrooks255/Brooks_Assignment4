package brooks_problem2;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	private Map<String, Integer> wordCounter;
	  
	   //per rubric, counts of duplicate stores in variable named wordCounter
	   public DuplicateCounter(){
		   
	       wordCounter = new HashMap<String,Integer>();
	   }
	  
	   public void count(String dataFile){
	       
	       Scanner scan = null;
	       
	       try {
	    	   
	           scan = new Scanner(new File(dataFile));   
	       }
	       
	       catch (Exception fileExcept) {
	    	   
	           return;
	       }
	      
	       
	       while(scan.hasNext()) {
	    	   
	    	   //changing to lowercase makes it so every word is counted without worrying about capitalization
	           String word = scan.next().toLowerCase();
	           Integer count = wordCounter.get(word); 
	           
	           if(count == null)
	               count = 1;
	           
	           else
	               count = count + 1;
	           
	           wordCounter.put(word, count);
	       }
	       
	       scan.close();
	   }
	   
	   public void write(String outputFile){
	       
	       try {
	           PrintWriter out = new PrintWriter(new File(outputFile));
	           
	           for(String n : wordCounter.keySet()) {
	        	   
	               out.println(n + " " + wordCounter.get(n));
	           }
	           
	           out.close();
	           
	       } 
	       
	       catch (Exception fileExcept) {
	           
	       }
	   }
	
	
}