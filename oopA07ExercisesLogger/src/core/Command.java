package core;

import interfaces.Executable;
import repository.BlobRepo;

public abstract class Command implements Executable{
	
	private BlobRepo blobRepo;
	private String[] params;
	
	protected Command(String[] params){
		this.params = params;
	}
		
	protected String[] getParams() {
		return params;
	}
	
	protected BlobRepo getBlobRepo() {
		return blobRepo;
	}
}
