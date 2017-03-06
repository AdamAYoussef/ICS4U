//Array1.java

import java.util.*;

public class Array1{
	public static void main(String[]args){
		int[]nums;
		nums = new int[10];
		nums[0] = 42;
		nums[1] = 55;
		int[]n = new int[20];
		String[]words = "this is a test".split(" ");
		char[]lets = "Vincent Massey".toCharArray();
		String line = "Hey, just like Python!";
		for (String word: line.split(" ")){
			System.out.println(word);
		} 
	}
}