package github;

import com.google.gson.*;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;

import okhttp3.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GitHubService {
	private OkHttpClient client;
	private Gson gson;
	
	public GitHubService() {
 		this.client = new OkHttpClient();
		this.gson = new Gson();
	}
	
	public List<String> getUsernamesWithRepo(String organization) throws IOException {
		List<String> usernames = new ArrayList<>();
		String url = "https://api.github.com/orgs" + organization + "/members";
		Request request = new Request.Builder().url(url).build();
		
		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code: " + response);
			}
			JsonArray jsonArray = JsonParser.parseString(response.body().string()).getAsJsonArray();
			
			for (JsonElement element : jsonArray) {
				JsonObject jsonObject = element.getAsJsonObject();
				String username = jsonObject.get("login").getAsString();
				usernames.add(username);
			}
		}
		return usernames;
	}

}
