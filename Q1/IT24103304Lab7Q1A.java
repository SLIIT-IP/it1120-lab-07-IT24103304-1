import java.util.Scanner;

public class IT24103304Lab7Q1A {
	public static void main (String[] args) {
		
		//Declear the Variables
		int n = 0;
		double average, total = 0, marks = 0;
		String grade;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Marks for Subjects: ");
		
		//Main Loop
		while(n < 4){
			
			//Counter
			n += 1;
			
			//Input Marks
			System.out.print("Enter Subject Marks " + n + ": ");
			marks = input.nextDouble();
			
			//Calculate Total
			total += marks;
		}
		
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