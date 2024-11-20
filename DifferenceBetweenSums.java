/*
Difference between sums of odd and even digits
Given a long integer, we need to find if the difference between sum of odd digits and sum of even digits is 0 or not. The indexes start from zero (0 index is for leftmost digit).
Examples: 
 

Input : 1212112
Output : Yes
Explanation:-
the odd position element is 2+2+1=5
the even position element is 1+1+1+2=5
the difference is 5-5=0.so print yes.

Input :12345
Output : No
Explanation:-
the odd position element is 1+3+5=9
the even position element is 2+4=6
the difference is 9-6=3 not  equal
to zero. So print no.
*/
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int n=12345;
		myCode(n);
	}
	
	private static void myCode(int n)
	{
		String a = String.valueOf(n);
		int arr[] = new int[a.length()];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = a.charAt(i) - '0';
		}
		int odd_sum = 0;
		int eve_sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				eve_sum = eve_sum + arr[i];
			}
			else
			{
				odd_sum = odd_sum + arr[i];
			}
		}
		int diff = odd_sum - eve_sum;
		if(diff==0)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
