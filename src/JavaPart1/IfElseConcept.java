package JavaPart1;
//If Else concept  //different comparison operators: <,> <=,>=,!=

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		int q =300;
		int r =50;
		if (r>q) {
			System.out.println("the value r is gagter then q");
		}
		else { 
			System.out.println(" the value q is gater then r");
			
		}
		
		
	int i= 10;
	int j =20;
	
	
	System.out.println("*******if else ==*************");
	
	if(i==j){
		System.out.println("the value i and j are equal ");
		
		}
		
	else {	
System.out.println("the value i and j are not equal ");
	}
	
	System.out.println("*******if else < *************");
	
if (i<j) {
	System.out.println("The value of i is less then j");
}

else {
	System.out.println(" the value of j is gater then i");
	
}

System.out.println("*******if else <=*************");

if (i<=j) {
	System.out.println("the value of j is gater then or equal form i ");
}
else {
	System.out.println("the value of j is not gater then or equal form i");
}

System.out.println("*******Write a logic to find out the hight number****Used Nested if -else statemtnt ********");

int  a1 = 100;
int b1 =200;
int c1 = 300;

if (a1>b1 & a1>c1){ 
	System.out.println("a1 is the greates");}  //false & false = false 
	
	else if(b1>c1)
	{
		System.out.println("b1 is the gretest"); //true & true =true
	}
	else {
		System.out.println("c1 is the gretest");  //false & true = false
	
}


	}
}
