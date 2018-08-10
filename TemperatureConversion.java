/**
 * 
 */

/**
 * @author Vinny
 *
 */
import java.util.*;
public class TemperatureConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conversion formula F = C * 9/5 + 32
		// C to ferenheight
		int Cel;
		Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the temp in Celcious");
double cel = keyboard.nextDouble();

double Fer = (cel * 9/5 + 32);
System.out.println((double)Fer +  " degrees ferenheight" + " equals " + cel + " degrees celcious" );
		
	}

}
