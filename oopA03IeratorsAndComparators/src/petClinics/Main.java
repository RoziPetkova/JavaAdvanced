package petClinics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import petClinics.logic.CommandInterpreture;

public class Main {

    public static void main(String[] args) {
    	CommandInterpreture commandInterpreter = new CommandInterpreture();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    	String input;
        int commandsCount = 0;

        try {
            commandsCount = Integer.parseInt(reader.readLine());
        } catch (IOException ignored) {
            return; // FIXME FIXME XXX XXX
        }

        while (commandsCount-- > 0) {

            try {
                input = reader.readLine();
            } catch (IOException ignored) {
                return;
            }

            commandInterpreter.readCommand(input);
        }
    }
}