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
  void testAllStartWithA_EmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_AllFalseElements() {
    // arrange
    Set<String> input = Set.of("Bobcat", "Tiger", "Panther");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_SingleElement() {
    // arrange
    Set<String> input = Set.of("armadillo");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_trueSingleCharacterElements() {
    // arrange
    Set<String> input = Set.of("a", "A");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseSingleCharacterElements() {
    // arrange
    Set<String> input = Set.of("b", "X", "s");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }


  // testHasEmptyString

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
  void testHasEmptyString_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_whiteSpace() {
    // arrange
    Set<String> input = Set.of("  ", "one ", " punch ", " man");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert - since the string itself isn't empty, return emptyString = false
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_spacedElements() {
    // arrange
    Set<String> input = Set.of("  armadillo", " utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_specialCharacterElements() {
    // arrange
    Set<String> input = Set.of("#armadillo", "$", "!utopia", "%yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }


  // testMaxLength

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
  void testMaxLength_singleWord() {
    // arrange
    Set<String> input = Set.of("by");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(2, actual);
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
  void testMaxLength_sameLength() {
    // arrange
    Set<String> input = Set.of("Llama", "Lemon", "Cloud");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);
  }

  @Test
  void testMaxLength_emptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_whiteSpaceStrings() {
    // arrange
    Set<String> input = Set.of("", " ", "  ");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMaxLength_specialCharacters() {
    // arrange
    Set<String> input = Set.of("$", "%#&", "*@!123");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(6, actual);
  }
    
  
  // test minLength

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("armor", "greatsword", "helmet", "crossbow");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
  }

  @Test
  void testMinLength_singleWord() {
    // arrange
    Set<String> input = Set.of("armor");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
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
  void testMinLength_sameLength() {
    // arrange
    Set<String> input = Set.of("Llama", "Lemon", "Cloud");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
  }

  @Test
  void testMinLength_emptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMinLength_whiteSpaceStrings() {
    // arrange
    Set<String> input = Set.of("", " ", "  ");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMinLength_specialCharacters() {
    // arrange
    Set<String> input = Set.of("$", "%#&", "*@!123");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }
}