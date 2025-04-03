import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */
  public static boolean allStartWithA(Set<String> words) {

    if (words.size() == 0) {
      return true;
    }

    // convert set into a list to get specific index
    List<String> wordList = new ArrayList<>(words);

    boolean result = false;
    for(int i = 0; i < wordList.size(); i++) {
      if (wordList.get(i).startsWith("A") || wordList.get(i).startsWith("a")) {
        result = true;
      } else{
        result = false;
      }
    }
    return result;
  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) {
    if(words.size() == 0){
      return false;
    }

    List <String> wordList = new ArrayList<>(words);

    for(int i = 0; i < words.size(); i ++){
      if (wordList.get(i).equals("")) {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */
  public static int maxLength(Set<String> words) {

    if(words.size() == 0){
      return 0;
    }

    List<String> wordList = new ArrayList<>(words);
    //set first index to longest length and check rest of the words to see if they are longer
    // if the word is longer, set it to longest


    int longest = wordList.get(0).length();

    for(int i = 1; i < words.size(); i++){
      if(wordList.get(i).length() > longest){
        longest = wordList.get(i).length();
      }
    }

    return longest;
  }

 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) {

    // this also works came is if words.size() == 0
    if (words.isEmpty()) {
      return Integer.MAX_VALUE;
    }
    int min = Integer.MAX_VALUE;

    List<String> list = new ArrayList<>(words);

    for (int i = 0; i < words.size(); i++) {
      if (list.get(i).length() < min) {
        min = list.get(i).length();
      }
    }

    return min;
  }
}