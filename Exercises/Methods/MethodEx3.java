//MethodEx3.java

import java.util.*;

public class MethodEx3{
	public static void main(String[]args){
		int[]num = {1, 2, 3, 4, 5};
		System.out.println(odds(num));
	}
	
	public static int[]odds(int[]nums){
		int count = 0;
		for(int n: nums){
			count += n%2;
		}
		int[]ans = new int[count];
		for(int i = nums.length - 1; i >= 0; i--){
			if(nums[i] %2 == 1){
				ans[--count] = nums[i];
			}
		}
		return ans;
	}
}