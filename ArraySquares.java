/*
Write a program to create an array of the squares of the elements in the given array.
Input: 
    int[] a = {1, 2, 3, 4};
Output:
    Squared Array: [1, 4, 9, 16]
*/

import java.util.ArrayList;
public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 2, 3, 4
		}
		;
		myCode(a);
	}
	private static void myCode(int[] a) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<a.length;i++)
		{
			list.add(a[i]*a[i]);
		}
		System.out.print("Squared Array: "+list);
	}
}
