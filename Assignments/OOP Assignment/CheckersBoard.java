//CheckersBoard.java
//Adam Youssef
//This program displays moves in checkers and 
//returns if certain moves are valid. It also counts
//how many black or red pieces are left on the board.

import java.util.*;

class CheckersBoard{
	 
	//Fields
	 
	public static final int BLACK = 1; //represents black chips
	public static final int RED = 2; //represents red chips
	public static final int EMPTY = 0; //represents empty spaces
	
	private int turn = BLACK; //sets initial turn
	private boolean startSet = false;
	private int startX, startY; //starting point
	
	//Checker board
	private int[][]board = {{2, 0, 2, 0, 2, 0, 2, 0},
						 	{0, 2, 0, 2, 0, 2, 0, 2},
						 	{2, 0, 2, 0, 2, 0, 2, 0},
						 	{0, 0, 0, 0, 0, 0, 0, 0},
						 	{0, 0, 0, 0, 0, 0, 0, 0},
						 	{0, 1, 0, 1, 0, 1, 0, 1},
						 	{1, 0, 1, 0, 1, 0, 1, 0},
						 	{0, 1, 0, 1, 0, 1, 0, 1}};
	
	public boolean move(int x1, int y1, int x2, int y2){ 
 		if(!startSet){ 
 			startX = x1; 
 			startY = y1; 
 			startSet = true; 
 		}
 		
 		// Keeps cases on the board and target position is empty
 		if(x1 >= 0 && x1 <= 7 && y1 >= 0 && y1 <= 7 && board[y2][x2] == EMPTY && board[startY][startX] == turn){
 			if(x1 == x2 && y1 == y2){ //base case
 				board[y1][x1] = turn;
 				startSet = false;
 				turn = 3 % (turn + 1) + 1;  // Change turn
 				return true;
 			}
 			
 			// Checks if new location is available
 			if (x1-1 >= 0 && y1+(turn - (3%(turn+1)+1)) >= 0 && y1+(turn - (3%(turn+1)+1)) <= 7 && move(x1-1, y1+(turn - (3%(turn+1)+1)), x2, y2)){ //checks if new location is open
 				board[y1][x1] = EMPTY;
 				return true;
 			}
 			
 			if(x1+1 <= 7 && y1+(turn - (3%(turn+1)+1)) >= 0 && y1+(turn - (3%(turn+1)+1)) <= 7 && move(x1+1, y1+(turn - (3%(turn+1)+1)), x2, y2)) { 
 				board[y1][x1] = EMPTY;
 				return true;
 			}
 			
 			// checks if opponents piece is in the way
 			if(x1-1 >= 0 && y1+(turn - (3%(turn+1)+1)) >= 0 && y1+(turn - (3%(turn+1)+1)) <= 7 && board[y1+(turn-(3%(turn+1)+1))][x1-1] == 3 % (turn + 1) + 1){
 				if (x1-2 >= 0 && y1+(turn - (3%(turn+1)+1))*2 >= 0 && y1+(turn - (3%(turn+1)+1))*2 <= 7 && move(x1-2, y1+(turn-(3%(turn+1)+1))*2, x2, y2)){
 					board[y1][x1] = EMPTY;
 					board[y1+(turn-(3%(turn+1)+1))][x1-1] = EMPTY;
 					return true;
 				}
 				else{
 					return false;
 				}	
 			}
 			
 			// check if opponent piece is in the way
 			if(x1+1 >= 0 && y1+(turn - (3%(turn+1)+1)) >= 0 && y1+(turn - (3%(turn+1)+1)) <= 7 && board[y1+(turn-(3%(turn+1)+1))][x1+1] == 3 % (turn + 1) + 1){
 				if(x1+2 >= 0 && y1+(turn - (3%(turn+1)+1))*2 >= 0 && y1+(turn - (3%(turn+1)+1))*2 <= 7 && move(x1+2, y1+(turn-(3%(turn+1)+1))*2, x2, y2)){
 					board[y1][x1] = EMPTY;
 					board[y1+(turn-(3%(turn+1)+1))][x1+1] = EMPTY;
 					return true;
 				}
 				else{
 					return false;
 				}
 			}
 			else{
 				return false;
 			}
 		}
 		else{
 			return false;
 		}	
	}
 		
 		  
	
	public int count(int colour){
		int count = 0;
		//looks through board for wanted colour and counts them
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(board[j][i] == colour){
					count ++;
				}
			}
		}
		return count;
	}
	
	public void display(){
		//prints picture of board 
		System.out.println("_________________"); 
		for (int i = 0; i < 8; i++) { 
			for (int j = 0; j < 8; j++) { 
				if (board[i][j] != 0){
				System.out.printf("|%d", board[i][j]);
				} 
				else{
					System.out.print("| "); 
				}
			}	 
			System.out.print("|\n"); 
			System.out.print("|_|_|_|_|_|_|_|_|\n"); 
		} 
	} 
 
}	