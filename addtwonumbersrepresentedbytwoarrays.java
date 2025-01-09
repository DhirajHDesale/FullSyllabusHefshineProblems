/*
Given two array A[0….N-1] and B[0….M-1] of size N and M respectively, representing two numbers such that every element of arrays represent a digit.
For example, A[] = { 1, 2, 3} and B[] = { 2, 1, 4 } represent 123 and 214 respectively. 
The task is to find the sum of both the numbers.

Input : A[] = {1, 2}, B[] = {2, 1}
Output : 33
Explanation:
N=2, and A[]={1,2}
M=2, and B[]={2,1}
Number represented by first array is 12.
Number represented by second array is 21
Sum=12+21=33
*/

public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2
		}
		;
		int[] b= 
		{
			2,1
		}
		;
		myCode(a,b);	
	}
	public static void myCode(int[] a,int[] b) 
	{
		String s1 = "";
		String s2 = "";
		for(int i = 0;i<a.length;i++)
		s1 = s1 + a[i];
		for(int j = 0;j<b.length;j++)
		s2 = s2 + b[j];
		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(sum);
	}
}
