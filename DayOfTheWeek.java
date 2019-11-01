import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		System.out.println("Please enter the number from 1 to 7: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		scanner.close();
		
		for(int i = 0; i < week.length; i++) {
			
			if(number == i+1) {
				
				System.out.print(week[i]);
				
			}
			
		}
		
		//or System.out.println("Corresponding day: " + week[index - 1]);
		
	}
	
}
