package com;

public class ArmstrongOrNot {
	public static boolean isArm(int n)
	{
		int sum = 0;
		int t=n;
		while(n>0)
		{
			int d = n%10;
			sum += d*d*d;
			n/=10;
		}
		if(sum==t)
			return true;
		return false;
	}
}
