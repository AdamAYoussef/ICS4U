//if1.java

import java.util.*;

public class If1 {
	public static void main(String[]args){
		Scanner kb = new Scanner (System.in);
		System.out.println("What is your mark?");
		double mark = kb.nextDouble();
		if (mark >= 70){
			System.out.println("You pass");
		}
		else{
			System.out.println("You suck.");
		}
	}
}