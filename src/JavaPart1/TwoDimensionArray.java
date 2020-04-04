package JavaPart1;

//2 Dimension array concept 

public class TwoDimensionArray {

	public static void main(String[] args) {
	
		String x [][]=new String [3][5];   // declear the row and clums here  //here 3 rows and 5 clums
		
		System.out.println(x.length); //x.length = total number of rows=3
		System.out.println(x[0].length); //5 is total number of cloms 
		
		// now store the string data 
		
		//1st row
		
		x[0][0]="A";
		x[0][1]="Rabiul ";
		x[0][2]="Rizvan";
		x[0][3]="Sume";
		x[0][4]="ABC";
		
		System.out.println(x[0][4]);
		System.out.println(x[0][2]);
		
		// 2nd row
		
		x[1][0]="A1";
		x[1][1]="Rabiul1 ";
		x[1][2]="Rizvan1";
		x[1][3]="Sume1";
		x[1][4]="ABC1";
		
		System.out.println(x[1][2]);
		
		//3rd row
		x[2][0]="A2";
		x[2][1]="Rabiul2 ";
		x[2][2]="Rizvan2";
		x[2][3]="Sume2";
		x[2][4]="ABC2";
		
	System.out.println(x[2][2]);
	System.out.println(x.length);
	
	//to print all the values of 2 dim arrray : use for loop
	//row =0, col= 0to 4
	//row =1, col= 0 to 4
	//row =2, col = 0 to 4
	
	//To print all the value of 2 dimension array used for loop or while loop
	
	for (int row=0;row<x.length;row++)     // x.length is total rows
		for (int colum =0; colum<x[0].length; colum ++)
			{
		System.out.println(x[row][colum]);
		
		
	}
		
	//	Summary of 2 Dimension array
		// difference between 1 and 2 dimension array is 1 [] bracket is 1 dimension array
	//2 dimensin array is 2 [] [] bracket.
	//A one-dimensional array is a list of variables with the same datatype, whereas the two-Dimensional array is ‘array of arrays’ having similar data types. 
		
	
	 System.out.println("########some way do the  int data type for two dimension array#########");
	
	
		int i[][]=new int [2][3]; // declear the int value and 2 row and 3 cloum
		
		//1st row ,below the store the data
		
		i[0][0]=20;
		i[0][1]=30;
		i[0][2]=40;
		
		//2nd row
		i[1][0]=200;
		i[1][1]=300;
		i[1][2]=400;
		
		System.out.println(i[1][0]);  //200
		System.out.println(i.length); //2 row 
		System.out.println(i[0].length);// 3 cloums
		
	for (int D=0; D<i.length;D++)
	for (int B=0; B<i[0].length;B++) {
		
		System.out.println(i[D][B]);
		
	}
	
		

	 System.out.println("@@@@@@@@@@@@some way do the  double data type for two dimention@@@@@@@@");
	
	double du[][]=new double[2][3]; 
	
//	1st row
	du[0][0]=10.10;
	du[0][1]=20.10;
	du[0][2]=30.10;
	
	
//2nd row
	du[1][0]=30.10;
	du[1][1]=40.10;
	du[1][2]=50.10;
	
	System.out.println(du.length); //row 2
	System.out.println(du[0].length); //colum 3
	
	for (int row=0;row<=du.length;row++)
		for(int colum =0;colum<du[0].length;colum++) {
			System.out.println(du[row][colum]);
		}
		
	
	/*int [][] anIntegerArray; // declaring an two dimensional array of Integers
byte[][] anByteArray; // declaring an two dimensional array of Bytes
short[][] anShortArray; // declaring an two dimensional array of Shorts
long[][] anLongArray; // declaring an two dimensional array of Longs
float[][] anFloatArray; // declaring an two dimensional array of Floats
double[][] anDoubleArray; // declaring an two dimensional array of Doubles
boolean[][] anBooleanArray; // declaring an two dimensional array of Booleans
char[][] anCharArray; // declaring an two dimensional array of Chars
String[][] anStringArray; // declaring an two dimensional array of Strings*/
	
	
	
		
	
		

	}

}
