package Interface_Abstraction;

public class AdvanceCalc implements Calc {

	public static void main(String[] args) {
		
		
		//1. scenearios: 1. Child class reference and child class object ---this will allow to access all the methods of base class and child class	
	AdvanceCalc obj1 =new 	AdvanceCalc();  
		
	obj1.add();
	obj1.sub();
	obj1.calculatecos();
	obj1.calculateSin();
	
	//2. Base class reference and child class objc , it will allow only the base class only
	
	Calc obj2=new AdvanceCalc();
	
	obj1.add();
	obj1.sub();
	obj1.calculatecos();
	obj1.calculateSin();
		
		
		
		
		
	}

	public void calculateSin() {
		System.out.println("I am the advance calculteSin");
	}
	
	
	public void calculatecos() {
		System.out.println("i am the advance calculatecos ");
	}
	
	
	public void add() {
		System.out.println("i am calc add menthod ");
			}

	
	public void sub() {
		System.out.println("I am the calc sub mecthod ");
		
	}

}
