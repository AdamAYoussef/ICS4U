//BasicEx3.java

import java.util.*;

public class BasicEx3{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter integer (between 1 and 50):");
		int num = kb.nextInt();
		for(int i = 1; i <= num; i++){
			if (num %i == 0){
				System.out.println(i);
			}
		}
	}
}