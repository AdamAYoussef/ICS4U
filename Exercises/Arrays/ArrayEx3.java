import java.util.*;
import java.awt.*;

public class ArrayEx3{
	public static void main(String []args){
		Point [] trees = new Point[10];
		Random rand = new Random();
		Point tree=null;
	
		for(int i=0; i<10; i++){
			boolean ok = false;
			while(!ok){
				int x = rand.nextInt(31); 
				int y = rand.nextInt(31); 
				
				ok = true;
				tree = new Point(x,y);
				for(int j=0; j<i; j++){
					if(trees[j].distance(tree) <3){
						ok = false;
					}
				}
			}
			trees[i] = tree;
			System.out.println(tree.x+", "+tree.y);
		}	
	}
}