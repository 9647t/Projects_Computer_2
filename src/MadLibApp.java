import java.util.Scanner;


public class MadLibApp {
    public static void main(String[] args) throws Exception {
    String[] nouns = new String[5];
    String[] verbs = new String[3];
    String[] adjectives = new String[5];
    
    
    
    String [] story = {
        "A" , "along the pathway of an mountain, and",
        "sat down on a nearby rock.", "Of course I forgot to bring snacks... thought the",
        "The", "was scrambling through a", "backpack," , "until a", "noise disturbed the silence.",
        "Is that a bear? or is it just a", "shuffling through the weeds?", "The", "down the pathway to check," ,
        "and stumbled across a", " bear."
        




    };

        Scanner input = new Scanner(System.in);
       
       
        System.out.print("Enter five nouns. Example: person, place, thing, idea: ");
        for (int i = 0; i < nouns.length; i++) {
            nouns[i] = input.nextLine();
           // System.out.print("Enter new noun: ");
            
            
        }
      

       
       
       
       System.out.print("Enter three past tense verbs. Example: Ran, jumped, exploded ");
       for (int i =0; i < verbs.length; i++) {
        verbs[i] = input.nextLine();
        //System.out.print("Enter new verb: ");
        
        
       }
    



       System.out.print("Enter five adjectives. Example: Describing a noun. " );
       for (int i = 0; i < adjectives.length; i++) {
        adjectives[i] = input.nextLine();
       // System.out.print( "Enter new adjective:");
       
    
      }
       
     
     System.out.print("Here's your story: " + story[0] + " "
       + nouns[0] + " " + verbs[0] + " " + story[1] + " " + story[2] +
       " " + story[3] + " " + nouns[0] + ". " + story[4] + " " + nouns[0] +
       " " + story[5] + " " + adjectives[0] + " " + story[6] + " " + story[7] + " " + adjectives[1] + " " +
       story[8] + " " + story[9] + " " + nouns[1] + " " + story[10] + " " + story[11] + " " + nouns[0] + " "
      + verbs[1] + " " + story[12] + " "  + story[13] + " " + adjectives[2] + story[14]
    
    );
     
    
    
    
    
    
    
    
    
    
    
    }
}

