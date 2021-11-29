package com.onb.assignments;

public class Challenge7 {
	boolean isOdd(int number) {
		if (number > 0) {
		
			
				if (number % 2 != 0) {
					return true;
				}
				else
					 
					return false;			
		}
		else
			 
			return false;
		

	}

	int sumOdd(int start, int end)
	{
		int sum=0;
		for(int i=start;i<end;i++)
		{
			if(true==isOdd(i))
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge7 c = new Challenge7();
	System.out.println(c.isOdd(8));
	System.out.println(c.sumOdd(9,23));
	}

}
