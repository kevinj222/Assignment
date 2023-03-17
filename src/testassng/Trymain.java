package testassng;

import java.util.Scanner;

public class Trymain
{
public static void main(String[] args)
{
	int t=0,w=0;
	System.out.println("enter the employee name");
	Scanner sc=new Scanner(System.in);
	String empname=sc.next();
	System.out.println("enter the employee ID");
	String empid=sc.next();
	System.out.println("enter the employee phone no");
	String phno=sc.next();
	System.out.println("enter the employee Address");
	String addr=sc.next();
	System.out.println("enter the employee Email");
	String email=sc.next();
	System.out.println("enter the employee Location");
	String l=sc.next();
	System.out.println("enter the employee Salary");
	int x=sc.nextInt();
	Try1 tx=new Try1(empname,empid,phno,addr,email,l,x);
	//try condition
	try 
	{
		char ch[]=empname.toCharArray();
		int q=ch.length;
		for(int i=0;i<q;i++)
		{
			if(ch[i]<'A'||ch[i]>'Z' && ch[i]<'a'||ch[i]>'z')
			{
				t=1;
			}
			else
			{
				t=0;
			}
		}
	}
catch(Exception e)
{
	if(t==1)
	{
		System.out.println(tx.getEmpname());
	}
	else
	{
		System.out.println("Not valid format");
	}
}
	try 
	{
		int o=phno.length();
		char xq[]=phno.toCharArray();
		for(int j=0;j<o;j++)
		{
			if(xq[j]>=0 && xq[j]<=9 && o<=10)
			{
				w=1;
			}
			else
			{
				w=0;
			}
		}
		
	}
	catch(Exception e)
	{
		if(w==1)
		{
			System.out.println(tx.getPhno());
		}
		else
		{
			System.out.println("Not valid format");
		}
	}

	System.out.println(tx);
}
}


	

