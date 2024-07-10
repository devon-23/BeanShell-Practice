package github;

import bsh.Interpreter;
import java.io.FileReader;
import java.util.List;

public class GitHubDriver {
	public static void main(String[] args) {
		GitHubService service = new GitHubService();
		UserProcessorTwo processor = new UserProcessorTwo();
		Interpreter interpreter = new Interpreter();
		String scriptPath = "github/scripts/processUsers.bsh";
		
		try {
			List<String> usernames = service.getUsernamesWithRepo("github");
			List<String> usersWithRepos = processor.processUsers(usernames, service);
			
			interpreter.set("usersWithRepos", usersWithRepos);
			interpreter.eval(new FileReader(scriptPath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
