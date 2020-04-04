package Interface_Abstraction;

public class AdvanceCalc2 implements Calc {

	public static void main(String[] args) {
		
	
	
	//2. Base class reference and child class objc , it will allow only the base class only
	
	Calc obj2=new AdvanceCalc2();
	
	obj2.add();
	obj2.sub();
	//obj2.calculatecos();  //not allow because this method is the child class only
	//obj2.calculateSin();
		
		
	//3. you can not create the object of the interface 
	
//	Calc obj3 =new Calc();//
	
	
	//4. you can not create the object of interfce because it has abstract methods
	
	//AdvanceCalc2 obj4=new Calc();
	
	
	
	}


	public void add() {
		
		
	}

	
	public void sub() {
		
		
	}

	

}
