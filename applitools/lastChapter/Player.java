package finalChapter;

public class Player {

	public  String name;	
	public  String guess;
	
	
	
	public  String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGuess() {
		return guess;
	}



	public void setGuess(String guess) {
		this.guess = guess;
	}



	Player(String name){
		
		setName(name);
		
		System.out.println("Hi! I am " + name + " Let's play!");
		
	}
	
	
}
