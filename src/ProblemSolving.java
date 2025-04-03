import java.util.Set;

public class ProblemSolving 
{

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   * 
   * if you need to check everything in the list, set etc. then dont make your first if statement render true 
   */
  public static boolean allStartWithA(Set<String> words) 
  {

    for(String word : words )
    {
      if (word.charAt(0) != 'a' && word.charAt(0) != 'A')
      return false;
    }
     
    return true;
  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   * if you need to check everything in the list, set etc. then dont make your first if statement render true 
   */
  public static boolean hasEmptyString(Set<String> words) 
  {
    if (words.isEmpty())
    {
    return false;
    }


    for (String word : words) //data type string named words inside the words
    {
      if(word.isEmpty()) //iterating through the strings to see if theres an empty word, if so return true
      {
      return true;
      }
    }
    return false; //other wise return false
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
    if(words.isEmpty())
    {
      return 0;
    }

    int maxLength = 0; //tracker 

    for (String word : words) //creating the object to enter the data set 
    {
      if(word.length() > maxLength) 
      {
        maxLength = word.length(); 
      }
    }

    return maxLength;
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
    if(words.isEmpty())
    {
      return Integer.MAX_VALUE;
    }

    int minLength = Integer.MAX_VALUE;
    for(String word : words) 
    {
      if(word.length() < minLength)
      {
        minLength = word.length();
      }
    }
    return minLength;
  }
}