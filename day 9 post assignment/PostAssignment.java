package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostAssignment {
	



	    public static void main(String[] args) {

	        String input = "12,5,7,1,19";

	        String result = sortCommaSeparatedNumbers(input);

	        System.out.println(result);

	    }

	    public static String sortCommaSeparatedNumbers(String input) {

	        if (input == null || input.trim().isEmpty()) {

	            return "";

	        }

	        String[] parts = input.split(",");

	        List<Integer> numbers = new ArrayList<>();

	        for (String part : parts) {

	            part = part.trim();

	            try {

	                int num = Integer.parseInt(part);

	                numbers.add(num);

	            } catch (NumberFormatException e) {

	                System.out.println("Invalid number skipped: " + part);

	            }

	        }

	        Collections.sort(numbers);

	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < numbers.size(); i++) {

	            sb.append(numbers.get(i));

	            if (i < numbers.size() - 1) {

	                sb.append(",");

	            }

	        }

	        return sb.toString();

	    }

	

}
