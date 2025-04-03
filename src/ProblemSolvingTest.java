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
  //  - test an empty set DONE
  //  - test a set where none start with A DONE
  //  - test a set with only a single element DONE
  //  - more you can think of!
  @Test
  void testAllStartTestWithA_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartTestWithA_allElementsFalse() {
    // arrange
    Set<String> input = Set.of("banana","Chancla","Filipino");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartTestWithA_singleElementFalse() {
    // arrange
    Set<String> input = Set.of("efren");
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
  // Come up with more tests to thoroughly test hasEmptyString DONE
  // Use your creativity here! DONE

  @Test
  void testHasEmptyString_trueOneElementTrueEmpty() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseOneEmpty() {
    // arrange
    Set<String> input = Set.of("soulja","boy","tell","em");
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
  // Come up with more tests to thoroughly test maxLength DONE
  // Use your creativity here! DONE
    
  @Test
  void testMaxLength_allSameLength() {
    // arrange
    Set<String> input = Set.of("ts", "at", "ab", "do");
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


  // TODO:
  // Come up with ALL tests to thoroughly test minLength DONE
  // Use your creativity here, and consider looking back at the maxLength DONE
  // tests for inspiration DONE

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("banana","bro","lmfao","huh","do");
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
  void testMinLength_oneWord() {
    // arrange
    Set<String> input = Set.of("javadoesnotequaljavascript");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(26, actual);
  }

  @Test
  void testMinLength_multipleWordsSameMinlength() {
    // arrange
    Set<String> input = Set.of("oop","lol","idk","pmo","oof","wyd");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3, actual);
  }

}
