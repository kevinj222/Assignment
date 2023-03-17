package testassng;

import java.util.Arrays;
import java.util.List;

public class Arlistmax 
{
public static void main(String[] args)
{
	List<Integer>x=Arrays.asList(24,45,28,14);
	List<Integer>y=x.stream().sorted().toList();
	int max=y.size();
	Integer w=y.get(max-1);
	System.out.println(w);

	
}
}
