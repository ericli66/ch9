
public class Calc {
	
	public static void main (String[] args) {
		if (args.length < 2){
			System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
			return;
		}
		
		String com = args[0];
		int value = Integer.parseInt(args[1]);
		
		if(com.equals("mult")){
			for(int i = 2; i < args.length; i++){
				value *= Integer.parseInt(args[i]);
			}
		} else if(com.equals("add")){
			for(int i = 2; i < args.length; i++){
				value += Integer.parseInt(args[i]);
			}
		} else if(com.equals("max")){
			for(int i = 2; i < args.length; i++){
				if (Integer.parseInt(args[i]) > value) value = Integer.parseInt(args[i]);
			}
		} else if(com.equals("min")){
			for(int i = 2; i < args.length; i++){
				if (Integer.parseInt(args[i]) < value) value = Integer.parseInt(args[i]);
			}
		} else {
			System.err.println("Unknown operateion: " + com);
		}
		
		
		System.out.println(value);
	}
}
