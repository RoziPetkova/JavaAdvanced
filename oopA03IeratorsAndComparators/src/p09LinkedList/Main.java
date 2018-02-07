package p09LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		String line;
		CustomList<String> list = new CustomList<>();
			
//		while ((line = reader.readLine()) != null && !line.equals("END")) {
//			CommandInterpreter.interpretCommand(line.split("\\s+"), list);
//		}
		int counter = Integer.parseInt(reader.readLine());
		while (counter > 0 ) {
			line = reader.readLine();
			CommandInterpreter.interpretCommand(line.split("\\s+"), list);
			counter --;
		}
		System.out.println(list.getSize());
		System.out.println(String.join(" ", list));
		
	}	
}
