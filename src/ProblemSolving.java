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
    if (words.size()>=1){
      for (String currentWord : words) {
        if (currentWord.charAt(0)=='a'||currentWord.charAt(0)=='A'){
          continue;
        }
        else {
          return false;
        }
      }
      return true;
    }
    else {
      return false;
    }
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
    if (words.size()>=1) {
      for (String currentWord : words) {
        if (currentWord.isEmpty()){
          return true;
        }
        else {
          continue;
        }
      }
      return false;
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
    if (words.size()>=1) {
      int maxLength = 0;
      for (String currentWord : words){
        if (currentWord.length()>maxLength){
          maxLength = currentWord.length();
        }
        else {
          continue;
        }
      }
      return maxLength;
    }
    return 0;
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
    if (words.size()>=1){
      int minLength = Integer.MAX_VALUE;
      for (String currentWord : words) {
        if (currentWord.length()<minLength) {
          minLength = currentWord.length();
        }
        else {
          continue;
        }
      }
      return minLength;
    }
    return Integer.MAX_VALUE;
  }
}