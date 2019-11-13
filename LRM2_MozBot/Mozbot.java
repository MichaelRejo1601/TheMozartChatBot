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
        return "";
    }
    public String giveAutomated(String t){
        switch(t){
            case "Greeting": 
                return randomChoice(new String[]{"Greeting","Greeting","Greeting"});
            case "Aknowledge":
                return randomChoice(new String[]{"Aknowledge","Aknowledge","Aknowledge"});
            case "Conclusion":
                return randomChoice(new String[]{"Conclusion","Conclusion","Conclusion"});
        
        }
        return "Oopsies";
    } 
    public int find(ArrayList<String> phrase, String goal)
    {
        int psn = phrase.indexOf(goal.toLowerCase());
        
        return psn;
    }
    public String randomChoice(String[] choices)
    {
        Random r=new Random();
        int randomNumber=r.nextInt(choices.length);
        return choices[randomNumber];
    }
}
