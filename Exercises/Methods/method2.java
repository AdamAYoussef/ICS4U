//method1.java
//All functions in java are actually methods.

import java.util.*;

public class method2{
	public static void main(String[]args){
		int[]n = {8, 6, 7, 5, 3, 0, 9};
		addOne(n);
		System.out.println(Arrays.toString(n));
		String name = "Amanda Mao";
		respect(name);
		System.out.println(name);
	}
	
	public static void addOne(int[]nums){
		for(int i = 0; i < nums.length; i++){
			nums[i] += 1;
		}
	}
	
	public static String respect(String name){
		name = "Dr. " + name;
		return name;
	}
}