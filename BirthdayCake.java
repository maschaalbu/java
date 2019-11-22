package chapter9;

public class BirthdayCake extends Cake{
	
	private int candles;
	
	BirthdayCake(){
		super("Marzipan");
		System.out.println("Constructor for Birthday Cake");
	}

	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}
	
		

}
