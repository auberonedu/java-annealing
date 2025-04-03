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
  for (String word: words) {
    if (word.isEmpty() ||Character.toLowerCase(word.charAt(0))!= 'a') {
        return false; //if the word is empty and isn't 'a' then it returns false
      } //end if
  } //end for
  return true; //if it is not empty and is an 'a' then returns true
} //end allStartWithA

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) {
    for (String word : words) {
      if (word.isEmpty()) {
          return true; //empty string is found then returns true
      }
  }
  return false; // no empty strings were found then returns false
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
    int max = 0;

    for (String word : words) {
        if (word.length() > max) {
          max = word.length(); // updates the max if the word is longer than the previous max length
        }
    }
    return max; // returns the length of the word
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
    return Integer.MAX_VALUE;
  }
}