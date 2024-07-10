package example;

import java.io.FileReader;

import bsh.Interpreter;

public class Main {
	public static void main(String[] args) {
		Interpreter interpreter = new Interpreter();
		
		try {
			interpreter.eval("int a = 5;");
			interpreter.eval("int b = 10;");
			interpreter.eval("int sum = a + b;");
			interpreter.eval("print(\"The sum is \" + sum);");
			
			FileReader reader = new FileReader("src/script.bsh");
			interpreter.eval(reader);
			
			Integer result = (Integer) interpreter.eval("add(20, 30);");
			System.out.println("The other result is " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
