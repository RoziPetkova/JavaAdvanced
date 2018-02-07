package P04_DetailPrinter;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
	private String getName() {
        return name;
    }
}
