package chapter9;

public class Banana extends Fruit{
	
	public void peel() {
		System.out.println("Peeling banana");
	}
	
	public void makePuree() {
		System.out.println("Making a banana puree");
	}
	
	@Override
	public void makeJuice() {
		System.out.println("Making banana juice");
	}
	
	

}
