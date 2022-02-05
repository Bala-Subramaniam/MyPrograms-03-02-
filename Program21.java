package trainingPackage;

public class Program21 {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		a=5;
		b=3;
		c = ++a-b-0; //pre increment a = 6 subs by b value 3
		d = a%b++;   //post increment Value 3 in b and then a%b performed
		e = a*b+5;   // a=6 a*b perform first then adds up with 5
		f=69>>>2;

		System.out.println(c+","+d+","+e+","+f);
		

	}

}
