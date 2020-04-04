package JavaPart1;

public class IncrementandDecrement {

	public static void main(String[] args) {

		//++
		//--
				int i = 1;
				int j=i++; //post increment , here first assigned the value then it will increment 
				System.out.println(i);//i=2   //j=1  and i= 2
				System.out.println(j);//j=1
				
				int a=1; //++a =here a first increment the value a= 1+1=2 then assigned b value so, here b value =2
				int b=++a; //pre increment
				System.out.println(a);//a=2
				System.out.println(b);//b=2
				
				int m=2;  
				int n=m--; //post decrement ,first assinged the value then increment 
				System.out.println(m);//m=1
				System.out.println(n);//n=2
				
				int p=2;
				int q= --p;// pre decrement
				System.out.println(p);//p=1
				System.out.println(q);//q=1
	}

}
