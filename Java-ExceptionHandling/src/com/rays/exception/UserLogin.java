package com.rays.exception;

public class UserLogin {
	public static void main(String[] args) throws LoginException {
		String loginId = "admin";//yha kuch b hoskta h fzkjp ya null
		
		if(loginId != null && loginId == "admin") {
			System.out.println("user login succesfully");
		}else {
			throw new LoginException("user not found");
		}
		
	}

}
