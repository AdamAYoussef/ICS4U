//ArrayListEx1.java

import java.util.*;

public class ArrayListEx2{
	public static void main(String[]args){
		ArrayList<String> bob = new ArrayList<String>(Arrays.asList("DOG", "CAT", "BAT", "RAT", "COW"));
		String[]cl = {"PIG", "DOG", "BAT", "FLY", "ART", "EGG"};
		ArrayList<String>steve = new ArrayList<String>(Arrays.asList(cl));
		System.out.println(commonClasses(bob, steve));
	}
	
	public static ArrayList<String> commonClasses(ArrayList<String> c1, ArrayList<String> c2){
		ArrayList<String>ans = new ArrayList<String>(c1);
		ans.retainAll(c2);
		return ans;
	}
}