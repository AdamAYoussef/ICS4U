//MyRobot.java

import java.util.*;

class MyRobot{
	 //toDegrees(double angle)
	 //Fields
	 
	 private double x, y, heading;
	 
	 //Methods
	 
	 public void MyRobot(double x, double y, double heading){
	 	this.x = x;
	 	this.y = y;
	 	this.heading = heading;
	 }
	 
	 public MyRobot(){
	 	x = 0;
	 	y = 0;
	 	heading = 0;
	 }
	 
	 public void turn(double ang){
	 	heading = ((heading + ang) % 360 + 360) % 360;
	 }
	 
	 public void advance(double dis){
	 	double a = Math.toRadians(heading);
	 	x += Math.cos(a) * dis;
	 	y += Math.sin(a) * dis;
	 }
	 
	 public String toString(){
	 	return String.format("x:%.1f y:%.1f Ang:%.1f", x, y, heading);
	 }
}

public class OOPEx1{
}	 
	 