/*
Given a list of integers, create a HashSet and count how many duplicate elements are present in the list.

Input:
elements = {10, 20, 30, 20, 40, 10, 50}

Output:
Duplicate elements count: 2

Explanation:
The duplicates in the list are 10 and 20.
*/

import java.util.HashSet;
public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] elements = 
		{
			10, 20, 30, 20, 40, 10, 50
		}
		;
		myCode(elements);
	}

	private static void myCode(int[] elements) 
	{
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0;i<elements.length;i++)
		{
			hs.add(elements[i]);
		}
		int diff = elements.length - hs.size();
		System.out.println("Duplicate elements count: "+diff);
	}
}
