import java.util.Arrays;

public class Longest {
	
	public static void main (String[] args) {
		if (args.length == 0){
			System.err.println("Usage: java Max <numbers>");
			return;
		}
		
		String longest = args[0];
		String first = args[0];
		
		for(String arg : args) {
			if (arg.length() > longest.length() ) longest = arg;
			if (arg.compareTo(first) < 0) first = arg;
		}
		
		System.out.println("Longest: " + longest + " (" + longest.length() + " letters)");
		System.out.println("First alphabetically : " + first);
	}
}

