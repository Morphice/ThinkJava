/**
 * 
 */

/**
 * @author Vinny
 *
 */
import java.util.*;
public class Secondsconversion {

	/**
	 * convert secoonds to hours minutes and seconds format 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
 //int seconds;
 
/// String timeString;
 System.out.println("Please input the total seconds");
int tot_seconds = keyboard.nextInt();
 //int tot_seconds = 5000;
 int hours = tot_seconds / 3600;
 int minutes = (tot_seconds % 3600) / 60;
 int seconds = tot_seconds % 60;

 String timeString = String.format("%02d Hour %02d Minutes %02d Seconds ", hours, minutes, seconds);

 System.out.println(timeString);

	}

}
