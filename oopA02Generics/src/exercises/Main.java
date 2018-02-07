package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		String line;
//		CustomList<String> list = new CustomList<>();
//		
//		while ((line = reader.readLine()) != null && !line.equals("END")) {
//			CommandInterpreter.interpretCommand(line.split("\\s+"), list);
//		}
//		
	    line = reader.readLine();                                     
		Threeuple<String, String, String> first = new Threeuple<>(line.split("\\s+")[0] + " "+ line.split("\\s+")[1] , 
				line.split("\\s+")[2], line.split("\\s+")[3]);
		line = reader.readLine();                                     
		Threeuple<String, Integer, Boolean> second = new Threeuple<>(line.split("\\s+")[0], Integer.parseInt(line.split("\\s+")[1]), 
				line.split("\\s+")[2].equals("not")? false : true);
		line = reader.readLine();                                     
		Threeuple<String, Double, String> third = new Threeuple<>(line.split("\\s+")[0], Double.parseDouble(line.split("\\s+")[1]), 
				line.split("\\s+")[2]);
		
		System.out.println(first.getItem1() + " -> " + first.getItem2()  + " -> " + first.getItem3());
		System.out.println(second.getItem1() + " -> " + second.getItem2() + " -> " + second.getItem3());
		System.out.println(third.getItem1() + " -> " + third.getItem2() + " -> " + third.getItem3());
	}	
}
