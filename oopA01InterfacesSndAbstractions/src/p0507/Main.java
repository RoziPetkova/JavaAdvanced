package p0507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//	List<Citizen> citizens = new ArrayList<>();
		String[] params;
		String line;
		int counter = Integer.parseInt(reader.readLine());
		Map<String, Buyer> buyers = new HashMap<>();
		
		while (counter > 0) {
			params = reader.readLine().split("\\s+");
			if (params.length == 4) 
				buyers.putIfAbsent(params[0], new Citizen(params[0], Integer.parseInt(params[1]), params[2], params[3]));
			else 
				buyers.putIfAbsent(params[0], new Rable(params[0], Integer.parseInt(params[1]), params[2]));
			counter--;
		}
		
		while ((line = reader.readLine()) != null && !line.equals("End")) {
			if(buyers.containsKey(line))
				buyers.get(line).buyFood();
		}
		
		System.out.println(buyers.values().stream().mapToInt(x -> x.getFoodAmmound()).sum());
	}

}
