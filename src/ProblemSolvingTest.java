import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
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
  // - test an empty set
  // - test a set where none start with A
  // - test a set with only a single element
  // - more you can think of!

  @Test
  void testAllStartWithA_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_noneStartWithA() {
    // arrange
    Set<String> input = Set.of("big", "crazy", "delta");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_singleTrue() {
    // arrange
    Set<String> input = Set.of("Adam");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_containsNullAndEmptyString() {
    // arrange
    // learning point: Set.of since Java 9+ does not allow null
    // throws NullPointerException before set even created
    // Google search btw offered solution, test passes now
    Set<String> input = new HashSet<>(Arrays.asList("Apple", "", null));
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
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
  // emptySet - false
  // nullSet - false
  // contains null but no empty string (should return false)
  // contains null AND empty string (should return true)

  @Test
  void testHasEmptyString_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_emptySet() {
    // arrange
    Set<String> input = null;
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_containsNullOnly() {
    // arrange
    Set<String> input = new HashSet<>(Arrays.asList("scaredy", null, "cat"));
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_containsEmptyAndNull() {
    // arrange
    Set<String> input = new HashSet<>(Arrays.asList("so", null, "", "tired"));
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
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
  // empty set (returns 0)
  // null set (returns 0)
  // singleWord (returns length of the word)
  // includesEmptyString (should return length of longest non-empty string)
  // null and valid strings (should return longest actual string)

  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_nullSet() {
    // arrange
    Set<String> input = null;
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_singleWord() {
    // arrange
    Set<String> input = Set.of("bedtime");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(7, actual);
  }

  @Test
  void testMaxLength_includesEmptyString() {
    // arrange
    Set<String> input = Set.of("", "four", "seven");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);
  }

  @Test
  void testMaxLength_containsNull() {
    // arrange
    Set<String> input = new HashSet<>(Arrays.asList(null, "alpha", "beta"));
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);
  }

  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration
  // same unit tests types as maxLength but
  // emptyString will return 0 (length of shortest string)

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("walk", "dog", "lets", "go");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_nullSet() {
    // arrange
    Set<String> input = null;
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_singleWord() {
    // arrange
    Set<String> input = Set.of("exhausted");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(9, actual);
  }

  @Test
  void testMinLength_includesEmptyString() {
    // arrange
    Set<String> input = Set.of("", "four", "seven");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMinLength_containsNull() {
    // arrange
    Set<String> input = new HashSet<>(Arrays.asList(null, "hi", "world"));
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }
}
