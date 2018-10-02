package AlannaChpter3Prog1;
import java.util.Scanner;
/* 
 * Alanna Botscharow
 * 9/18
 * Chapter 3 assignment program number 1 
 */
public class Chapter3Program2 {

	public static void main(String[] args) {
		// Convert Celcius to Fahrenheit, and display the result. 
			//Conversion formula: Fahrenheit = (9.0/5) * Celcius + 32. 
		Scanner input = new Scanner(System.in);
		
		//prompt the user. 
		
		System.out.println("Enter the temperature in degrees Celcius!");
			double celcius = input.nextDouble();
		
		double fahrenheit = (9.0/5) * celcius + 32; 
		
		System.out.println("The temperature in Fahrenheit is: "+fahrenheit);
	}

}
