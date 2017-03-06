//Basic2.java
//Using Scanner object

import java.util.*;

public class Basic2{
	public static void main(String [] args){
		double can, us;
		Scanner kb = new Scanner(System.in);
		System.out.println("How much Canadian?");
		can = kb.nextDouble();
		us = can * 0.78;
		// System.out.println("That is $" + us + " USD");
		System.out.printf("That is $%.2f\n", us);
	}
}