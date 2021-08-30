package com;

import java.util.stream.Stream;

public class MyClass {
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int sqr(int a)
	{
		return a*a;
	}
	public static int cube(int a)
	{
		return a*a*a;
	}
	public static Stream<String> func()
	{
		return Stream.of("A","B","C","D");
	}
}
