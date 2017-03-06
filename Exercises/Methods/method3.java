//method3.java
//Method Overloading

public class method3{
	public static int avg(int a, int b){
		return (a + b) / 2;
	}
	
	public static double avg(double a, double b){
		return (a + b) / 2;
	}
	
	public static double avg(double a, double b, double c){
		return (a + b + c) / 3;
	}
	
	public static void main(String[]args){
		int x = avg(7, 10);
		double y = avg(7.0, 10);
		double z = avg(5, 6, 7);
		System.out.println(x + "," + y + "," + z); 
	}	
}