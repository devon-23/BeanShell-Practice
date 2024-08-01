package anotherProject;

import bsh.Interpreter;
import java.lang.StringBuffer;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, BeanShell");
		
		try {
			Interpreter interpreter = new Interpreter();
			
			interpreter.eval("source(\"script.bsh\");");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println("After append: " + sb);
		
		//Insert text at specific part
		sb.insert(6, "Beautiful ");
		System.out.println("After insert: " + sb);
		
		// Replace text from index 6 to 13
		sb.replace(6,  15, "Amazing");
		System.out.println("After replace: " + sb);
		
		// Delete text from index 6 to 13
		sb.delete(6,  14);
		System.out.println("After delete: " + sb);
		
		// Reverse the string
		sb.reverse();
		System.out.println("After reverse: " + sb);
		
		// Convert to string
		String finalStr = sb.toString();
		System.out.println("Final String: " + sb);
		
		String test = "Hello";
		StringBuffer testEx = new StringBuffer(test);
		testEx.reverse();
		System.out.println(testEx);
	}
}
