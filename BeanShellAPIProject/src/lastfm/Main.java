package lastfm;

import bsh.Interpreter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
	private static final String API_KEY = "092d316884d8385f35ad8b84f5f42ef8";
	
	public static void main(String[] args) {
		try {
			Interpreter interpreter = new Interpreter();

			String artist = "Cavetown";
			String apiUrl = "http://ws.audioscrobbler.com/2.0/?method=artist.getinfo&artist=" + artist + "&api_key=" + API_KEY + "&format=xml";
			URL url = new URL(apiUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection(); 
			connection.setRequestMethod("GET"); 
			int responseCode = connection.getResponseCode(); 
			
			if (responseCode == HttpURLConnection.HTTP_OK) { 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream())); 
				String inputLine; 
				StringBuilder content = new StringBuilder(); 
				
				while ((inputLine = in.readLine()) != null) { 
					content.append(inputLine); 
				} 
				in.close(); 
				connection.disconnect(); // Step 3: Process API Response 
				String response = content.toString(); 
//				System.out.println("API Response: " + response); // Using BeanShell to manipulate API response 
				interpreter.set("apiResponse", response); 
				FileReader scriptReader = new FileReader("src/script.bsh");
				Object result = interpreter.eval(scriptReader);
				System.out.println(result); 
			} else { 
				System.out.println("GET request failed. Response Code: " + responseCode); 
			} 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
}
			