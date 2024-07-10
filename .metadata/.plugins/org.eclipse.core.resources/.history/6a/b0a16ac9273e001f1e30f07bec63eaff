package github;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserProcessorTwo {
	public List<String> processUsers(List<String> usernames, GitHubService service) {
		List<String> usersWithRepos = new ArrayList<>();
		
		for (String username : usernames) {
			if (hasRepos(username, service)) {
				usersWithRepos.add(username);
			}
		}
		return usersWithRepos;
	}
	
	private boolean hasRepos(String username, GitHubService service) {
		try {
			List<String> repos = service.getUsernamesWithRepo(username);
			return !repos.isEmpty();
		} catch (IOException e) {
			System.out.println("ERROR fetching repos for user: " + username);
			e.printStackTrace();
			return false;
		}
	}

}
