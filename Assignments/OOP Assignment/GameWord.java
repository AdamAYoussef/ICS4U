//GameWord.java
//Adam Youssef
//This program is used to aid in the playing
//of the game of scrabble by counting how many points
//certain words are worth and finding different variations
//of words. 

import java.util.*;

class GameWord{
	 
	 //Fields
	 
	 private String contents; //players letters
	 public static final int RIGHT = 1; //direction for words going right
	 public static final int DOWN = 2; //direction for words going down
	 private ArrayList<String>perm; //List of permutations
	 private String[] points = { "1EAIONRTLSU", "2DG", "3BCMP", "4FHVWY", "5K", "8JK", "0QZ" }; //point values with letters
	 
	 /*1 - normal space
	  *2 - double letter
	  *3 - triple letter
	  *4 - double word
	  *5 - triple word
	  */
	  
	  private int[][]grid = {{5, 1, 1, 2, 1, 1, 1, 5, 1, 1, 1, 2, 1, 1, 5},
	  						 {1, 4, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 4, 1},
	  						 {1, 1, 4, 1, 1, 1, 2, 1, 2, 1, 1, 1, 4, 1, 1},
	  						 {2, 1, 1, 4, 1, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2},
	  						 {1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1},
	  						 {1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1},
	  						 {1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1},
	  						 {5, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 5},
	  						 {1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1},
	  						 {1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1},
	  						 {1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1},
	  						 {2, 1, 1, 4, 1, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2},
	  						 {1, 1, 4, 1, 1, 1, 2, 1, 2, 1, 1, 1, 4, 1, 1},
	  						 {1, 4, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 4, 1},
	  						 {5, 1, 1, 2, 1, 1, 1, 5, 1, 1, 1, 2, 1, 1, 5}
	  };
	  
	 //Methods
	 
	 public GameWord(String words){
	 	contents = words;
	 }
	 
	 public String reverse(){
	 	return new StringBuffer(contents).reverse().toString(); //reverses string using string buffer class
	 }
	 
	 public boolean anagram(String otherWord){
	 	//makes char string of words
		String[]check = contents.split("");
		String[]ans = otherWord.split("");
		//orders arrays in same order
		Arrays.sort(check);
		Arrays.sort(ans);
		
		//checks if arrays are the same
		return Arrays.equals(check, ans);
	}
	
	//returns anagram answer
	public boolean anagram(GameWord otherWord){
		return anagram(otherWord.toString());
	}
	
	public int pointValue(int x, int y, int direction){
		int point = 0;
		int multiplier = 1; //word multiplier
		
		if(direction == RIGHT){
			//checks if word has gone off board
			if(x + contents.length() > 14){
				return 0;
			}
			for(int i = 0; i < contents.length(); i++){ //runs through every letter in contents
				for(String check: points){
					if(check.indexOf(contents.charAt(i)) != -1) {  // Find point value for letter
						// Add point value or increase word multiplier
						if (grid[y][x+i] <= 3){
							if (Character.getNumericValue(check.charAt(0)) == 0){
								point += 10 * grid[y][x+i];
							}
							else{
								point += Character.getNumericValue(check.charAt(0)) * grid[y][x+i];
							}
						}
						else{
							multiplier *= grid[y][x+i] - 2;
							if (Character.getNumericValue(check.charAt(0)) == 0){
								point += 10;
							}
							else{
								point += Character.getNumericValue(check.charAt(0));
							}
						}
					}	 
				}
			}
		}
		
		if(direction == DOWN){
			//checks if word has gone off board
			if(y + contents.length() > 14){
				return 0;
			}
			for(int i = 0; i < contents.length(); i++){ //runs through every letter in contents
				for(String check: points){
					if(check.indexOf(contents.charAt(i)) != -1) {  // Find point value for letter
						// Add point value or increase word multiplier
						if (grid[y+i][x] <= 3){
							if (Character.getNumericValue(check.charAt(0)) == 0){
								point += 10 * grid[y+i][x];
							}
							else{
								point += Character.getNumericValue(check.charAt(0)) * grid[y+i][x];
							}
						}
						else{
							multiplier *= grid[y+i][x] - 2;
							if (Character.getNumericValue(check.charAt(0)) == 0){
								point += 10;
							}
							else{
								point += Character.getNumericValue(check.charAt(0));
							}
						}
					}	 
				}
			}
		}
	}
	
	public ArrayList<String> permutations(){
		perm = new ArrayList<String>();
		permutations(contents, "");
		return perm;
	}
	
	private void permutations(String left, String pick){
		//if there are no more letters the picked letters are added to ArrayList
		if("".equals(left)){
			perm.add(pick);
		}
		else{
			//adds letters to string until all are gone
			for(int i = 0; i < left.length(); i++){
				permutations(left.substring(0, i) + left.substring(i+1), pick + left.charAt(i)); 
			}
		}
	}
	
	public String toString(){
		return contents;
	}
	 
}
	 
		