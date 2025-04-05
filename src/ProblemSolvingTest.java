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
  void testAllStartWithA_emptySet() {
    Set<String> input = Set.of();
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_noneStartWithA() {
    Set<String> input = Set.of("banana", "cat", "dog");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_singleStartsWithA() {
    Set<String> input = Set.of("Apple");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_singleNotStartWithA() {
    Set<String> input = Set.of("banana");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_containsEmptyString() {
    Set<String> input = Set.of("Apple", "", "Avocado");
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

  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!

  @Test
  void testHasEmptyString_onlyEmptyString() {
    Set<String> input = Set.of("");
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_emptySet() {
    Set<String> input = Set.of();
    boolean actual = ProblemSolving.hasEmptyString(input);
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
  void testMaxLength_emptySet() {
    Set<String> input = Set.of();
    int actual = ProblemSolving.maxLength(input);
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_sameLengthWords() {
    Set<String> input = Set.of("cat", "bat", "hat");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(3, actual);
  }

  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_variedLengths() {
    Set<String> input = Set.of("a", "apple", "banana", "dog");
    int actual = ProblemSolving.minLength(input);
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_emptySet() {
    Set<String> input = Set.of();
    int actual = ProblemSolving.minLength(input);
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_onlyOneElement() {
    Set<String> input = Set.of("hello");
    int actual = ProblemSolving.minLength(input);
    assertEquals(5, actual);
  }

  @Test
  void testMinLength_containsEmptyString() {
    Set<String> input = Set.of("hello", "", "world");
    int actual = ProblemSolving.minLength(input);
    assertEquals(0, actual);
  }
}
