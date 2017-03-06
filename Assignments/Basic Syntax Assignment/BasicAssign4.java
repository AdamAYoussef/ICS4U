/*BasicAssign4.java
 *Adam Youssef
 *This program finds the average size
 *of a group where two people would have
 *the same birthday
 */
 
import java.util.*;
import java.awt.*;

public class BasicAssign4{
	public static void main(String[]args){
		int[]bdays = new int[365];
		Random rand = new Random();
		int count = 0; //number of birthdays checked
		int tot = 0; //total number of birthdays tested
		int loops = 0; //number of times tested 
		int avg = 0; //total average
		for(int i = 0; i <= 10000; i++){
			int day = rand.nextInt(365); //gets random birthday
			bdays[day] += 1; //puts counter for that birthday
			count += 1;
			if (bdays[day] == 2){ //if two birthdays are on the same day
				loops += 1; //counts how many times tested
				tot += count; //adds number of people's birthdays tested
				count = 0; //brings count to 0 for next group
				Arrays.fill(bdays, 0); //makes all days 0 for next group
				avg = tot / loops;	//calculates average
			}
		}
		System.out.println(avg);
	}
}