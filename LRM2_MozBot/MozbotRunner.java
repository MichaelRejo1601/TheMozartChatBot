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
    public static void main() throws Exception
	{
		Mozbot moz = new Mozbot();
		Scanner in = new Scanner (System.in);
				
		System.out.println("---------------");
		System.out.println(moz.giveAutomated("Greeting"));
		String statement = in.nextLine();
		System.out.println(moz.giveAutomated("Aknowledge"));
		System.out.println("What would you like to know about me?");
	
		while (true)
		{		
			statement = in.nextLine();
			String filtered = moz.filter(statement);
			ArrayList<String> phrase = moz.tokenize(filtered);
			if (moz.respond(phrase, filtered).equals("end"))
			{
			    break;
			}
			System.out.println(moz.respond(phrase, filtered));
			
		}
		System.out.println(moz.giveAutomated("Conclusion"));
	}
}
