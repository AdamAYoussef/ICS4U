//BasicEx1.java

import java.util.*;

public class BasicEx1{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		double num = 0;
		double big = 0;
		double small = Double.POSITIVE_INFINITY;
		double tot = 0;
		double avg = 0;
		int count = 0;
		while (true){
			System.out.println("Enter number (0 to exit):");
			num = kb.nextDouble();
			if (num == 0){
				break;
			}
			tot += num;
			count ++;
			if (big < num){
				big = num;
			}
			if (small > num){
				small = num;
			}
		}
		avg = tot / count;
		System.out.println("Average: " + avg);
		System.out.println("Biggest: " + big);
		System.out.println("Smallest: " + small); 
	}
}
