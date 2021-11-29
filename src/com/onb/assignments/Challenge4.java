package com.onb.assignments;

public class Challenge4 {
	boolean isCatPlaying(boolean summer, int temperature) {
		if(summer==false && temperature >=25 && temperature <= 35)
		{
			return true;
		}
		else if(summer==true && temperature >=25 && temperature <= 45)
		{
			return true;
		}
		else 
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Challenge4 c = new Challenge4();
System.out.println(c.isCatPlaying(true, 49));
	}

}
