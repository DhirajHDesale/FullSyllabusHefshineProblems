/*
Write a program to count the number of words in a given sentence.
Input: "hello world welcome"
Output: 3
*/
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s = "hello world    welcome";
		myCode(s);
	}
	
	private static void myCode(String s) 
	{
		String array[] = s.trim().split("\\s+");
		int cnt = array.length;
		System.out.println(cnt);
	}
}
