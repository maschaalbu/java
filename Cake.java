package chapter9;

public class Cake {
	
	protected String flavor;
	protected double price;
	
	public Cake(String flav) {
		
		System.out.println("Constructor for Cake");
		this.flavor = flav;
		
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
