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
  void testAllStartWithA_falseAllElements() {
    // arrange
    Set<String> input = Set.of("green", "utopia", "blue");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_trueSingleElement() {
    // arrange
    Set<String> input = Set.of("apple");
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

  @Test
  void testHasEmptyString_trueOnlyEmpty() {
    // arrange
    Set<String> input = Set.of("");
    // assert
    assertTrue(ProblemSolving.hasEmptyString(input));
  }

  @Test
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // assert
    assertFalse(ProblemSolving.hasEmptyString(input));
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

  @Test
  void testMaxLength_allSameLength() {
    // arrange
    Set<String> input = Set.of("cat", "dog", "log");
    // assert
    assertEquals(3, ProblemSolving.maxLength(input));
  }

  @Test
  void testMaxLength_withEmptyString() {
    // arrange
    Set<String> input = Set.of("", "hi", "hello");
    // assert
    assertEquals(5, ProblemSolving.maxLength(input));
  }

  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // assert
    assertEquals(0, ProblemSolving.maxLength(input));
  }
    
  @Test
  void testMinLength_basic() {
    // arrange
    Set<String> input = Set.of("armadillo", "hi", "a");
    // assert
    assertEquals(1, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_allSameLength() {
    // arrange
    Set<String> input = Set.of("bat", "cat", "hat");
    // assert
    assertEquals(3, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_withEmptyString() {
    // arrange
    Set<String> input = Set.of("", "hello", "world");
    // assert
    assertEquals(0, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_singleElement() {
    // arrange
    Set<String> input = Set.of("longword");
    // assert
    assertEquals(8, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // assert
    assertEquals(Integer.MAX_VALUE, ProblemSolving.minLength(input));
  }
}
