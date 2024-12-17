/*
Write a program to clone an array list to another array list
  */
import java.util.ArrayList;
public class MyClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		myCode(list1,list2);
	}
	@SuppressWarnings("unchecked")
	public static void myCode(ArrayList<Integer> list1,ArrayList<Integer> list2) 
	{
		list2 = (ArrayList<Integer>)list1.clone();
		System.out.println(list2);
	}
}
