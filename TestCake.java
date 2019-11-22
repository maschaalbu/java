package chapter9;

public class TestCake {

	public static void main(String[] args) {
		
		Cake tort = new Cake("Vanilla");
		
		tort.setPrice(29.56);
		
		System.out.println("We will make cake with " + tort.getFlavor() + " for you!");
		System.out.println("It will cost you $ " + tort.getPrice());
		
		WeddingCake wedding = new WeddingCake();
		
		wedding.setTiers(4);
		wedding.setPrice(225.98);
		
		System.out.println("Your Weddingcake will be with " + wedding.getFlavor() + " and will have " + wedding.getTiers() + " tiers!!!");
		System.out.println("It will cost you $ " + wedding.getPrice());
		
		BirthdayCake birthday = new BirthdayCake();
		
		birthday.setCandles(25);
		birthday.setPrice(35);
		
		System.out.println("Birthdaycake with " + birthday.getFlavor() + " and " + birthday.getCandles() + " candles.");
		System.out.println("It will cost you $ " + birthday.getPrice());
		

	}

}
