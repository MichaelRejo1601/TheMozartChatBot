import java.util.Scanner;
import java.util.Arrays;  
import java.util.ArrayList; 
import java.util.Random;
/**
 * Write a description of class MozbotRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MozbotRunner
{
    // instance variables - replace the example below with your own
    public static void main()
	{
		Mozbot moz = new Mozbot();
		ArrayList<String> phrase = moz.tokenize(moz.filter("kek"));
		System.out.println(moz.respond(phrase));
		/*
		//System.out.println (moz.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
		//	System.out.println (moz.getResponse(statement));
			statement = in.nextLine();
		}
		*/
	}
}
