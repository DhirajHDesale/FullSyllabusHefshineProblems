/*

Given two TreeSet objects, find the intersection of the two sets, which includes elements that are common to both sets.

Input:
TreeSet1 = {10, 20, 30, 40, 50}
TreeSet2 = {30, 40, 50, 60, 70}

Output:
Intersection of the two TreeSets: [30, 40, 50]

Explanation:
The program demonstrates how to find and print the intersection of two TreeSet objects.

*/

import java.util.TreeSet;
public class MyClass 
{

	public static void main(String[] args) 
	{
		
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		treeSet1.add(10);
		treeSet1.add(20);
		treeSet1.add(30);
		treeSet1.add(40);
		treeSet1.add(50);
		
		TreeSet<Integer> treeSet2 = new TreeSet<>();
		treeSet2.add(30);
		treeSet2.add(40);
		treeSet2.add(50);
		treeSet2.add(60);
		treeSet2.add(70);
		
		myCode(treeSet1, treeSet2);
	}
	
	private static void myCode(TreeSet<Integer> treeSet1, TreeSet<Integer> treeSet2) 
	{
		treeSet2.retainAll(treeSet1);
		System.out.print("Intersection of the two TreeSets: ");
		System.out.println(treeSet2);
	}
}
