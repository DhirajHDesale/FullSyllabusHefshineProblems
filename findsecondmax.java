/*
Write a program to find the second largest element in an array
input : int[] a = { 2, 4, 3, 5, 6, -2, 4, 7, 9, 8, 9};
output : 8
*/

import java.util.TreeSet;
import java.util.ArrayList;
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int[] a = 
		{
			2, 4, 3, 5, 6, -2, 4, 7, 9, 8, 9
		}
		;
		myCode(a);
	}

	private static void myCode(int[] a) 	
	{
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i:a)
		{
			ts.add(i);
		}
		ArrayList<Integer> ar = new ArrayList<>();
		ar.addAll(ts);
		Object[] b = new Integer[ar.size()];
		for(int i = 0;i<b.length;i++)
		{
			b[i] = ar.get(i);
		}
		System.out.println(b[b.length-2]);
	}
}
