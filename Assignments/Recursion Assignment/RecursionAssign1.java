/*RecursionAssign1.java
 *Adam Youssef
 *This program takes an amount of money and finds the best meal to buy
 *so that you can always leave at least a 15% tip along with paying for
 *the meal, then outputs that meal and the percent of the tip.
 */

import java.util.*;

public class RecursionAssign1{
	public static void main(String[]args){
		pickFood(30);
	}
	//global variables
	//list of food items
	static String[]foods = {"Bandera Pizza Bread", "Boston's Pizza Bread", "Garlic Twist Bread", "Milkshake", "Sun-Dried Tomato Bruschetta",
		"Three Cheese Toast", "Three Cheese Toast w/ Bolognese Dip", "Double Order Wings", "Starter Size Wings", "Cactus Nachos", "Cactus Nachos w/ Spicy Chicken", 
			"Baked Ravioli Bites", "Southwest Quesadilla"};
	//list of food prices
	static double[]price = {6.49, 5.35, 7.49, 5.35, 6.99, 6.35, 8.25, 16.49, 8.99, 10.29, 12.29, 8.49, 9.25}; 
	static double best = 0; //best price
	static String bestFood = ""; //foods in best meal choice
	
	//pickFood(money you have)	
	public static void pickFood(double total){
		pickFood("", 0, 0, total); //calls method for use with money we have
		//prints foods and percent tip
		System.out.printf(bestFood + "the tip is " + "%.2f %%", (total-best)/best * 100);
	}
	
	//pickFood(food items, spent money, position in list of foods, money we have)
	public static void pickFood(String ans, double spent, int pos, double total){
		//finds best possible price and meal choice
		if (pos == foods.length){
			//if there is enough money for tip and meal choice
			if (spent * 1.15 <= total){
				//if this is the best price
				if (best * 1.15 < spent * 1.15){
					best = spent; //money spent for this meal is the best price
					bestFood = ans; //this meal is now the best meal
				}
			}
		}
		else{
			//either takes food and adds its price or doesn't
			pickFood(ans +" "+ foods[pos] + ",",spent + price[pos] , pos + 1, total);
			pickFood(ans, spent, pos + 1, total); //always goes to next position
			
		}
	}
}