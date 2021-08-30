package com.test;
import com.Password;
import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TestPassword {
	
	@ParameterizedTest
	@DisplayName("TestPassword")
	@MethodSource("isValidPassword")
	void test(String s) {
//		fail("Not yet implemented");
		assertTrue(s.length()>=6);
		System.out.println("Passed!");
	}
	public static boolean isValidPassword(String password)
	{	
		password="Adity!@34";
		Pattern p = Pattern.compile("(.*[a-zA-Z0-9]?)" + "(.*[@#$%^&+=]?)" + "(.\\S+$?).{6,}$");	
		Matcher m = p.matcher(password);
		return m.matches();
	}	

}
