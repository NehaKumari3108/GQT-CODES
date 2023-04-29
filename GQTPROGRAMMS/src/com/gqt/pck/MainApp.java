package com.gqt.pck;
import java.util.Scanner;
public class MainApp {
	public static void main(String[] args) {
		System.out.println("Welcome to To-Do-App");
		System.out.println("Dear user please select an option:\n"
				  +"1. Register\n"
				  +"2. Login\n"
				  +"3. Logout");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		{
			Users.registerUser();
			MainApp.main(null);
		}
		case 2: {
			boolean b =Users.loginUser();
			if(b==true) {
				MainApp.main(null);
				}
			else {
				System.out.println("Login Failed.");
				MainApp.main(null);
			}
		}
		case 3:{
			System.out.println("Thank you.");
			System.exit(0);
	        }
        	default:
        	{
        		System.out.println("Invalid entry,Please try again");
        		MainApp.main(null);
	      }
	} 	
	}
}