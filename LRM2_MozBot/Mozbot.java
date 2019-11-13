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
    public String respond (ArrayList<String> p) {
      /** if/elif/else statments that check for keywords and responses */
      if (find(p, "hi") || find(p, "hello")){System.out.println(giveAutomated("Greeting"));}
      else if (find(p, "bye") || find(p, "goodbye")){System.out.println(giveAutomated("Conclusion"));}
      else if (find(p, "who") && find(p, "you")){System.out.println("My name is Wolfgang Amadeus Mozart, I am a musician.");}
      else if (find(p, "your") && find(p, "age")){System.out.println("I was 37 years old when I died.");}
      else if (find(p, "famous")){System.out.println("Rondo Alla Turca is the most famous song I’ve written.");}
      else if (find(p, "favourite") && find(p, "piece")){System.out.println("My favourite piece is the Clarinet Concerto.");}
      else if (find(p, "wrote") && find(p, "sonato")){System.out.println("That was me! Did you like it?");}
      else if (find(p, "born")){System.out.println("I was born on January 27, 1756.");}
      else if (find(p, "from")){System.out.println("I am from Salzburg, Austria");}
      else if (find(p, "cause") && find(p, "death")){System.out.println("I died due to a severe fever on December 5, 1791");}
      else if (find(p, "aloysia")){System.out.println("I fell in love with Aloysia, who was the daughter in a musical family.");}
      else if (find(p, "language")){System.out.println("I spoke German at home.");}
      //vibe check easter egg
      else if ((find(p, "how") && find(p, "you")) || find(p, "vibe")){System.out.println("I’m doing well if I do say so myself! How are you?");}
      else if (find(p, "you") && find(p, "learn")){System.out.println("I practiced a lot and made sure to use the resources and connections I had to learn more.");}
      else if (find(p, "you") && find(p, "jokester")){System.out.println("Oh so is that what you’ve heard? It might be true >:).");}
      else if (find(p, "constanze")){System.out.println("Constanze is my lovely wife who supported me in my career.");}
      else if (find(p, "marriage") && find(p, "date")){System.out.println("I was married to Constanze on August 4, 1782");}
      else if (find(p, "idols") || find(p, "rolemodels")){System.out.println("My musical idols were Haydn, Bach, and Handel");}
      else if (find(p, "Amadeus") && find(p, "movie")){System.out.println("That movie was ridiculous! Do you really think that is real?");}
      else if (find(p, "age") && find(p, "start")){System.out.println("I started music at the age of 6 and quickly gained experience.l");}
      else if (find(p, "beethoven")){System.out.println("Interesting fact: I tutored the famous musician for nearly two weeks in 1787.");}
      else if (find(p, "music") && find(p, "hard")){System.out.println("Music is never a matter of being hard. It needs creativity and passion.");}
      else if (find(p, "job")){System.out.println("I make most of my earnings from tutoring music. Sometimes I even sell music or conduct performances for some extra cash.");}
      else if (find(p, "religion") || find(p, "religious")){System.out.println("I am a devout Roman Catholic.");}
      else if (find(p, "favorite") && find(p, "instrument")){System.out.println("My favourite instrument to use is the violin, but I also consistently use the piano..");}
      else if (find(p, "phone") || find(p, "electronic")){System.out.println("I’m afraid I do not know what that word means. A bit too modern Bruhaps.");}
      else if (find(p, "children")){System.out.println("I have 6 children: four sons and two daughters.");}
      else if (find(p, "chatbot")){System.out.println("What is a chatbot?");}
      else if (find(p, "genre") && find(p, "music")){System.out.println("My favourite music genre is classical, but I am open to exploring other types.");}
      else if (find(p, "what") && find(p, "classical")){System.out.println("Classical music is a genre that originated in 1730 after the Baroque period and lasted till 1820. Composers from this time did not have  use ornaments much in their music.");}
      //easter eggs
      else if (find(p, "made") && find(p, "you")){System.out.println("I was brought back to life by Ritvik, Likhit, and Michael");}
      else if (find(p, "glitch") && find(p, "system")){System.out.println("Bravo 6 going dark");}
      else if (find(p, "yes") || find(p, "no")){System.out.println("Huh. Expand please.");}
      else if (find(p, "frick") || find(p, "crap")){System.out.println("I’m not sure I appreciate that. Perhaps we could keep things a little more holy here? (not that I am exactly innocent either)");}
      else if (find(p, "im")){System.out.println(giveAutomated("Acknowledge"));}
      else {System.out.println(giveAutomated("Filler"));}
    }
    public String giveAutomated(String t){
      /** switchcase to check for type of randomized message: greeting, filler, conclusion, acknowledgement*/
      switch(t){
        case "Greeting":
          return randomChoice(new String[]{"Hello there! How are you?","Hi, I'm Wolfgang! Is all going well?","A new student? Who are you?"});
        case "Aknowledge":
          return randomChoice(new String[]{"How intresting.","Oh, I see.","Delightful!"});
        case "Filler":
          return randomChoice(new String[]{"How is our conversation going?","Do you have anymore questions?","What is something interesting about you?"})
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
}
