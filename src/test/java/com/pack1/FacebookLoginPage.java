package com.pack1;

public class FacebookLoginPage {

	public static void main(String[] args) {

		Facebook f = new Facebook();

		f.setUsername("kalai");
		f.setPassword(1234);

		String username = f.getUsername();
		System.out.println(username);

		int password = f.getPassword();
		System.out.println(password);

	}
}