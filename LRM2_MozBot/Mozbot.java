
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
        String a = p.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        return a;
    }
    public String[] tokenize (String p) {
        String[] phrase = p.split(" ") ;
        return phrase;
    }
    public String respond (String p[]) {
        return "";
    }
    public String giveAutomated(String t){
        return t;
    } 

}
