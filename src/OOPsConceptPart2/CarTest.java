package OOPsConceptPart2;

public class CarTest extends Vichile {

	public static void main(String[] args) {
		
		// Static polymorphism =compile time polymprphism (during the run the test jave find out which method we have to run 
		//
//Polymorphism  means many -- so meny method like method overriding , 
		
		
		//Child class reference and child class object --- this will allow to access all methods of 
				//base class and child class
		
		BMW B=new BMW(); 
		
		B.start(); //this method is overriding method 
		
		B.stop();  // this method is inherit method form car class 
		B.refule();//this method is inherit method form car class 
		
		B.thefSafty(); // this Own BMW method
		
		
		//Base class reference and base calss object ---this will allow only base class only, not child class 
		
		Car c=new Car();// base /parent class object and reference 
		c.start();
		c.stop();
		c.refule();
		
		//Base class reference and child class object ---- this will allow to access all method of Base class only.
		//not child class.
		
		
		//Top casting ==child class can take property form parenrts or grand parents 
		
		Car obj =new BMW(); //child class object can be refered parents class variable --it will called dynamic polymorphimsom or run time pply
		
		obj.start();
		obj.stop();
		obj.refule();
		
	    //Down Casting ==( parents class cna not take the property form the child calss)
		//is not allow , it will give run time exception error 
	///BMW obj1 =new Car();//not allow
		//e

		
		
		
		
		
		
		
		
		

	}

}
