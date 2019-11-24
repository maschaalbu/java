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
		
	        slice(greena);
		slice(bananana);
		slice(greenApple);  
		
		Fruit yellowapple = new Banana();
		yellowapple.makeJuice();
		
		yellowapple = new Apple();
		yellowapple.makeJuice();
		
		
	}
		public static void slice(Fruit fruit) {
		if(fruit instanceof Apple) {
			System.out.println("Here is your sliced apple");
		}
		else if(fruit instanceof Banana) {
			System.out.println("Here is your sliced banana");
		}
	}
	
	

}
