package exercises.pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final String TERMINATIND_COMMAND = "HARVEST";
		Class<RichSoilLand> theClass = RichSoilLand.class;
		Field[] fields = theClass.getDeclaredFields();
		
		String line;
		
		while ((line = reader.readLine()) != null && !(line.equals(TERMINATIND_COMMAND ))) {
			for (Field field : fields) {
				if(executeCommand(line, field))
				System.out.printf("%s %s %s\n", 
						Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
			}
		}
		
	}
	
	public static boolean executeCommand(String command, Field field){
		switch (command) {
		case "private":
			// print all private fields
			return Modifier.isPrivate(field.getModifiers());
		case "protected":
			//print all protected fields
			return Modifier.isProtected(field.getModifiers());
		case "public":
			// print all public fields
			return Modifier.isPublic(field.getModifiers());
		case "all":
			// print all declared fields
			return true;
		default:
			return false;
		}
	}
}
