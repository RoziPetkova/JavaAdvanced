package core.commands;

import core.Command;
import factories.BlobFactory;

public class CreateCommand extends Command{

	public CreateCommand(String[] params) {
		super(params);
	}

	@Override
	public String execute() {
		super.getBlobRepo().add(BlobFactory.generateBlob(super.getParams()));
		return null;
	}
}
