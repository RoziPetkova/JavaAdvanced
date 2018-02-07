package interfaces;

import java.util.Map;

public interface Repository {

	Map<String, Blob> allBlobies();

	void remove(Blob bloby);

	void add(Blob bloby);
	
	Blob getByName(String blobName);
}
