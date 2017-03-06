//method1.java
//All functions in java are actually methods.

public class method1{
	public static void hi(){
		System.out.println("Hello");
	}
	public static void main(String[]args){
		double x = 14;
		System.out.println(square(x));
		System.out.println(x);
	}
	public static double square(double n){ //can use double as well
		n = n * 2;
		return n;
	}
}