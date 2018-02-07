package p09LinkedList;

public class CommandInterpreter {

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void interpretCommand(String[] commands, CustomList<T> list) {
		switch (commands[0])
        {
            case "Add": // Add <element> - Adds the given element to the end of the list
                list.add((T)commands[1]);
                break;
            case "Remove": // Remove <index> - Removes the element at the given index
                list.remove((T)commands[1]);
                break;
            default:
                break;
        }
	}
}