/*
Program to find remainder without using modulo or % operator
Given two numbers ‘num’ and ‘divisor’, find remainder when ‘num’ is divided by ‘divisor’. The use of modulo or % operator is not allowed.
Examples : 

Input:  num = 100, divisor = 7
Output: 2

Input:  num = 30, divisor = 9
Output: 3
RestrictedKeyWordsInCode: %
*/

public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int M = 100;int N=7;
		myCode(M,N);
	}
	
	private static void myCode(int M,int N)
	{
		int que = M / N;
		int rem = M - (que * N);
		System.out.println(rem);
	}
}
