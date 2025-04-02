import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {

  // Tests for AllStartWithA

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

  @Test
  void testAllStartWithA_falseAllElements() {
    // arrange
    Set<String> input = Set.of("Herp", "derp", "Twerp");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_trueEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseSingleElement() {
    // arrange
    Set<String> input = Set.of("utopia");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_trueSingleElement() {
    // arrange
    Set<String> input = Set.of("atmosphere");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseStartsWithPunctuation() {
    // arrange
    Set<String> input = Set.of(".armadillo", "utopia", "hurdle");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // Tests for HasEmptyString

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
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falsePunctuationionNotLetters() {
    // arrange
    Set<String> input = Set.of("armadillo", ".", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseSpaceInWord() {
    // arrange
    Set<String> input = Set.of("hello there", "");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_trueOneElement() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseOneElement() {
    // arrange
    Set<String> input = Set.of("bleh");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseSpaceInString() {
    // Note - I wasn't sure if this would be false or true since the string IS technically empty, but
    // Java can count a space as a character.

    // arrange
    Set<String> input = Set.of(" ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  // Tests for MaxLength

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
  void testMaxLength_oneWord() {
    // arrange
    Set<String> input = Set.of("by");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMaxLength_multipleWordsSameLength() {
    // arrange
    Set<String> input = Set.of("meh", "ding", "dong", "door");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(4, actual);
  }

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
  void testMaxLength_emptyString() {
    // arrange
    Set<String> input = Set.of("", " ");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_spaceInAWord() {
    // arrange
    Set<String> input = Set.of("by", "a", "derp", " door");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(4, actual);
  }

  // Tests for MinLength

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
  void testMinLength_oneWord() {
    // arrange
    Set<String> input = Set.of("by");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMinLength_multipleWordsSameLength() {
    // arrange
    Set<String> input = Set.of("meh", "reh", "grr", "door");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3, actual);
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
  void testMinLength_emptyString() {
    // arrange
    Set<String> input = Set.of("", " ");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMinLength_spaceInAWord() {
    // arrange
    Set<String> input = Set.of("by", " a", "derp", "door");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

}
