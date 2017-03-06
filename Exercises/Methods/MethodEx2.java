//MethodEx2.java

import java.util.*;

public class MethodEx2{
	public static void main(String[]args){
		String in = "i like cheese";
		System.out.println(noVowel(in));
	}
	
	//Replace all version
	public static String noVowel(String line){
		String[]vowels = {"a","e", "i", "o", "u"};
		String blank = "";
		for(String v: vowels){
			line = line.replaceAll(v, "");
		}
		return line;
	}
	
	/*public static String noVowels(String lines){
		String ans = "";
		for(char ch: line.toCharArray()){
			if ("aeiou".contains("" + ch)){
				ans += ch;
			}
			return ans;
		}
	}*/
}