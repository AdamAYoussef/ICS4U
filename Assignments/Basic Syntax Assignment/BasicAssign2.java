//BasicAssign2.java
//Adam Youssef
/*This program takes a string from the user and
 *replaces sequences of blanks with a single blank
 */ 

import java.util.*;

public class BasicAssign2{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter line: ");
		String line = kb.nextLine(); 
		String ans = "";
		int space = 1;
		for(char ch: line.toCharArray()){
			if (ch != ' '){
				ans += ch;
				space = 1;
			}
			if (ch == ' ' && space == 1){
				space = 0;
				ans += ch;
			} 
		}
		System.out.println(ans);
	}
}