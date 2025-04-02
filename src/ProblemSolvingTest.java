import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  //  - test a set where none start with A
  //  - test a set with only a single element
  //  - more you can think of!

  @Test
  void testAllStartWithA_trueEmptySet() 
  {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseAllElements() 
  {
    // arrange
    Set<String> input = Set.of("Nirvana", "utopia", "paradise");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_trueSingleElement() 
  {
    // arrange
    Set<String> input = Set.of("A");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseWordsStartWithEmptySpaces()
  {
    // arrange
    Set<String> input = Set.of(" armadillo", "  Arcanine", "   asbestos");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_falseWordsStartWithNumbersOrSymbols()
  {
    // arrange
    Set<String> input = Set.of("4rmadillo", "@rcanine", "8bestos","&BBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertFalse(actual);
  }


  //// hasEmptyString method tests ////


   @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!
  
  @Test
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseAllSpaceElements() {
    // arrange
    Set<String> input = Set.of(" ", "  ", "   ", "    ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseNullElementNoEmptyStrings() {
    // arrange
    Set<String> input = new HashSet<>();
    input.add(null);
    input.add("armadillo");
    input.add("Arcanine");
    input.add("utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueNullElementWithEmptyString() {
    // arrange
    Set<String> input = new HashSet<>();
    input.add(null);
    input.add("armadillo");
    input.add("Arcanine");
    input.add("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }


  //// maxLength method tests ////


  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!


  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_emptySpaces() {
    // arrange
    Set<String> input = new HashSet<>();
    input.add("          ");
    input.add("           ");
    input.add("            ");
    input.add("by");
    input.add("a");
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMaxLength_nullElement() {
    // arrange
    Set<String> input = new HashSet<>();
    input.add("by");
    input.add("a");
    input.add(null);
    input.add("commodius");
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }


  //// minLength method tests ////
    
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration


  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_emptySpaces() {
    // arrange
    Set<String> input = new HashSet<>();
    input.add(" ");
    input.add("  ");
    input.add("   ");
    input.add("commodius");
    input.add("vicus");
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
  }

  @Test
  void testMinLength_nullElement() {
    // arrange
    Set<String> input = new HashSet<>();
    input.add("by");
    input.add(null);
    input.add("commodius");
    input.add("vicus");
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

}
