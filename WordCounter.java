import java.util.HashMap;
import java.util.HashSet;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    // Associate each word with a count.
    private final HashMap<String, Integer> counts;
    private Responder newMap;
    
    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
        newMap = new Responder();
        newMap.fillResponseMap();
    }
    
    /**
     * Update the usage count of all words in input except for those in the fillResponseMap method in the Responder class.
     * @param input A set of words entered by the user.
     */
    public  void addWords(HashSet<String> input)
    {
        HashMap<String, String> pleaseWork = newMap.responseMapHell();
        for(String word : input) {
            
            if(!pleaseWork.containsKey(word))
            {
                int counter = counts.getOrDefault(word, 0);
                counts.put(word, counter + 1);
            }
        }
    }
    
    /**
     * Prints a word count of used words.
     */
    public void usageCountOfEachWord()
    {
        System.out.println(counts);
    }
}
