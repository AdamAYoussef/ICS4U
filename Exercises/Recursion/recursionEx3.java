//recursionEx3.java

import java.util.*;

public class recursionEx3{
	public static void main(String[]args){
		System.out.println(bin(25));
	}
	public static String bin(int n){
		if(n <= 1){
			return "" + n;
		}
		else{
			return bin(n / 2) + ("" + n%2);
		}
	}
}