//MethodEx1.java

import java.util.*;

public class MethodEx1{
	
	public static int range(int[]nums){
		int max = nums[0];
		int min = nums[0];
		for(int n: nums){
			max = Math.max(n, max);
			min = Math.max(n, min);
		}	
		 return max - min;
	}
	
	public static void main(String[]args){
		int[]n = {1, 2, 3, 4, 5};
		System.out.println(range(n));
	}
}