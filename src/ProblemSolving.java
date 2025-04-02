import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

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
    if(words.isEmpty()){
      return true;
    }

    AtomicBoolean condition = new AtomicBoolean(true);

    words.forEach(word -> {
      if(!word.startsWith("A")){
        condition.set(false);
      }
    });

    return condition.get();
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
    if(words.isEmpty()){
      return false;
    }

    AtomicBoolean condition = new AtomicBoolean(true);

    words.forEach(word -> {
      if(!word.isEmpty()){
        condition.set(false);
      }
    });

    return condition.get();
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
    if(words.isEmpty()){
      return 0;
    }

    AtomicInteger maxLength = new AtomicInteger(0);

    words.forEach(word -> {
      if(maxLength.get() < word.length()){
        maxLength.set(word.length());
      }
    });

    return maxLength.get();
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
    if(words.isEmpty()){
      return Integer.MAX_VALUE;
    }

    AtomicInteger minLength = new AtomicInteger(Integer.MAX_VALUE);

    words.forEach(word -> {
      if(minLength.get() > word.length()){
        minLength.set(word.length());
      }
    });

    return minLength.get();
  }
}