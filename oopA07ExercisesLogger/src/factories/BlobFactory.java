package factories;

import java.lang.reflect.InvocationTargetException;

import interfaces.Blob;
import models.BlobImpl;

public final class BlobFactory {

	private static Blob blob;
	
	public static Blob generateBlob(String[] params){
		try {
			blob = new BlobImpl(params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2]), BehaviorFactory.generateBehavior(params[0]), AttackFactory.generateAttac(params[4]));
		} catch (ClassNotFoundException | IllegalArgumentException | InvocationTargetException | SecurityException | InstantiationException
				| IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blob;
	}
}
