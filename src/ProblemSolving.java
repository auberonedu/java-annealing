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

    if (words == null || words.isEmpty()) {
      return true;
    }

    for (var word : words) {
      if (word.startsWith(String.valueOf('a')) || word.startsWith(String.valueOf('A'))) {
        return true;
      }
      else {
        break;
      }
    }
    return false;
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

    if (words == null || words.isEmpty()) {
      return false;
    }

    for (var word : words) {
      
      if (word.contains(" ")) {
        return false;
      }
      
      if (word.equals("")) {
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

    if (words == null || words.isEmpty()) {
      return 0;
    }

    int longestWord = 0;

    for (var word : words) {

      int holdingWordLength = word.length();

      if (word.contains(" ")) {
        holdingWordLength = word.length() - 1;
      }

      if (holdingWordLength > longestWord) {
        longestWord = holdingWordLength;
      }
    }

    return longestWord;
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