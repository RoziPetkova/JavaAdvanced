package engine;

import interfaces.Executable;
import interfaces.Repository;
import io.ConsoleInputReader;
import io.ConsoleOutputWriter;
import repository.BlobRepo;
import utility.MutableBoolean;

public class Engine implements Runnable {
	private Repository bRepo = new BlobRepo();
	private ConsoleInputReader reader;
	private ConsoleOutputWriter writer; 
	private MutableBoolean flag;
	private String [] params;
	
	public Engine(ConsoleInputReader reader, ConsoleOutputWriter writer, MutableBoolean flag) {
		this.flag = flag;
		this.reader = reader;
		this.writer = writer;
	}

	@Override
	public void run() {
		params = reader.readLine().split("\\s+");
		Executable command = generateCommanda(params);
		
	}
	
	private Executable generateCommanda(String[] params){
		return null;
		
	}
}
