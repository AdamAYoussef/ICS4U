//ArrayEx1.java

import java.util.*;

public class ArrayEx1{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		double total = 0;
		double[]marks = new double[8];
		for(int i = 0; i < 8; i ++){
			System.out.printf("Enter mark %d: ", i);
			marks[i] = kb.nextDouble();
			total += marks[i];
		}
		Arrays.sort(marks);
		double avg = total / 8;
		for(double mrk: marks){
			String direction = mrk > avg ? "above" : "below";
			System.out.printf("%.1f is %.1f %s average \n", mrk, Math.abs(mrk - avg), direction);
		}	
	}
}