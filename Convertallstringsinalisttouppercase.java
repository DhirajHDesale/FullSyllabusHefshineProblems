/*
Write a program to convert all strings in a list to uppercase using the Stream API.

Input: 
    List<String> words = Arrays.asList("hello", "world", "java");
Output:
    [HELLO, WORLD, JAVA]
*/

import java.util.*;
public class MyClass 
{
	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList("hello", "world", "java");
		myCode(words);
	}
	private static void myCode(List<String> words) 
	{
		ArrayList<String> alist = new ArrayList<>();
		for(int i = 0;i<words.size();i++)
		{
			String upper = words.get(i);
			alist.add(upper.toUpperCase());
		}
		System.out.print(alist);
	}
}
