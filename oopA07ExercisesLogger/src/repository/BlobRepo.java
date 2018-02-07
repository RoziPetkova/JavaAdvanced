package repository;

import java.util.Collections;
import java.util.Map;

import interfaces.Blob;
import interfaces.Repository;

public class BlobRepo implements Repository{

	private Map<String, Blob> blobs;

	@Override
	public void add(Blob bloby) {
		blobs.putIfAbsent(bloby.getName(), bloby);
	}

	@Override
	public void remove(Blob bloby) {
		if (blobs.containsKey(bloby.getName()))
			blobs.remove(bloby.getName());
	}
	
	@Override
	public Map<String,Blob> allBlobies() {
		return Collections.unmodifiableMap(blobs);
	}

	@Override
	public Blob getByName(String blobName) {
		return blobs.get(blobName);
	}
}
