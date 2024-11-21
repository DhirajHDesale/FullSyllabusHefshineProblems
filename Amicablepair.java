/*
Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number. (A proper divisor of a number is a positive factor of that number other than the number itself. 
Examples: 
 

Input : x = 220, y = 284
Output : Yes 
Proper divisors of 220 are 1, 2, 4, 5,
10, 11, 20, 22, 44, 55 and 110. Sum of 
these is 284. Proper divisors of 284 
are 1, 2, 4, 71 and 142 with sum 220.

Input : 1 2
Output :No
*/
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int x = 220, y = 284;
		myCode(x,y);
	}
	
	private static void myCode(int x,int y)
	{
		int sum = 0;
		int sum2 = 0;
		for(int i = 1;i<x;i++)
		{
			if(x%i==0)
			{
				sum = sum + i;
			}
		}
		for(int j = 1;j<y;j++)
		{
			if(y%j==0)
			sum2 = sum2 + j;
		}
		if(sum==y && sum2 == x)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
