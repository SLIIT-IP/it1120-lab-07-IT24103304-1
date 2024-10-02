import java.util.Scanner;

public class IT24103304Lab7Q3 {
	public static double discountRate = 5;
	public static void main (String[] args) {
		
		//Declear the Variables
		int n = 0;
		double discount,total,amount = 0;
		char mode = 'c';
		Scanner input = new Scanner (System.in);
		
		//Main Loop
		while(n < 5){
			
			//Counter
			n += 1;
			
			//Input Marks
			System.out.println("Customer " + n);
			
			System.out.print("Enter Total Bill Amount: ");
			amount = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for Other): ");
			mode = input.next().charAt(0);
			
			switch (mode){
				case 'C' , 'c':
					discount = amount * (discountRate/100.0);
					System.out.println("Discount is : " + discount);
					total = amount - discount;
					break;
				
				case 'O' , 'o':
					System.out.println("No discount applicable");
					total = amount;
					break;
					
				default:
					System.out.println("Payment Mode is Not Valid");
					continue;
			}
			System.out.println("Amount to be Paid: " + total);
		}
	}
}