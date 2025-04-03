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
  public static boolean allStartWithA(Set<String> words) 
  {
    // If the set is empty, return true
    if (words.size() == 0)
    {
      return true;
    }

    // Check each word to see if it starts with the letter a.
    for (String word : words)
    {
      if (word.startsWith("a") || word.startsWith("A"))
      {
        // Continue checking each word
      }
      else
      {
        // If even one doesn't match, return false
        return false;
      }
      
    }

    // If all match, return true
    return true;

  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) 
  {
    // If the set is empty return false
    if (words.size() == 0)
    {
      return false;
    }

    // Check each word to see if it's an empty string
    for (String word : words)
    {
      if (word.trim() == "")
      {
        // If an empty string exists, return true
        return true;
      }

    }

    // If there are no empty strings, return false
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
  public static int maxLength(Set<String> words) 
  {
    // If set is empty, return 0
    if (words.size() == 0)
    {
      return 0;
    }

    // Variable to hold whatever the max length is
    int maxNum = 0;

    // Check each word, and compare the length against the maxNum variable
    for (String word : words)
    {
      // If the length of the word is bigger than maxNum, make that the new maxNum
      if (word.trim().length() > maxNum)
      {
        maxNum = word.trim().length();
      }

    }

    // Return the maxNum
    return maxNum;

  }

 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) 
  {
    // If the set is empty, return Integer.MAX_VALUE
    if (words.size() == 0)
    {
      return Integer.MAX_VALUE;
    }

    // Variable to whatever the min length is
    int minNum = Integer.MAX_VALUE;

    // Check each word and compare the length against the minNum variable
    for (String word : words)
    {
      // If the length of the word is smaller than minNum, make that the new minNum
      if (word.length() < minNum)
      {
        minNum = word.length();
      }

    }

    // Return the maxNum
    return minNum;

  }

}