package chapter9;

public class WeddingCake extends Cake{
	
	private int tiers;
	
	public WeddingCake() {
		super("Chocolate");
		System.out.println("Constructor for Wedding Cake");
	}

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}

	
}
