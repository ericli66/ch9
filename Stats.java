import java.util.Arrays;
public class Stats{
	
	public static void main (String[] args) {
		if (args.length == 0){
			System.err.println("Usage: java Max <numbers>");
			return;
		}
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        double average = 0;
        int count = 0;
        
        for(String arg : args) {
			int value = Integer.parseInt(arg);
			if (value > max) max = value;
			if (value < min) min = value;
			sum += value;
			count ++;
		}
		
		average = sum/count;
		
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
		System.out.println("Min:: " + min);
		System.out.println("max: " + max);
		System.out.printf("Average: %.2f %n", average);
    }
}

