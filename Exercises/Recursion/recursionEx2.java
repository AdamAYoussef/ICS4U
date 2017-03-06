//recursionEx2.java

import java.util.*;

public class recursionEx2{
	public static void main(String[]args){
		String line = "dog";
		caps(line);
	}
	
	public static void caps(String word){
		caps("", word.toLowerCase());
	}
	
	public static void caps(String pick, String left){
		if(left.equals("")){
			System.out.println(pick);
		}
		else{
			caps(pick + left.substring(0, 1).toUpperCase(), left.substring(1));
			caps(pick + left.substring(0, 1), left.substring(1));
		}
	}
	
	/*changes lower case to upper case 
	 *char c = 'a';
	 *Character.toUpperCase(c);
	 *(char)(c - 32); //values are off by 32
	 *65 'A'
	 *97'a'
	 */
}