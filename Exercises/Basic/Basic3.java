//Basic3.java
// Celcius to Farenheit

import java.util.*;

public class Basic3{
	public static void main(String[]args){
		double cel, far;
		Scanner kb = new Scanner(System.in);
		System.out.println("Temp in Cel?");
		cel = kb.nextDouble();
		far = cel * 1.8 + 32;
		System.out.printf("That is $%.2f\n", far)
	}
	
}
