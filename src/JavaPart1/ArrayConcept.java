package JavaPart1;

// 1 Dimension/ single Dimension array concept 

public class ArrayConcept {

	public static void main(String[] args) {
		
		// To store similar data type in a array variable
		
		//1. Int array 
		//loest bound index is =0
		//uper bound index is =n-1 ( n is the size of the array.
		
		int i[] =new int[4];
		i[0]=10; // here not allow any fraction value because it is the int data type.
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[1]);// 20 
		System.out.println(i.length);
		
		// To get all the value of array , used for loop / while loop
		//For loop 
		for (int j=0;j<i.length;j++){
			System.out.println(i[j]);
			
			
		}
		
		//2. string array
		String s[]=new String[3];
		s[0]="I have to learn Al-quran";
		s[1]="Selenium";
		s[2]=" Englishing writing practics ";
		
		System.out.println(s[2]); // Englishing writing practics 
		System.out.println(s.length);
		
		
	//for loop : find out all string the array value
		
		for(int a=0;a<s.length;a++) {
			System.out.println(s[a]);
			
		}
				
				
		//3.duble array
		double du[]=new double[3];
		du[0]=1.90;
		du[1]=2.90;
		du[2]=1.90;
		System.out.println(du[2]);
		System.out.println(du.length);
		
		for(int d1=0;d1<du.length;d1 ++) {
		System.out.println(du[d1]);
		}
		
		//char array
		char c[]=new char[4];
		c[0]='A';
		c[1]='0';
		c[2]='2';
		c[3]='%';
		
System.out.println(c[3]);
		
		System.out.println(c.length);
		
		//for loop : To find out all char value of the array, uesed for loop
		
		for (int c1=0;c1<c.length;c1++) {
			System.out.println(c[c1]);
			
			
		}
		
		//boolean array
		boolean bo[]=new boolean[2];
		bo[0]=true;
		bo[1]=false;
		System.out.println(bo[1]);
		System.out.println(bo.length);
		
		//object array: object array is a supper class , it is support different data types in the values
		
		Object ob[]=new Object[4];
		ob[0]="Name: Rabiul";
		ob[1]="male";
		ob[2]="age: 32";
		ob[3]='A';
		
		// for loop = to print all the of object array used for loop or while loop
		for(int ob1 =0; ob1<ob.length;ob1++) {
		
			System.out.println(ob[ob1]);
			
			
		}
		//ob[4]="20.89";// not allaw index 4 it will exceeds the size of the index
		
		//System.out.println(ob[4]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		System.out.println(ob.length);
		
		//Summary: 
		// To print all value of the array used for loop or while loop 
		// To find out size of the array used, . length function 
		//Advantage of array: I can store multiple values in a single variable. 
		//Disadvantage of array: Size is fixed -- it is called static array -- to over come that
		//situation used collection(arraylist, hastable, --it called dynamic array.
		// Store only similar data type --- to over come that situation used, object array (used different data types)
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		

	}

}
