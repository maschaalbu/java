package finalChapter;

import java.util.Scanner;

public class CoinTossGame {
	
	static Scanner scanner = new Scanner(System.in);
		
	
public static void main(String[] args) {
	
	CoinTossGame game = new CoinTossGame();
	
	   
	Player pl1 = new Player(game.askName());
	Player pl2 = new Player(game.askName());
	pl1.setGuess(game.askGuess());
	if(pl1.getGuess().equalsIgnoreCase(Coin.HEADS)){
        pl2.setGuess(Coin.TAILS);
    }else{
        pl2.setGuess(Coin.HEADS);
    }
		
	
	System.out.println("");
	
	
	
	System.out.println(pl1.getGuess());
	
	System.out.println(pl2.getGuess());
	 	
	 
		System.out.println("");
			
	System.out.println(pl1.getGuess());	
	System.out.println(pl2.getGuess());
	
	System.out.println("Now we will flip the coin... ");
	Coin coin = new Coin();
	coin.flipCoin();
	
	 System.out.println("The coin landed on " + coin.getSide());
	 
	 game.winner(pl1, pl2, coin);
	
	CoinTossGame.scanner.close();
	
	}
	
	public String askName() {
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "! Welcome to the game!!");
		return name;
		
	}
	
	public  String askGuess() {
		System.out.println("Player 1 please enter your guess " + Coin.HEADS + " or " + Coin.TAILS); 
		String guess = scanner.nextLine();
				
		return guess;
		
	}
	
	
	public void winner(Player p1, Player p2, Coin flip) {
		String winner;
		if(flip.getSide().equals(p1.getGuess())) {
			winner = p1.getName();
		}else {
			winner = p2.getName();
		}
		 System.out.println("The winner is " + winner);		
		
	}
	
	
}
