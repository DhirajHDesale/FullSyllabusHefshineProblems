/*
Half N by M 
Given two values N and M. Give the value when N is halved M-1 times.

Example 1:

Input: N = 100, M = 4
Output: 12
Explaination: The sequence of numbers is 
100, 50, 25, 12.
*/


public class MyClass 
{
	static int MAX_CHAR = 26;
	
	public static void main(String[] args) 
	{
		int N = 100, M = 4;
		myCode(N,M);
	}
	
	public static void myCode(int N,int M) 
	{
		for(int i = 1;i<M;i++)
		{
			N = N / 2;
		}
		System.out.println(N);
	}
}
