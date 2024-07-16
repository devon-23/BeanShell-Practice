package simple;

import bsh.Interpreter;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
			Interpreter interpreter = new Interpreter();
			FileReader fileReader = new FileReader("src/script.bsh");
			
			Interpreter bsh = new Interpreter();
			
			Object result = interpreter.eval(fileReader);
			
			bsh.set("x", 15);
			bsh.set("y", 20);
			int sum = (int) bsh.eval("x + y");
			
			System.out.println("The sum of " + bsh.get("x") + " + " + bsh.get("y") + " is " + sum);
			
			String script = "int multiply(int a, int b) { return a * b; }";
			bsh.eval(script);

			int product = (Integer) bsh.eval("multiply(3, 4);");
			System.out.println(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
