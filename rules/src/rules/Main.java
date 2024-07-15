package rules;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		RuleEngine ruleEngine = new RuleEngine();
		Map<String, Object> context = new HashMap<>();
		Map<String, String> user = new HashMap<>();
		
		user.put("role", "admin");
		user.put("role", "admin");
		user.put("role", "na");
		
		context.put("user", user);
		
		String result = ruleEngine.executeRule("src/rule.bsh", context);
		
		System.out.println(result);
	}
}
