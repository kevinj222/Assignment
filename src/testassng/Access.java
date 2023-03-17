package testassng;
import java.util.*;
import java.util.Scanner;

public class Access 
{	
	public static void main(String args[])
	{
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	st(n);
	}
	
	public static void st(int n)
	{
		int f=0;
	for(int i=0;i<n;i++)
	{
		int x=(int) Math.pow(2, i);
		if(n==x)
		{
			System.out.println(n+" is power of 2 ");
			f=1;
		}
	}
	if(f==0)
	{
	System.out.println(n+" is not power of 2");
	}
	}
}