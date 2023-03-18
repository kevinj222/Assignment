package testassng;

class top
{
	String brand;
	String Type;
	int cc;
	int year;
	String model;
	public top(String brand,String Type,int cc,int year,String model)
	{
		this.brand=brand;
		this.cc=cc;
		this.Type=Type;
		this.year=year;	
		this.model=model;	
	}
	void makesound()
	{
		System.out.println("Sound is bass");
	}
	void display()
	{
		System.out.println("This "+Type+" is "+" manufactured by "+brand+" in "+year+" Having "+cc+" CC ");
	}
	void model()
	{
		System.out.println("Model is: "+model);
	}
}
class Car extends top
{	    
		 public Car(String brand,int cc,String Type,int year,String model)
		 {
	     super(brand,Type,cc,year,model);
	     this.drive=drive;
		 }
		 String drive="FWD";
	 }
class bike extends top
{	    
		 public bike(String brand,int cc,String Type,int year,String model)
		 {
	     super(brand,Type,cc,year,model);
		 }	 
	@Override
	void makesound()
	{
		System.out.println("Sound is light");
	}
}
public class Vehicle
{
public static void main(String[] args)
	{
		Car c1=new Car("Toyota",2200,"Sedan",2018,"Camry");
		bike b1=new bike("Ducati",1000,"Adventurer",2015,"Multistrada");
		top t1=new top("Buggati","Hypercar",8000,2005,"Chiron");
		
		c1.display();
		c1.makesound();
		c1.model();
		System.out.println("\n");
		b1.display();
		b1.makesound();
		b1.model();
		System.out.println("\n");
		t1.display();
		t1.makesound();
		t1.model();
	}	
		
}