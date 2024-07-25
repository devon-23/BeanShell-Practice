package example;

import java.util.*;

public class Identity { 
	private String userId; 
	private String firstName; 
	private String lastName; 
	private String email; 
	private String department; 
	private boolean active; 
	private List<String> roles; 
	private List<String> accessRights; 
	
	// Constructor 
	public Identity(String userId, String firstName, String lastName, String email, String department) { 
		this.userId = userId; 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.email = email; 
		this.department = department; 
		this.active = true; 
		this.roles = new ArrayList<>(); 
		this.accessRights = new ArrayList<>(); 
	} 
	
	// Getter and Setter methods 
	public String getUserId() { 
		return userId; 
	} 
	
	public String getFirstName() { 
		return firstName; 
	} 
	
	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
	} 
	
	public String getLastName() { 
		return lastName; 
	} 
	
	public void setLastName(String lastName) { 
		this.lastName = lastName; 
	} 
	
	public String getEmail() { 
		return email; 
	} 
	
	public void setEmail(String email) { 
		this.email = email; 
	} 
	
	public String getDepartment() { 
		return department; 
	} 
	
	public void setDepartment(String department) { 
		this.department = department; 
	} 
	
	public boolean isActive() { 
		return active; 
	} 
	
	public void setActive(boolean active) { 
		this.active = active; 
	} 
	
	public List<String> getRoles() { 
		return roles; 
	} 
	
	public List<String> getAccessRights() { 
		return accessRights; 
	} 
	
	// Method to add a role 
	public void addRole(String role) { 
		if (!roles.contains(role)) { 
			roles.add(role); 
			System.out.println("Role " + role + " added to user " + userId); 
		} 
	} 
	
	// Method to remove a role 
	public void removeRole(String role) { 
		if (roles.contains(role)) { 
			roles.remove(role); 
			System.out.println("Role " + role + " removed from user " + userId); 
		} 
	} 
	
	// Method to add access right 
	public void addAccessRight(String accessRight) { 
		if (!accessRights.contains(accessRight)) { 
			accessRights.add(accessRight); 
			System.out.println("Access right " + accessRight + " granted to user " + userId); 
		} 
	} 
	
	// Method to remove access right 
	public void removeAccessRight(String accessRight) { 
		if (accessRights.contains(accessRight)) { 
			accessRights.remove(accessRight); 
			System.out.println("Access right " + accessRight + " revoked from user " + userId); 
		} 
	} 
	
	// Method to provision identity 
	public void provision() { 
		this.active = true; 
		System.out.println("User " + userId + " provisioned."); 
	} 
	
	// Method to deprovision identity 
	public void deprovision() { 
		this.active = false; 
		System.out.println("User " + userId + " deprovisioned."); 
	} 
	
	// Method to display identity details 
	public void displayDetails() { 
		System.out.println("User ID: " + userId); 
		System.out.println("Name: " + firstName + " " + lastName); 
		System.out.println("Email: " + email); 
		System.out.println("Department: " + department); 
		System.out.println("Active: " + active); 
		System.out.println("Roles: " + roles); 
		System.out.println("Access Rights: " + accessRights); 
	} 
	
	// Example usage
	public static void main(String[] args) {  
		Identity identity = new Identity("jdoe", "John", "Doe", "jdoe@example.com", "IT"); 
		identity.addRole("Admin"); 
		identity.addAccessRight("read"); 
		identity.addAccessRight("write"); 
		identity.displayDetails(); 
		identity.removeRole("Admin"); 
		identity.removeAccessRight("write"); 
		identity.deprovision(); 
		identity.displayDetails(); 
	} 
}