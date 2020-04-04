package JavaPart1;
//  String Concatenation

public class StringConcatenation {

	public static void main(String[] args) {
		
int a= 200;
int b= 300;

String s = "Rabiul";
String s1 = "Rizven";

System.out.println(a+b);
System.out.println(s+s1);
System.out.println(a+b+s+s1); //500RabiulRizven
System.out.println(s+s1+a+b); //RabiulRizven200300
System.out.println(s+s1 +(a+b)); //RabiulRizven500

System.out.println("the value of a is:"+ a); //the value of a is:200
System.out.println("The value of b is:"+b);

System.out.println("the addition of a and b is:" +(a+b)); //the addition of a and b is:500

	}

}
