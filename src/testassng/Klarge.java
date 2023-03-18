package testassng;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Klarge
{
public static void main(String[] args)
{
	LinkedList<Integer>u=new LinkedList<Integer>();
	u.add(10);
	u.add(8);
	u.add(12);
	u.add(17);
	u.add(56);
	u.add(114);
	u.add(65);
	u.add(2);
	u.add(9);
	List<Integer>y=u.stream().sorted().toList();
	int max=y.size();
	System.out.println("The List is :"+y+"Size:"+max);
	System.out.println("enter the Kth largest element needed:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer w=y.get(max-n);
	System.out.println(w);
	System.out.println("Enter Smallest Kth element:");
	int q=sc.nextInt();
	int p=y.get(q-1);
	System.out.println(p);
	 

	
}
}
