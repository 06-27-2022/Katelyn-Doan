package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevatureLogin {
	
	protected static List<String> storedUsernames = new ArrayList<String>();
	protected static List<String> storedPasswords = new ArrayList<String>();
	protected String username;
	protected String password;
	
	public void autheticated(String username, String password) {
		if(storedUsernames.contains(username) && storedPasswords.contains(password)) {
			System.out.println("Access granted!");
		}else {
			System.out.println("Wrong username or password!");
		}
	}
	public void register(String username, String password) {
		this.username = username;
		this.password = password;
		storedUsernames.add(username);
		storedPasswords.add(password);
		System.out.println("All set!");
	}

	public static void main(String[] args) {
		
		storedUsernames.add("kndoan");
		storedPasswords.add("potato");
		
		RevatureLogin login = new RevatureLogin();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pick an option:");
		System.out.println("1 - Login with existing account");
		System.out.println("2 - Register for new account");
		System.out.println("3 - Quit application");
		byte choice = scan.nextByte();
		
		switch(choice) {
		case 1:
			System.out.print("Username: ");
			String user = scan.next();
			
			System.out.print("Password: ");
			String pass = scan.next();
			login.autheticated(user, pass);
			break;
		
		case 2:
			System.out.print("Choose a username: ");
			String newUser = scan.next();
			System.out.print("Choose a password: ");
			String newPass = scan.next();
			login.register(newUser, newPass);
			
			break;
		
		case 3:
			System.out.println("Quitting now . . . ");
			scan.close();
			
		
		}

		scan.close();
	}

}
