import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
  void testAllStartWithA_randomWords() {
    // arrange
    Set<String> input = Set.of("Life", "Strength", "Journey");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }
  @Test
  void testNoneStartWithA_singleLetters() {
    // arrange
    Set<String> input = Set.of("A", "a", "b");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }
  @Test
  void testAllStartWithA_specialCharandNumbers() {
    // arrange
    Set<String> input = Set.of("a!#$%", "a25436", "A..#%%#");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

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
  void testHasEmptyString_multipleEmptyStrings() {
    // arrange
    Set<String> input = Set.of("     ", "  t  ", " ", " t  e  s   t");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }



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
  void testMaxLength_specialCharacters() {
    // arrange
    Set<String> input = Set.of(")*&^", ")(*&)", "!@#$%^&^%$#$", "$%^&");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(12, actual);
  }

  @Test
  void testMaxLength_numbers() {
    // arrange
    Set<String> input = Set.of("1234567890", "984", "-1736", " 2 4 6");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(10, actual);
  }
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration
  @Test
  void testMinLength_basicTest() {
    // arrange
    Set<String> input = Set.of("Uno", "Mbilli", "Three", "numberInAnotherLanguageICan'tThinkOf");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }
  @Test
  void testMinLength_specialCharacters() {
    // arrange
    Set<String> input = Set.of("", "", "", "");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }


}
