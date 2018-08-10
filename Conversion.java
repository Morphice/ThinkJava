/**
 * 
 */
import java.util.*;
/**
 * @author Vinny
 *
 */
public class Conversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inch;
		final double CM_Per_Inch = 2.54;
		double cm;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many inches? ");
		inch = keyboard.nextInt();
		cm = inch * CM_Per_Inch;
		System.out.print(inch + " in = ");
		System.out.println(cm + " cm");

	}

}
