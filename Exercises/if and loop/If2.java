// If2.java

import java.util.*;

public class If2{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter mark: ");
		double mark = kb.nextDouble();
		if (mark >= 80){
			System.out.println("A");
		}
		else if (mark >= 70 && mark < 80){
			System.out.println("B");
		}
		else if (mark >= 60 && mark < 70){
			System.out.println("C");
		}
		else if (mark >= 50 && mark < 60){
			System.out.println("D");
		}
		else if (mark < 50){
			System.out.println("F");
		}	
	}
}