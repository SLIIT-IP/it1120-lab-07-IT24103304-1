import java.util.Scanner;

public class IT24103304Lab7Q1B {
	public static void main (String[] args) {
		
		//Declear the Variables
		int n = 0, s = 0;
		double average, total = 0;
		String grade;
		
		Scanner input = new Scanner (System.in);
		
		//Main Loop
		for (s = 1; s <= 3; s++) {
			
			System.out.println("Student " + s);
			
			System.out.print("Enter Marks:");
			
			int sub1= input.nextInt();
			int sub2= input.nextInt();
			int sub3= input.nextInt();
			int sub4= input.nextInt();
				
			//Calculate Total
			total = (sub1+sub2+sub3+sub4);
			//Calculate Average
			average = total / 4.0;
			
			//Define Grade from average
			grade = (average >= 75) ? "Distinction" : 
					(average >= 50 && average < 75) ? "Credit" : "Fail";
		
			//Output
			System.out.println ("Average is : " + average);
			System.out.println ("Overall Grade is : " + grade);
		}
	}
}