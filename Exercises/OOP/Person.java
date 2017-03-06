//Person.java

import java.util.*;

class Person{
	/* Fields - The variables that describe that person. More
	 *			importantly, seperate one person from another.
	 */
	 
	 private String name;
	 private String gender;
	 
	 /* Methods - things a person can DO.*/
	 
	 public void hi(){
	 	if(gender.equals("male")){
	 		System.out.println("Sup.");
	 	}
	 	else{
	 		System.out.println("Hi, I'm " + name + ". How are you today?");
	 	}
	 }
	 
	 /* Rule of Thumb:
	 *All methods are public
	 *All fields are private
	 */
	 
	 public Person(String n, String g){
	 	name = n;
	 	gender = g;
	 }
	 
	 /*This is called a Constructor. All classes we
	  *make will have a constructor. It is used to set
	  *up objects. It has no return type.
	  */
	  
	  /*Accessor methods - allow controlled access to fields.
	  *Also called getter and setter methods.
	  */
	  
	  public String getName(){
	  	return name;
	  }
	  public void setName(String n){
	  	name = n;
	  }
	  
	  public void hi(Person p){
	  	System.out.println("Hi, " + p.name + ". I'm " + name);
	  }
}