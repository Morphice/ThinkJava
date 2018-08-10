/**
 * 
 */

/**
 * @author Vinny
 *
 */
import java.util.Scanner;
import java.util.Random;
public class GuessStarter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("I am thinking of a number between 1 and 100, including 1 and 100.  can you guess what it is?");
System.out.println("Type your guess..");
int Usernum = keyboard.nextInt();
Random random = new Random();
int number = random.nextInt(100) + 1;
System.out.println(number);
int difference = number - Usernum;
System.out.println("You were off by " + difference);


		
	}

}
