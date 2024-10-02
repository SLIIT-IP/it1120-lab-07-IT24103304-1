public class IT24103304Lab7Q2B {
	public static void main (String[] args) {
		
		//Declear the Variables
		int i = 1,j = 0;
		
		//Main Loop
		for (i = 1; i <= 5; i++) {
			System.out.print(i + "- ");
			//Second Loop
			for (j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
		//Break a Line
		System.out.print("\n");
		}
	}
}