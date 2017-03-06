/*BasicAssign3.java
 *Adam Youssef
 *This program takes coordinates and gets
 *a line segment from the user and tells them
 *if the coordinates given are on the line.
 */
 
import java.util.*;
import java.awt.geom.*

public class BasicAssign3{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter x coordinate: ");
		int x = kb.nextInt();
		System.out.println("Enter y coordinate: ");
		int y = kb.nextInt();
		System.out.println("Enter x1 coordinate: ");
		int x1 = kb.nextInt();
		System.out.println("Enter y1 coordinate: ");
		int y1 = kb.nextInt();
		System.out.println("Enter x2 coordinate: ");
		int x2 = kb.nextInt();
		System.out.println("Enter y2 coordinate: ");
		int y2 = kb.nextInt();
		
		if (Line2D.ptSegDist(x1,y1,x2,y2,x,y)) = 0){ //checks if point is on line
			System.out.println("Point is on the line.");
		}
		else{
			System.out.println("Point is not on the line.");
		}
	}
}