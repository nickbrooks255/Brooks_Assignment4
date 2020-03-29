package brooks_problem2;

public class Application {

	public static void main(String[] args) {
		   String FileIn = "problem2.txt";
	       String FileOut = "unique_word_counts.txt";
	       
	       //counter
	       DuplicateCounter Counter = new DuplicateCounter();
	       Counter.count(FileIn);
	       Counter.write(FileOut);
	}
}