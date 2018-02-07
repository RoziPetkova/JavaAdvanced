import engine.Engine;
import io.ConsoleInputReader;
import io.ConsoleOutputWriter;
import utility.MutableBoolean;

public class Main {

	public static void main(String[] args) {
		ConsoleInputReader r = new ConsoleInputReader();
		ConsoleOutputWriter w = new ConsoleOutputWriter();
		MutableBoolean flag = new MutableBoolean();
		Engine eng = new Engine(r, w, flag);
		eng.run();

	}

}
