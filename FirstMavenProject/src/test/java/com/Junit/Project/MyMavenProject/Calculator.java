package com.Junit.Project.MyMavenProject;

public class Calculator
{
	CalculatorService service;

	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}
	int add(int a, int b)
	{
		return a+b;
	}
}
