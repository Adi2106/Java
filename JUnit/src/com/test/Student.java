package com.test;

import java.util.stream.Stream;

public class Student
{
	String name;int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static String getName(String name)
	{
		return name;
	}
	public static int getId(int Id)
	{
		return Id;
	}
	public static long getMbno(long n)
	{
		return n;
	}
	public static Stream<String> studentName()
	{
		return Stream.of("S1","S2","S3","S4");
	}
}
