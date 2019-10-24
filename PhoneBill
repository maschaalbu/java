import java.util.Scanner;
 

public class PhoneBill {
	
	static Scanner scanner = new Scanner(System.in);
	static double bill = getBill();
	static int overminutes = getMinutes();
	static double overage = overminutes * 0.25;
	
	static double taxCost = (overage+bill)* 0.15;
		
	public static void main(String args[]) {
			
		scanner.close();
		
		System.out.println("Phone Bill Statement ");
		
		printPlan();
		overage();
		tax();
		printTotal();		
	}
	
public static double getBill() {
		
		System.out.println("Enter base cost of the plan: ");			
		double planCost = scanner.nextDouble();	
		return planCost;		
	}

public static int getMinutes() {
	
	System.out.println("Enter overage minutes: ");			
	int overage = scanner.nextInt();	
	return overage;
}

public static void printPlan() {
	
	System.out.println("Plan: $" + bill);
}

public static void overage() {
	
	System.out.println("Overage: $" + String.format("%.2f", overage));
	
}

public static void tax() {
	
	System.out.println("Tax: $" + String.format("%.2f", taxCost));
	
}

public static void printTotal(){
	
	System.out.println("Total: $" + String.format("%.2f", (bill + taxCost + overage)));
}


}
