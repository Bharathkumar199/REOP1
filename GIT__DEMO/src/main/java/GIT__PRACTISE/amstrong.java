package GIT__PRACTISE;

import java.util.Scanner;

public class amstrong 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any number");
		int n=sc.nextInt();
		int sum=0,rem,v=0,temp=n,temp1=n;
		while(n>0)
		{
			n=n/10;
			sum++;
		}
		while(temp>0)
		{
			int b=1;
			rem=temp%10;
			for(int i=1;i<=sum;i++)
			{
				b=b*rem;
			}
			v=v+b;
			temp=temp/10;
		}
		if(v==temp1)
		{
			System.out.println("then the given no is Amstrong number");
		}
		else
		{
			System.out.println("then the given no is  not Amstrong number");
		}

            System.out.println("hi");
			System.out.println("hello");
				System.out.println("hi");
			System.out.println("hello");

		
		System.out.println("hello");


	}
}
