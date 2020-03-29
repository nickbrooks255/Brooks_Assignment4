package brooks_problem1;

public class Application {

	public static void main(String[] args) {
		
		DuplicateRemover dRemove = new DuplicateRemover();
		
		dRemove.remove("problem1.txt");
		dRemove.Write("unique_words.txt");

	}

}