//StringEx1.java

import java.util.*;

public class StringEx1{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter words:");
		String line = kb.nextLine() + " ";
		String word = "";
		String ans = "";
		for(char ch: line.toCharArray()){
			if (ch == ' '){
				if (word.length() != 4){
					ans += word + " ";
				}
				word = "";
			}
			else{
				word += ch;
			}
		}
		System.out.println(ans.trim());
	}
}