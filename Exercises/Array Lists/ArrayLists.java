//ArrayLists.java

import java.util.*;

public class ArrayLists{
	static int[]nums = new int[10];
	static int size = 0;
	
	public static void add(int x){
		if(size < nums.length){
			nums[size] = x;
			size++;
		}
		else{
			int[]n2 = new int[size + 10];
			for(int i = 0; i < size; i++){
				n2[i] = nums[i];
			}
			nums = n2;
			nums[size++] = x;
		}
	}
}