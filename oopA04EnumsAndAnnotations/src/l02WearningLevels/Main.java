package l02WearningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Logger logger = new Logger(reader.readLine());
		while ((line = reader.readLine()) != null && !line.equals("END")) {
			String[] params = line.split(":\\s+");
			logger.receiveMessage(params[0], params[1]);
		}
		
		for (Message m : logger.getMessages()) {
			System.out.println(m.toString());
		}
	}
}
