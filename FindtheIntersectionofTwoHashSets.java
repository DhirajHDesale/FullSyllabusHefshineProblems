/*
Given two HashSet instances, find and print the intersection (common elements) of both sets.

Input:
set1 = {1, 2, 3, 4, 5}
set2 = {4, 5, 6, 7, 8}

Output:
Intersection: [4, 5]

Explanation:
The common elements in both sets are 4 and 5.
  */


import java.util.HashSet;
public class MyClass 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		myCode(set1, set2);
	}
	private static void myCode(HashSet<Integer> set1, HashSet<Integer> set2) 
	{
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
