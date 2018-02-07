package e09TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringLights = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(bufferedReader.readLine());
        
		while (n > 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < stringLights.length ; i++) {
				stringLights[i] = TrafficLightsStares.valueOf(stringLights[i]).next().name();
				sb.append(stringLights[i]).append(" ");
			}
			System.out.println(sb.toString().trim());
			n--;
		}
	}
}
