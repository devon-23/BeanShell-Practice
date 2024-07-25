package example;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private String appId;
	private String appName;
	private String owner;
	private List<String> entitlement;
	private boolean active;
	

	// Constructor
	public Application() {
		
	}
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<String> getEntitlement() {
		return entitlement;
	}
	public void setEntitlement(List<String> entitlement) {
		this.entitlement = entitlement;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
