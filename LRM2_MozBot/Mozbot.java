import java.util.Arrays;  
import java.util.ArrayList; 
import java.util.Random;

/**
 * Write a description of class Mozbot here.
 *
 * @author Michael Rejo, Likhit Gudisay, Ritvik Penchala
 * @version (a version number or a date)
 */
public class Mozbot
{
    
    public Mozbot()
    {
                
    }
    public String filter (String p) {
        //filters extra stuff: non-letters, double spaces, trims ending and starting spaces, puts in lowercase
        String a = p.replaceAll("[^a-zA-Z ]", "").trim().replaceAll(" +", " ").toLowerCase();
        return a;
    }
    public ArrayList<String> tokenize (String p) {
        ArrayList<String> phrase = new ArrayList(Arrays.asList(p.split(" ")) ); ;
        return phrase;
    }
    public String respond (ArrayList<String> p) {
        if (find(p, "bc") || find(p, "all")){System.out.println("return statement");}
	else if (find(p, "bc") || find(p, "all")){System.out.println("return statement");}
	return "Oops Something Went Wrong";
    }
    public String giveAutomated(String t){
        switch(t){
            case "Greeting": 
                return randomChoice(new String[]{"Hello there! How are you?","Hi, I'm Wolfgang! Is all going well?","A new student? Who are you?"});
            case "Aknowledge":
                return randomChoice(new String[]{"How intresting.","Oh, I see.","Delightful!"});
            case "Conclusion":
                return randomChoice(new String[]{"Bye!","It was nice chatting.","Thanks for visiting me!"});
        
        }
        return "Oopsies";
    } 
    public boolean find(ArrayList<String> phrase, String goal)
    {
        int psn = phrase.indexOf(goal.toLowerCase());
        if (psn >= 0)
        {
            return true;
        }
        return false;
    }
    public String randomChoice(String[] choices)
    {
        Random r=new Random();
        int randomNumber=r.nextInt(choices.length);
        return choices[randomNumber];
    }
}
