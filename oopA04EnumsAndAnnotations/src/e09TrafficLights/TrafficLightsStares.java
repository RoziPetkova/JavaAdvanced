package e09TrafficLights;

public enum TrafficLightsStares {
	RED, GREEN, YELLOW;

	private static TrafficLightsStares[] values = values();
	
	public TrafficLightsStares next() {
	//	System.out.println(0%3);
		return values[(this.ordinal() + 1) % values.length];
	}
}
