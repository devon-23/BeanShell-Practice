package rules;

import bsh.Interpreter;
import java.io.FileReader;
import java.util.Map;

public class RuleEngine {
	public String executeRule(String scriptPath, Map<String, Object> context) {
		try {
			Interpreter interpreter = new Interpreter();
			for (Map.Entry<String, Object> entry : context.entrySet()) {
				interpreter.set(entry.getKey(), entry.getValue());
			}
			FileReader scriptReader = new FileReader(scriptPath);
			return (String) interpreter.eval(scriptReader);
		} catch (Exception e) {
			e.printStackTrace();
			return "error executing rule";
		}
	}
}
