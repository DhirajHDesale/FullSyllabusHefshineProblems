/*

Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same. 
Example 1: 
Input:{1, 5, 11, 5} 
Output: YES 
Explaination: The two parts are {1, 5, 5} and {11}. 
Example 2: 
arr = {1, 3, 5}
Output: NO
 Explaination: This array can never be partitioned into two such parts.

*/


public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,3,5
		}
		;
		myCode(a);
	}
	private static void myCode(int[] a) 	
	{
		int max = a[0];
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]>max)
			max = a[i];
		}
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]!=max)
			sum = a[i] + sum;
		}
		if(sum==max)
		System.out.println(true);
		else
		System.out.println(false);
	}
}
