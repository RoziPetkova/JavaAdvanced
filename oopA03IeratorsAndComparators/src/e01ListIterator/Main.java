package e01ListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		Lake theLake = new Lake();
		
		while ((line = reader.readLine()) != null && !line.equals("END")) {
			theLake.setNumbers(line.split(", "));
		}
		
		List<Integer> output = new ArrayList<>();
		
		for (Integer num : theLake) {
			if (num % 2 !=0)
				output.add(num);
		}
		
		for (Integer num : theLake) {
			if (num % 2 ==0)
				output.add(num);
		}
		
		System.out.println(output.toString().replaceAll("[\\[\\]]", ""));
	}
}
