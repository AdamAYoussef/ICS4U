//Tomagotchi.java

import java.util.*;

class Tomagotchi{
	 
	 private String name;
	 private int age; //in minutes
	 private int happiness;
	 private int discipline;
	 private int hunger;
	 
	 public Tomagotchi(name){
	 	age = 0;
	 	discipline = 50;
	 	hunger = 50;
	 }
	 
	 public void age(){
	 	age += 1;
	 	happiness -= 1;
	 	discipline -= 1;
	 	hunger += 1;
	 }
	 
	 public void feed(){
	 	hunger -= 10;
	 }
	 
	 public void play(){
	 	happiness += 10;
	 }
	 
	 public void scold(){
	 	discipline += 10;
	 }
	 
	 public String toString(){
	 	return String.format;
	 }
}	