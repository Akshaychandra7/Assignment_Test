package com.onb.assignments;

public class Challenge3 {
void printEqual(int x, int y, int z)
{
	if(x<0&&y<0&&z<0) {
		System.out.println("Invalid Value");
	}
	else if(x==y && y==z && z==x) {
		System.out.println("All numbers are equal");
	}
	else if(x!=y && y!=z && z!=x) {
		System.out.println("All numbers are different");
	}
	else
		System.out.println("Neither all are equal or different");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Challenge3 c = new Challenge3();
//c.printEqual(4, 7, 8);
c.printEqual(4,5,7);
	}

}
