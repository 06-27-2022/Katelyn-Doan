package revature;


public class RevatureEmployeeAccount {
	private String name;
	private String username;
	private String password;
	
	RevatureEmployeeAccount(String name, String username, String password){
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public String getName(){
		return this.name;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}

}
