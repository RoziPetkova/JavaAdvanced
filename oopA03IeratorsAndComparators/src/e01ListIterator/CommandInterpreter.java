package e01ListIterator;

import java.util.Arrays;

public class CommandInterpreter {

	public static <T extends Comparable<T>> void interpretCommand(String[] commands, ListyIterator list) {
		switch (commands[0]) {
		case "Create":
			list.create(Arrays.asList(commands).subList(1, commands.length));
			break;
		case "Print":
			try {
				System.out.println(list.print());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			break;
		case "Move":
			System.out.println(list.move());
			break;
		case "HasNext":
			System.out.println(list.hasNext());
			break;
		case "PrintAll":
			for (Integer n : list) {
				System.out.print(n + " ");
			}
			System.out.println();
			break;
		case "Push":
			list.push(Arrays.asList(commands).subList(1, commands.length));
			break;
		case "Pop":
			try {
				list.pop();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			break;
		default:
			break;
		}
	}
}