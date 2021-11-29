package com.onb.assignments;

public class Challenege8 {
	int sumFirstAndLastDigit(int number)
	{
	int FD=0;
	int sum=0;
	
		if(number>0) {
			int LD=number%10;
			while(number!=0) {
				
		 FD = number%10;
			number=number/10;
		}
		 sum=FD+LD;
		return sum;
		}
		else
			return -1;
			
	}
	

	public static void main(String[] args) {
		
Challenege8 c = new Challenege8();
System.out.println(c.sumFirstAndLastDigit(5699));
	}

}
