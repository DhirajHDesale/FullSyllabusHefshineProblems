/*

Given a collection of integers stored in a HashSet, iterate through the HashSet and print each element.

Input:
elements = {10, 20, 30, 40, 50}

Output:
Elements in the HashSet: 10, 20, 30, 40, 50

Explanation:
The program iterates through the HashSet and prints each element.

*/

import java.util.HashSet;
import java.util.Iterator;
public class MyClass 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		myCode(set);
	}
	private static void myCode(HashSet<Integer> set) 
	{
		Iterator<Integer> iter = set.iterator();
		System.out.print("Elements in the HashSet: ");
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
	}
}
