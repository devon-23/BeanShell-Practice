package anotherProject;

import bsh.Interpreter;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, BeanShell");
		
		try {
			Interpreter interpreter = new Interpreter();
			
			interpreter.eval("source(\"script.bsh\");");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
