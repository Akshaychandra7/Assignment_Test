package com.onb.assignments;

public class Challenge6 {
	 
public static void main(String[] args) {
	int sum=0;	
	int count=0;// TODO Auto-generated method stub
for(int i=1;i<=1000;i++)
{
	
	
	if(i%3==0 && i%5==0) {
		 sum += i;
		 count++;
		// System.out.println(count);
}
	if(count==5)
		break;
}
System.out.println(sum);
	}

}
