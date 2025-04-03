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
  void testAllStartsWithA_falseEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_notAllStartWithA() {
    // arrange
    Set<String> input = Set.of("lion", "deer", "elephant");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_singleElement() {
    // arrange
    Set<String> input = Set.of("apple");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartsWithA_oneLetter() {
    // arrange
    Set<String> input = Set.of("D");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
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

  @Test
  void testHasEmptyString_FalseNoEmpty() {
    // arrange
    Set<String> input = Set.of("avocado", "Atlantis", "umbrella");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
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
  void testHasEmptyString_falseOnly() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseNoneOneEmpty(){
    // arrange
    Set<String> input = Set.of("hurray");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseOnlySpace() {
    // arrange
    Set<String> input = Set.of(" ");
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
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_oneWord() {
    // arrange
    Set<String> input = Set.of("a");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMaxLength_LengthWords() {
    // arrange
    Set<String> input = Set.of("goes", "toes", "moow");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(4, actual);
  }
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "randomas", "vicus");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
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
  void testMinLength_oneWord() {
    // arrange
    Set<String> input = Set.of("prince");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(6, actual);
  }

  @Test
  void testMinLength_LengthWords() {
    // arrange
    Set<String> input = Set.of("dog", "cat", "camel");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3 , actual);
  }

}
