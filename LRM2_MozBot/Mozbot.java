import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.io.*;
/**
 * Write a description of class Mozbot here.
 *
 * @author Michael Rejo, Likhit Gudisay, Ritvik Penchala
 * @version (a version number or a date)
 */
public class Mozbot
{
    /** declaration of the brought */
    public Mozbot(){}
    public String filter (String p) {
        /** filters extra stuff: non-letters, double spaces, trims ending and starting spaces, puts in lowercase */
        String a = p.replaceAll("[^a-zA-Z ]", "").trim().replaceAll(" +", " ").toLowerCase();
        return a;
    }
    public ArrayList<String> tokenize (String p) {
        /** Tokenizes words into a list */
        ArrayList<String> phrase = new ArrayList(Arrays.asList(p.split(" ")) ); ;
        return phrase;
    }
    public String respond (ArrayList<String> p, String a) throws Exception{
        String b = readLine(filter(a));
        if (find(p, "bye") || find(p, "goodbye")){return "end";}
        else if (find(p, "hi") || find(p, "hello")){return giveAutomated("Greeting");}
        else if (find(p, "who") && find(p, "you")){return "My name is Wolfgang Amadeus Mozart, I am a musician.";}
        else if (find(p, "your") && find(p, "age")){return "I was 37 years old when I died.";}
        else if (find(p, "famous")){return "Rondo Alla Turca is the most famous song I’ve written.";}
        else if (find(p, "favourite") && find(p, "piece")){return "My favourite piece is the Clarinet Concerto.";}
        else if (find(p, "wrote") && find(p, "sonato")){return "That was me! Did you like it?";}
        else if (find(p, "born")){return "I was born on January 27, 1756.";}
        else if (find(p, "from")){return "I am from Salzburg, Austria";}
        else if (find(p, "cause") && find(p, "death")){return "I died due to a severe fever on December 5, 1791";}
        else if (find(p, "aloysia")){return "I fell in love with Aloysia, who was the daughter in a musical family.";}
        else if (find(p, "language")){return "I spoke German at home.";}
        //vibe check easter egg
        else if ((find(p, "are") && (find(p, "how") && find(p, "you")) || find(p, "vibe"))){return "I’m doing well if I do say so myself! How are you?";}
        else if (find(p, "you") && find(p, "learn")){return "I practiced a lot and made sure to use the resources and connections I had to learn more.";}
        else if (find(p, "you") && find(p, "jokester")){return "Oh so is that what you’ve heard? It might be true >:).";}
        else if (find(p, "constanze")){return "Constanze is my lovely wife who supported me in my career.";}
        else if (find(p, "marriage") && find(p, "date")){return "I was married to Constanze on August 4, 1782";}
        else if (find(p, "idols") || find(p, "rolemodels")){return "My musical idols were Haydn, Bach, and Handel";}
        else if (find(p, "Amadeus") && find(p, "movie")){return "That movie was ridiculous! Do you really think that is real?";}
        else if (find(p, "age") && find(p, "start")){return "I started music at the age of 6 and quickly gained experience.l";}
        else if (find(p, "beethoven")){return "Interesting fact: I tutored the famous musician for nearly two weeks in 1787.";}
        else if (find(p, "music") && find(p, "hard")){return "Music is never a matter of being hard. It needs creativity and passion.";}
        else if (find(p, "job")){return "I make most of my earnings from tutoring music. Sometimes I even sell music or conduct performances for some extra cash.";}
        else if (find(p, "religion") || find(p, "religious")){return "I am a devout Roman Catholic.";}
        else if (find(p, "favorite") && find(p, "instrument")){return "My favourite instrument to use is the violin, but I also consistently use the piano..";}
        else if (find(p, "phone") || find(p, "electronic")){return "I’m afraid I do not know what that word means. A bit too modern Bruhaps.";}
        else if (find(p, "children")){return "I have 6 children: four sons and two daughters.";}
        else if (find(p, "chatbot")){return "What is a chatbot?";}
        else if (find(p, "genre") && find(p, "music")){return "My favourite music genre is classical, but I am open to exploring other types.";}
        else if (find(p, "what") && find(p, "classical")){return "Classical music is a genre that originated in 1730 after the Baroque period and lasted till 1820. Composers from this time did not have  use ornaments much in their music.";}
        //easter eggs
        else if (find(p, "made") && find(p, "you")){return "I was brought back to life by Ritvik, Likhit, and Michael";}
        else if (find(p, "glitch") && find(p, "system")){return "Bravo 6 going dark";}
        else if (find(p, "yes") || find(p, "no")){return "Huh. Expand please.";}
        else if (find(p, "frick") || find(p, "crap")){return "I’m not sure I appreciate that. Perhaps we could keep things a little more holy here? (not that I am exactly innocent either)";}
        else if (find(p, "im")){return giveAutomated("Acknowledge");}
        else if (b != null) {return b;}
        return "I didn't understand that...";
    }
    public String giveAutomated(String t){
      /** switchcase to check for type of randomized message: greeting, filler, conclusion, acknowledgement*/
      switch(t){
        case "Greeting":
          return randomChoice(new String[]{"Hello there! How are you?","Hi, I'm Wolfgang! Is all going well?","A new student? Who are you?"});
        case "Aknowledge":
          return randomChoice(new String[]{"How intresting.","Oh, I see.","Delightful!"});
        case "Filler":
          return randomChoice(new String[]{"How is our conversation going?","Do you have anymore questions?","What is something interesting about you?"});
        case "Conclusion":
          return randomChoice(new String[]{"Bye!","It was nice chatting.","Thanks for visiting me!"});
      }
      return "Oopsies";
    }
    public boolean find(ArrayList<String> phrase, String goal){
      /** checks to see if the substring is within the message */
      int psn = phrase.indexOf(goal.toLowerCase());
      if (psn >= 0){return true;}
      return false;
    }
    public String randomChoice(String[] choices){
      /** picks a random number for the switchcase */
      Random r=new Random();
      int randomNumber=r.nextInt(choices.length);
      return choices[randomNumber];
    }
    public String readLine(String goal) throws Exception
    {
        /*
        BufferedWriter writer = new BufferedWriter(new FileWriter("Storage.txt"));
        writer.write(newData);
        writer.close();
        */
        try {
            BufferedReader bufferreader = new BufferedReader(new FileReader("Storage.txt"));
            String line;
            while ((line = bufferreader.readLine()) != null) {
                if (filter(line).toLowerCase().equals(goal.toLowerCase())){
                    return bufferreader.readLine();
                }
                bufferreader.readLine();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;

    }

}
