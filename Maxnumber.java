/*

Find maximum number that can be formed using digits of a given number
Given a number, write a program to find a maximum number that can be formed using all of the digits of this number.
Examples: 
 

Input : 38293367
Output : 98763332

Input : 1203465
Output: 6543210

*/

import java.util.Arrays;
public class MyClass 
{
	public static void main(String[] args) 
	{
		int num = 38293367;
		myCode(num);
	}
	private static void myCode(int num)
	{
		String s1 = String.valueOf(num);
		String s2 = "";
		char c[] = s1.toCharArray();
		int arr[] = new int[c.length];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = c[i] - '0';
		}
		Arrays.sort(arr);
		for(int i = arr.length-1;i>=0;i--)
		{
			s2 = s2 + arr[i];
		}
		int ans = Integer.parseInt(s2);
		System.out.println(ans);
	}
}
