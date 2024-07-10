package beanshell;

import bsh.EvalError;
import bsh.Interpreter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws EvalError, FileNotFoundException, IOException {
		Interpreter i = new Interpreter();  // Construct an interpreter
		i.set("foo", 5);                    // Set variables
		i.set("date", new Date() );

		Date date = (Date)i.get("date");    // retrieve a variable

		// Eval a statement and get the result
		i.eval("bar = foo*10");
		System.out.println( i.get("bar") );

		// Source an external script file
		i.source("src/somefile.bsh");
	}
}
