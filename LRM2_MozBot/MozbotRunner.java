;import java.util.Scanner;
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
        String temp = "";
        boolean retrieving = false;
        boolean storing = false;
        while (true)
        {       
            statement = in.nextLine();
            String filtered = moz.filter(statement);
            ArrayList<String> phrase = moz.tokenize(filtered);
            if (retrieving){
                moz.writein(moz.retrieve(), statement);
                System.out.println(moz.giveAutomated("Aknowledge"));
                retrieving = false;
             }
            else if (storing){
                moz.replace(moz.retrieve().indexOf(temp), statement);
                System.out.println(moz.giveAutomated("Aknowledge"));
                storing = false;
            }
            else{
                if (moz.respond(phrase, filtered).equals("end"))
                {
                    break;
                }
                else if (moz.respond(phrase, filtered).equals("..."))
                {
                    moz.writein(moz.retrieve(), filtered);
                    System.out.println("How would YOU respond to that?");
                    retrieving = true;
                }
                else if (moz.respond(phrase, filtered).equals("ask"))
                {
                    temp = moz.randomQuestion(moz.retrieve());
                    System.out.println(moz.randomQuestion(moz.retrieve()));
                    storing = true;
                }
                else {System.out.println(moz.respond(phrase, filtered));}
            }
        }
        System.out.println(moz.giveAutomated("Conclusion"));
    }
}
