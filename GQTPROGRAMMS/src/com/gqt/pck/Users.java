package com.gqt.pck;

import java.util.Scanner;

public class Users {
	private static int id;
	private static String name;
	private static String pwd;
	public static Scanner sc=new Scanner(System.in);
	public static int temp=0;
	public static String uname[] =new String[10];
	public static String upassword[] =new String[10];
	public Users(int id, String name,String pwd)
	{
		super();
		this.id=id;
		this.name=name;
		this.pwd=pwd;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	    }
	public String getPwd() {
		return pwd;
		}
	public void setPwd(String pwd) {
		this.pwd= pwd;
		}
	public static void registerUser() {
		System.out.println("Enter the user name:");
	    uname[temp]=sc.next();
	    System.out.println("Enter the Password:");
	    upassword[temp]=sc.next();
	    temp++;
	    System.out.println("User Registered Successfully");
	   }
	public static boolean loginUser() {
		System.out.print("Enter the username:" );
		name=sc.next();
		System.out.print("Enter the Password:");
		pwd=sc.next();
		for(int i=0;i<uname.length;i++) {
			if(uname[i].equals(name)&& upassword[i].equals(pwd)) {
				System.out.println("Login Successfully");
				return true;
			}
		}
		return false;
	}
}
