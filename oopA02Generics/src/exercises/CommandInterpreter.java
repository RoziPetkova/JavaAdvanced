package exercises;

public class CommandInterpreter {

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void interpretCommand(String[] commands, CustomList<T> list) {
		switch (commands[0])
        {
            case "Add": // Add <element> - Adds the given element to the end of the list
                list.add((T)commands[1]);
                break;
            case "Remove": // Remove <index> - Removes the element at the given index
                list.remove(Integer.parseInt(commands[1]));
                break;
            case "Contains": // Contains <element> - Prints if the list contains the given element (True or False)
            	System.out.println(list.contains((T)commands[1]));
                break;
            case "Swap": // Swap <index> <index> - Swaps the elements at the given indexes
            	list.swap(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                break;
            case "Greater": // Greater <element> - Counts the elements that are greater than the given element and prints their count
                System.out.println(list.countGreaterThan((T)commands[1]));
                break;
            case "Max": // Max - Prints the maximum element in the list
            	System.out.println(list.getMax());
                break;
            case "Min": // Min - Prints the minimum element in the list
            	System.out.println(list.getMin());
                break;
            case "Print": // Print - Prints all elements in the list, each on a separate line
                list.print();
                break;
            case "Sort": // Print - Prints all elements in the list, each on a separate line
                list.sort();
                break;
            default:
                break;
        }
	}
}