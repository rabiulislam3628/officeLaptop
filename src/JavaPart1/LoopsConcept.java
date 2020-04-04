package JavaPart1;

// Loops Concepts 

public class LoopsConcept {

	public static void main(String[] args) {
		
		 //while loop will eecute if condition is true , if it is not meet it will break 
	     //here a= 0 and 0 is less then 10  = so,when we execute the code first it check the condition,
		//if condition is meet then it will execute.
		//again again untille statement is meet or true at that time we used while loop
	     //while (a<=10)
	     //first initialize the value ,then it check it condition if it is meet then it execute again and again ,if it is not meet than it will break 
//dis advantage of while loop : it will generate infinite loop if I don`t give increment/decrement part   
		// while loop
		
		int i=1; //initializaton part //The while loop : This executes a statement for an unknown number of times
		while(i<=20) {  //conditional part 
			System.out.println(i);
			i++; //if do not add increment or decrement it will execute againg and again infinite loop
		}
		
		//while loop another example 
	int w=0;
	while (w<4) {
		System.out.println(w);
		w++;
	}
		
			
		// The only difference between a while loop and for loop is that the for loop repeats the task for a specific number of
		//times but the while loop repeats the task for an unknown number of times
	
		
		/*Different loops and keyword in Java
         The for loop : This executes a statement for a particular number of times
		The while loop : This executes a statement for an unknown number of times, if do not defined the incremint or dicremint part
		The do-while loop : This executes a statement at least for one time*/
		
		
		System.out.println("// ************For LOOP*************************");
		
		//The for loop : This executes a statement for a particular number of times
        
		for (int b=2;b<=10;b++) { // for loop code is the same line ( initialization part+ condition + incremint )
			System.out.println(b);
		}
		
		// print 10 to 1(if i want to go down )
		
		for(int h=10;h>=1;h--) {
			System.out.println(h);
				
		}
		
		for(int k=9;k<30;k++) {
			System.out.println(k);
			
		}
		
System.out.println("do  while loop");

//do while loop

//do while loop it will execute the statement first and later it check the condition 
//in do while loop initializaion ,condition and iteraion (increment/decrement )can not placed in placs
//Only difference between these two loops is that, in while loops, test expression is checked at first but, in do...while loop code is executed at first then the condition is checked. So, the code are executed at least once in do...while loops.
//it is same as while loop but in this loop code or logic will execute at least once.

System.out.println("*****************do while loop*********");

	int a=10;
	
	do 
	{
		System.out.println(a);
		a++;
		
    }while (a<=5);
			
	}

}
