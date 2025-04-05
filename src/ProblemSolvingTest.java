import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

  @Test
void testAllStartWithA_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual); // vacuously true
}

@Test
void testAllStartWithA_noneStartWithA() {
    // arrange
    Set<String> input = Set.of("banana", "cherry", "durian");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
}

@Test
void testAllStartWithA_oneElementStartsWithA() {
    // arrange
    Set<String> input = Set.of("avocado");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
}

@Test
void testAllStartWithA_oneElementNotStartingWithA() {
    // arrange
    Set<String> input = Set.of("broccoli");
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
  void testHasEmptyString_trueWhenEmptyPresent() {
      Set<String> input = Set.of("apple", "", "banana");
      boolean result = ProblemSolving.hasEmptyString(input);
      assertTrue(result);
  }

  @Test
  void testHasEmptyString_falseWhenNoEmptyPresent() {
      Set<String> input = Set.of("apple", "banana", "cherry");
      boolean result = ProblemSolving.hasEmptyString(input);
      assertFalse(result);
  }
  void testHasEmptyString_nullSet() {
    Set<String> input = null;
    boolean result = ProblemSolving.hasEmptyString(input);
    assertFalse(result);
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
    void testMaxLength_typicalSet() {
        Set<String> input = Set.of("apple", "banana", "cherry");
        int result = ProblemSolving.maxLength(input);
        assertEquals(6, result); // "banana"
    }

    @Test
    void testMaxLength_setWithEmptyString() {
        Set<String> input = Set.of("a", "", "bb");
        int result = ProblemSolving.maxLength(input);
        assertEquals(2, result); // "bb"
    }

  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!
    
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

}
