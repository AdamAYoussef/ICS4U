//bits.java

import java.util.*;

public class bits{
	public static void main(String[]args){
		bits(5);
	}
	public static void bits(int n){
		bits("", n);
	}
	
	public static void bits(String pick, int n){
		if (n == 0){
			System.out.println(pick);
		}
		else{
			bits(pick + "0", n - 1);
			bits(pick + "1", n - 1);
		}
	}
}