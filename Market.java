package chapter9;
public class Market {

	public static void main(String[] args) {
		Fruit greenApple = new Apple();
		
		greenApple.makeJuice();
		
		Apple greena = new Apple();
		greena.diceIntoSlices();
		greena.removeSeeds();
		greena.makeJuice();
		
		
		Banana bananana = new Banana();
		bananana.makePuree();
		bananana.peel();
		bananana.makeJuice();
		
		greena.makeJuice();
		bananana.makeJuice();
		greenApple.makeJuice();
		
		

	}
	
	/*public static void makeJuice(Fruit fruit) {
		if(fruit instanceof Apple) {
			System.out.println("Here is your apple juice");
		}
		else if(fruit instanceof Banana) {
			System.out.println("Here is your banana juice");
		}
	}*/

}
