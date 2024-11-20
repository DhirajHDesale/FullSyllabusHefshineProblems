/*
Remainder with 7 for large numbers
Given a large number as a string, find the remainder of number when divided by 7.
Examples : 
 

Input : num = 1234
Output : 2

Input : num = 1232
Output : 0

Input : num = 12345
Output : 4
*/
public class MyClass 
{
	public static void main(String[] args) 
	{
		String str = "12345";
		myCode(str);
	}
	private static void myCode(String str)
	{
		int num = Integer.parseInt(str);
		int ans = num % 7;
		System.out.println("Remainder with "+7+" is "+ans);
	}
}
