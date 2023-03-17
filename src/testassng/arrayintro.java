package testassng;

import java.util.Scanner;

public class arrayintro 
{
	public static void main(String[] args)
	{
		System.out.println("enter the length of array:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
	
		
	}
}
