package p04_recharge;

public abstract class Worker implements Rechargeable, Sleeper {

    @SuppressWarnings("unused")
	private String id;
    @SuppressWarnings("unused")
	private int workingHours;

    public Worker(String id) {
        this.id = id;
    }

    public void work(int hours) {
        this.workingHours += hours;
    }
}
