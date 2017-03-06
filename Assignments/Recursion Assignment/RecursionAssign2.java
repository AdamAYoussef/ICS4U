/*RecursionAssign2.java
 *Adam Youssef
 *This program takes an 8x8 grid for a tank
 *and outputs the fastest time and directions to take
 */

import java.util.*;

public class RecursionAssign2{
	public static void main(String[]args){
		int[][]grid = {{0, 12, 7, 43, 32, 12, 30, 15},
					   {21, 26, 18, 34, 41, 9, 17, 21},
					   {20, 43, 23, 35, 23, 20, 17, 37},
					   {5, 29, 28, 18, 9, 42, 35, 24},
					   {25, 15, 36, 25, 21, 9, 14, 19},
					   {25, 26, 32, 18, 17, 19, 25, 15},
					   {35, 15, 12, 21, 24, 26, 14, 35},
					   {15, 12, 18, 25, 14, 22, 21, 15}
					   };
		tank(grid, 0, 0, "", 0); //calls method
		System.out.println("Fastest time:" + fastTime + ", Directions:" + ans);	
	}
	
	//global variables
	static String ans = ""; //final output for directions
	static int fastTime = 1000; //fastest time
	
	//tank(8x8 grid used, tank's x pos, tank's y pos, directions for each trial, time for each trial)
	public static void tank(int[][]grid, int x, int y, String direc, int time){
		if (x == 7 && y == 7){ //if the tank reaches the final spot
			if (time <= fastTime){ //if this is the fastest time
				fastTime = time; //new fastest time is recorded
				ans = direc; //directions for new fastest time are recorded
			}
		}
		else{
			//if the tank isn't at the final spot
			//goes right and adds time
			if(x < 7){ 
				tank(grid, x + 1, y, direc + "R", time + grid[x][y]); 
			}
			//goes down and adds time
			if(y < 7){
				tank(grid, x, y + 1, direc + "D", time + grid[x][y]);
			}
		}
	}
}