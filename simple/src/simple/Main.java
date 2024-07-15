package simple;

import bsh.Interpreter;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
			Interpreter interpreter = new Interpreter();
			FileReader fileReader = new FileReader("src/script.bsh");
			
			Object result = interpreter.eval(fileReader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
