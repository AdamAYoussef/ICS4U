//String1.java

import java.util.*;

public class String1{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = kb.nextLine();
		if (name.equals("Rachel Tao")){
			System.out.println("Hi");
		}
		else{
			System.out.println("Who are you?");
		}
	}
}