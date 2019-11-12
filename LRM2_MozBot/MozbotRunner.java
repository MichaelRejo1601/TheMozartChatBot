import java.util.Scanner;
/**
 * Write a description of class MozbotRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MozbotRunner
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
	{
		Mozbot moz = new Mozbot();
		
		System.out.println (moz.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (moz.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
