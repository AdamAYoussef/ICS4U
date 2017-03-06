public class Tamagotchi{
	private int age, hunger, happiness, discipline;
	private String name;
	
	public Tamagotchi(String name){
		this.name = name;
		age = 0;
		hunger = 50;
		happiness = 50;
		discipline = 50;	
	}
	
	// I probably shouldn't have a field and a method both called
	// "age". Java is ok with it, but it's not great style.
	public void age(){
		age += 1;
		happiness = Math.max(0,happiness-1);
		discipline = Math.max(0,happiness-1);
		hunger = Math.min(100,hunger+1);
	}
	
	public void feed(){
		hunger = Math.max(0,hunger-10);
	}
	public void play(){
		happiness = Math.min(100,happiness+10);
	}
	public void scold(){
		discipline = Math.min(100,discipline+10);
	}
	
	public String toString(){
		String [] hunDes = {"So stuffed!", "Feeling good","","Peckish","Starving","FEED ME ... please."};
		String [] hapDes = {"There is only one way out.","The world is so cold.", "meh","","I'm a pretty Pokemon","Every second is better than the last!"};
		String [] disDes = {"I should scold YOU!","Matches are fun to play with!", "You're not the boss of me","","Good day to you.","Can I help you with something?","Rules are fun!"};
		
		int hu = (hunger+19)/20; // I want 0 to be special
		int ha = happiness/20; // I want 100 to be special
		int di = discipline/20; // I want 100 to be special
		
		return String.format("%s: %d %s ** %s ** %s",name,hunger,hunDes[hu],hapDes[ha],disDes[di]  );	
	}
}