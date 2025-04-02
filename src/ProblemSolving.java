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

    boolean truthTeller = false;
    for(String item: words)
    {
      if(Character.toUpperCase(item.charAt(0)) == 'A')
      {
        truthTeller = true;
      }
      else
      {
        truthTeller = false;
        break;
      }
    }
    return truthTeller;
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

    boolean truthTeller = false;

    if(words.contains(""))
    {
      truthTeller = true;
    }
    else
    {
      truthTeller = false;
    }
    

    if(words.size() == 0)
    {
      truthTeller = true;
    }

    

    return truthTeller;
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

    int longestValue = 0;
    
    for(String item: words)
    {
      if(longestValue <= item.length())
      {
        longestValue = item.length();
      }
    }


    return longestValue;
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

    int smallestInt = Integer.MAX_VALUE;

    for(String item: words)
    {
      if(smallestInt >= item.length())
      {
        smallestInt = item.length();
      }
    }

    if(words.isEmpty() && smallestInt > 0)
    {
      smallestInt = 0;
    }

    return smallestInt;
  }
}