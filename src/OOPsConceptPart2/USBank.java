package OOPsConceptPart2;
//Usbank is interface , it is the parent class of HSBCBank .

public interface USBank {

	
	int min_Bls =100;
	
	public void debit ();
	
	public void credit ();
	
	public void moneyTransfar();
	
	
//samary of interfce 
	//Only method declaration 
	//no method body ---only method prototype 
	//in Interface, we can declare the variables , and variable are by static nature 
	//Variable vlaues will not be changed 
	//No static method in interface ( because interface is a part of OOPs concept , it is object and obj can not part of staic method 
	//No main methods in intrerface 
	//we can not create the object of interfce
	//Interface is obstract in nature 
	
}
