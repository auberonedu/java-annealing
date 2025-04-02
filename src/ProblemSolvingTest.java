import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {

  // allStartWithA Tests

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
    Set<String> input = new HashSet<>();
    // act
    boolean result = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(result);
  }

  @Test
  void testAllStartWithA_noneStartWithA() {
    // arrange
    Set<String> input = Set.of("no", "first","letter", "match");
    // act
    boolean result = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(result);
  }

  @Test
  void testAllStartWithA_singleElementStartWithA() {
    // arrange
    Set<String> input = Set.of("a");
    // act
    boolean result = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(result);
  }

  @Test
  void testAllStartWithA_singleElementNoA() {
    // arrange
    Set<String> input = Set.of("b");
    // act
    boolean result = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(result);
  }
  
  @Test
  void testAllStartWithA_OnlyCapitalA() {
    // arrange
    Set<String> input = Set.of("ALL", "ALPHABET", "AARON", "AVACODO");
    // act
    boolean result = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(result);
  }

  // hasEmptyString Tests

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

  // empty set
  @Test
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean result = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(result);
  }

  @Test
  void testHasEmptyString_trueOnlyEmpty() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean result = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(result);
  }

  @Test
  void testHasEmptyString_falseOnlySpaces() {
    // arrange
    Set<String> input = Set.of(" ", "  ", "   ");
    // act
    boolean result = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(result);
  }

  // maxLength Tests

  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  // (multiple words, return length of longest)
  // empty set, return 0
  // Set contains only an empty string, return 0
  // Set contains only a three space string, returns 3
  // all words 1 letter long, return 1
  // a ridiculously long word, accurate count

  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int result = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, result);
  }

  @Test
  void testMaxLength_emptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int result = ProblemSolving.maxLength(input);
    // assert
    assertEquals(result, 0);
  }

  @Test
  void testMaxLength_countSpaces() {
    // arrange
    Set<String> input = Set.of(" ", "  ", "   ");
    // act
    int result = ProblemSolving.maxLength(input);
    // assert
    assertEquals(3, result);
  }

  @Test
  void testMaxLength_allOneLetterWords() {
    // arrange
    Set<String> input = Set.of("I", "A", "T", "Y");
    // act
    int result = ProblemSolving.maxLength(input);
    // assert
    assertEquals(1, result);
  }

  @Test
  void testMaxLength_ridiculouslyLongWord() {
    // arrange
    Set<String> input = Set.of("pneumonoultramicroscopicsilicovolcanoconiosis", "Hippopotomonstrosesquippedaliophobia");
    // act
    int result = ProblemSolving.maxLength(input);
    // assert
    assertEquals(45, result);
  }
    
  // minLength Tests
  
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
    int result = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MIN_VALUE, result);
  }

  @Test
  void testMinLength_emptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int result = ProblemSolving.minLength(input);
    // assert
    assertEquals(result, 0);
  }

  @Test
  void testMinLength_countSpaces() {
    // arrange
    Set<String> input = Set.of(" ", "  ", "   ");
    // act
    int result = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, result);
  }

  @Test
  void testMinLength_allOneLetterWords() {
    // arrange
    Set<String> input = Set.of("I", "A", "T", "Y");
    // act
    int result = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, result);
  }

  @Test
  void testMinLength_ridiculouslyLongWord() {
    // arrange
    Set<String> input = Set.of("pneumonoultramicroscopicsilicovolcanoconiosis", "Hippopotomonstrosesquippedaliophobia");
    // act
    int result = ProblemSolving.minLength(input);
    // assert
    assertEquals(36, result);
  }


}
