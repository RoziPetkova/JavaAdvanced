package militaryElite;

import java.util.ArrayList;
import java.util.List;

public class LeutenantGeneral extends Private{

	@SuppressWarnings("unused")
	private List<Private> privatesUnderCommand;
	
	protected LeutenantGeneral(String id, String firstName, String lastName, String salary, String corps) {
		super(id, firstName, lastName, salary);
		privatesUnderCommand = new ArrayList<>();
	}
	
	
}
