import java.util.ArrayList;
import java.util.List;

/**
 * author: Megha
 * Lambda Expression and Stream API
 * */
public class StreamLambda {

	static List<String> names=new ArrayList<String>();
	
	public static List<String>  getSurnames() {
		
		names.add("Megha , Sharma");
		names.add("Priyank , Sharma");
		names.add("Kartik , Sharma");
		names.add("Anita , Sharma");
		names.add("R P , Sharma");
		
		names.add("Megha , Kaushik");
		names.add("Priyank , Kaushik");
		names.add("Kartik , Kaushik");
		names.add("Anita , Kaushik");
		names.add("R P , Kaushik");
		
		return names;
	
	}
	
	public static void main(String[] args) {
		
		List<String> mySurnames=getSurnames();
		System.out.println("Surname with kaushik");
		
		mySurnames.stream().filter((p) -> p.endsWith("Kaushik"))
		.map((p) -> p.toUpperCase()).sorted().forEach((p) -> System.out.println(p));
		
        
		
	}

}
