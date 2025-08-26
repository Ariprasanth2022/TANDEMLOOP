package TANDEMLOOP;

import java.util.HashMap;
import java.util.Map;

public class CountOfNumber {
	    public static void main(String[] args) {
	        // Input array
	        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

	        // Map to store counts of multiples for numbers 1 to 9
	        Map<Integer, Integer> multiplesCount = new HashMap<>();

	        // Initialize map with 0 counts
	        for (int i = 1; i <= 9; i++) {
	            multiplesCount.put(i, 0);
	        }

	        // Count multiples
	        for (int num : arr) {
	            for (int i = 1; i <= 9; i++) {
	                if (num % i == 0) {
	                    multiplesCount.put(i, multiplesCount.get(i) + 1);
	                }
	            }
	        }

	        // Print result
	        System.out.println(multiplesCount);
	    }

}
