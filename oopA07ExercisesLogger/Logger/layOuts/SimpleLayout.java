package layOuts;

import interfaces.Layout;

public class SimpleLayout implements Layout {

	private final static String SIMPLE_FORMAT = "%s - %s  - %s ";

	@Override
	public String getFormat() {
		return SIMPLE_FORMAT;
	}
}
