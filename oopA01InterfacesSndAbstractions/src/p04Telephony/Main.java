package p04Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> phoneNumbers = Arrays.asList(reader.readLine().split("\\s+"));
		List<String> webSites = Arrays.asList(reader.readLine().split("\\s+"));
		
		Smatrphone phone = new Smatrphone();
		
			phone.call(phoneNumbers);
			phone.brows(webSites);
		
	}
}
