package exceptionHandling;

public class Excep {

	public static void main(String[] args) {
	
try {
	int d =0;
	int n=20;
	int fraction = n/d;
}
	catch (ArithmeticException e) {
		System.out.println("Exception details:"+e);
	}

finally {
	System.out.println("Inside the finally block");
	int a=10;
	int b=2;
	int c=a+b;
	System.out.println(c);
}
}
	
}
