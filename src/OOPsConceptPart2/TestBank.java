package OOPsConceptPart2;

import abstraction_Interface.HSBCBank;
import abstraction_Interface.USBank;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank b=new HSBCBank(); //only i can create the child class object , not parents class interface 
		b.debit();
		b.credit();
		b.moneyTransfar();
		b.Educationloan();
		
	//Dynamic polymorpsim : 
		//dynaic polymorphism :
			//Child class object can be referred by parent interface reference variable 		
					
				USBank obj =new HSBCBank();	
				obj.credit();
				obj.debit();
				obj.moneyTransfar();
		

	}

}
