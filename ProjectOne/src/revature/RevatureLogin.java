package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevatureLogin {
	
	protected static List<String> storedUsernames = new ArrayList<>();
	protected static List<String> storedPasswords = new ArrayList<>();
	protected String username;
	protected String password;
	
	public static void autheticated(String username, String password) {
		if(storedUsernames.contains(username) && storedPasswords.contains(password)) {
			System.out.println("Access granted");
		}else {
			System.out.println("Wrong answer");
		}
	}

	public static void main(String[] args) {
		
		storedUsernames.add("kndoan");
		storedPasswords.add("potato");
		
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
			
			break;
		
		case 2:
			System.out.println("Register blah blah");
			break;
		
		case 3:
			System.out.println("Quitting now . . . ");
			scan.close();
			
			
			
//			if(storedUsernames.contains(user)) {
//				System.out.println("Access granted");
//			}
			


//			for(String i : storedUsernames) {
//				if(storedUsernames.contains(user)){
//					System.out.print("welcome " + user);
//				}else {
//					System.out.println("Wrong username or password");
//				}
//			}
		
		}

		scan.close();
	}

}

