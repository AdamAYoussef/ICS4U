//BasicEx2.java

import java.util.*;

public class BasicEx2{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		double tot = 0;
		System.out.println("Base:");
		double base = kb.nextDouble();
		System.out.println("# of terms:");
		int exp = kb.nextInt();
		for (int i = 0; i < exp; i ++){
			tot += Math.pow(base, i);
		}
		System.out.println(tot);
	}
}