
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words) {
        Map<String, Integer> wordMap = new HashMap<>();
        
        if (words == null || words.isEmpty()) {
            return wordMap; // Return an empty map if input is null or empty
        }
        
        // Split the input string into words
        String[] wordsArray = words.split(" ");
        
        // Iterate through the array of words
        for (String word : wordsArray) {
            // Trim whitespace around the word
            word = word.trim();
            // Skip empty words
            if (word.isEmpty()) {
                continue;
            }
            // If the word is already in the map, increment its count
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        return wordMap;
    }
}
