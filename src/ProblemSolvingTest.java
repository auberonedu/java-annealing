import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  // allStartWithA()

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
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_noneStartWithA() {
    // arrange
    Set<String> input = Set.of("banana", "Orange", "pear", "Kiwi");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_singleElement() {
    // arrange
    Set<String> input = Set.of("armadillo");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_nullSet() {
    // arrange
    Set<String> input = null;
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_singleLettersSet() {
    // arrange
    Set<String> input = Set.of("A", "a");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }


  // hasEmptyString()

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
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_nullSet() {
    // arrange
    Set<String> input = null;
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_singleEmptyElement() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_firstElementEmpty() {
    // arrange
    Set<String> input = Set.of("", "apple", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_lastElementEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "red", "utopia", "");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }


  // maxLength()

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
  void testMaxLength_singleWord() {
    // arrange
    Set<String> input = Set.of("orange");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(6, actual);
  }

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
  void testMaxLength_nullSet() {
    // arrange
    Set<String> input = null;
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_singleLetter() {
    // arrange
    Set<String> input = Set.of("z");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMaxLength_multipleSameLengthWords() {
    // arrange
    Set<String> input = Set.of("red", "bye", "get", "buy");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(3, actual);
  }

  @Test
  void testMaxLength_longWordWithOtherWords() {
    // arrange
    Set<String> input = Set.of("abcdefghijklmnopqrstuvwxyz", "bye", "get", "buy");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(26, actual);
  }

  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("blue", "yellow", "orange", "green", "red");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3, actual);
  }

  @Test
  void testMinLength_singleWord() {
    // arrange
    Set<String> input = Set.of("blue");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(4, actual);
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
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_singleLetter() {
    // arrange
    Set<String> input = Set.of("A");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_multipleLetters() {
    // arrange
    Set<String> input = Set.of("a", "b", "c", "d");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_multipleWordsSameLength() {
    // arrange
    Set<String> input = Set.of("blue", "pink", "kiwi", "gray");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(4, actual);
  }

  @Test
  void testMinLength_longWordWithOtherWords() {
    // arrange
    Set<String> input = Set.of("abcdefghijklmnopqrstuvwxyz", "bye", "get", "buy");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3, actual);
  }
}