package chapter9;

public class Apple extends Fruit{
	
	 public Apple(){
        setCalories(91);
    }
	
	public void removeSeeds() {
		System.out.println("Removing seeds");
	}
	
	public void diceIntoSlices() {
		System.out.println("Slicing apple");
	}
	
	@Override
	public void makeJuice() {
		System.out.println("Making apple juice");
	}

}
