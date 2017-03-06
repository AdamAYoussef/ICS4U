//BasicEx4.java

import java.util.*;

public class BasicEx4{
	public static void main(String[]args){
		int fact = 1;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = kb.nextInt();
		for(int i = 1; i <= num; i ++){
			fact *= i;
		}
		System.out.println(fact);
	}
}