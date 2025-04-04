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
    // assert
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
  void testAllStartWithA_singleElementStartsWithA() {
    Set<String> input = Set.of("apple");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_singleElementDoesNotStartWithA() {
    Set<String> input = Set.of("banana");
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
  void testHasEmptyString_emptySet() {
    Set<String> input = Set.of();
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_multipleEmptyStrings() {
    Set<String> input = Set.of(" ", "", "hello");
    boolean actual = ProblemSolving.hasEmptyString(input);
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_singleEmptyString() {
    Set<String> input = Set.of("");
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
  void testMaxLength_singleWord() {
    Set<String> input = Set.of("extraordinary");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(13, actual);
  }

  @Test
  void testMaxLength_allSameLength() {
    Set<String> input = Set.of("cat", "dog", "bat");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(3, actual);
  }

  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_multipleWords() {
    Set<String> input = Set.of("hello", "world", "a", "sun");
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
  void testMinLength_singleWord() {
    Set<String> input = Set.of("amazing");
    int actual = ProblemSolving.minLength(input);
    assertEquals(7, actual);
  }

  @Test
  void testMinLength_allSameLength() {
    Set<String> input = Set.of("dog", "cat", "bat");
    int actual = ProblemSolving.minLength(input);
    assertEquals(3, actual);
  }
}
