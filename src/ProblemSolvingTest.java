import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
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
  void testAllStartWithA_trueEmpty() {
    // arrange
    Set<String> input =Collections.emptySet();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseNoneStartWithA() {
    // arrange
    Set<String> input = Set.of("car", "utopia", "jug");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_trueSingle() {
    // arrange
    Set<String> input = Set.of("armadillo");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseSingle() {
    // arrange
    Set<String> input = Set.of("buffalo");
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
  @Test
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = Collections.emptySet(); 
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueAllEmpty() {
    // arrange
    Set<String> input = new HashSet<>(Arrays.asList("", "", "")); 
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
  @Test
  void testMaxLength_sameLength() {
    // arrange
    Set<String> input = Set.of("b", "a", "c", "v");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(1, actual);
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
  void testMaxLength_empty() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("bye", "as", "commodius", "vicus");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMinLength_sameLength() {
    // arrange
    Set<String> input = Set.of("b", "a", "c", "v");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_singleWord() {
    // arrange
    Set<String> input = Set.of("by");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMinLength_empty() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

}
