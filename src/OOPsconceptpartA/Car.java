package OOPsconceptpartA;
//class concept 

public class Car {

	//Global variable 
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		//new car() is the object of car class
		//a , b, c is the object reference variable of car class
		//new key word/ operator is create the object 
		
		
Car a = new Car();
Car b=new Car();
Car c= new Car();

a.mod=2015;
a.wheel=4;

b.mod=2016;
b.wheel=4;

c.mod=2017;
c.wheel=4;

System.out.println(a.mod);
System.out.println(c.wheel);

	}

}
