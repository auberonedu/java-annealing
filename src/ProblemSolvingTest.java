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

  // +TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  //  - test a set where none start with A
  //  - test a set with only a single element
  //  - more you can think of!

  @Test
  void testAllStartsWithA_trueEmptySet() {
    Set<String> input = Set.of();
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testAllStartsWithA_falseNoneA() {
    Set<String> input = Set.of("balloon", "Barovia", "carnival", "Casseopeia");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertFalse(actual);
  }

  @Test
  void testAllStartsWithA_trueOneEmpty() {
    Set<String> input = Set.of("", "Alisaie", "Alphinaud", "aymeric");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testAllStartsWithA_oneItem() {
    Set<String> input = Set.of("a");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testAllStartsWithA_falseSymbol() {
    Set<String> input = Set.of("a", "Actual", "%", "abalone");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertFalse(actual);
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


  // +TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!

  @Test
  void testHasEmptyString_trueAllEmpty() {
    Set<String> input = Set.of("");
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_FalseEmptySet() {
    Set<String> input = Set.of();
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_FalseSymbols() {
    Set<String> input = Set.of("%", "@", "123");
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_TrueSymbols() {
    Set<String> input = Set.of("%", "@", "");
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertTrue(actual);
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


  // +TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!
  @Test
  void testMaxLength_multipleSpaces() {
    // arrange
    Set<String> input = Set.of("     ", " ", "         ", "   ");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_wordWithSpaces() {
    // arrange
    Set<String> input = Set.of("ab   cde", "abcde");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(5, actual);
  }

  @Test
  void testMaxLength_symbols() {
    // arrange
    Set<String> input = Set.of("", "@@ ", "$", "!");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(2, actual);
  }
  
  // +TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration
  @Test
  void testMinLength_wordWithSpaces() {
    // arrange
    Set<String> input = Set.of("ab c");
    int actual = ProblemSolving.minLength(input);
    assertEquals(3, actual);
  }

  @Test
  void testMinLength_multipleSpaces() {
    // arrange
    Set<String> input = Set.of("     ", "  ", "   ", " ");
    int actual = ProblemSolving.minLength(input);
    assertEquals(0, actual);
  }

  @Test
  void testMinLength_symbols() {
    // arrange
    Set<String> input = Set.of("", "@@ ", "$", "!");
    int actual = ProblemSolving.minLength(input);
    assertEquals(0, actual);
  }
}
