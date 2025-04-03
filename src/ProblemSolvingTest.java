import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {

  //examples
  // @Test
  // void testAllStartWithA_trueMixedCase() {
  //   // arrange
  //   Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
  //   // act
  //   boolean actual = ProblemSolving.allStartWithA(input);
  //   //assert
  //   assertTrue(actual);
  // }

  // @Test
  // void testAllStartWithA_falseOneElement() {
  //   // arrange
  //   Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
  //   // act
  //   boolean actual = ProblemSolving.allStartWithA(input);
  //   // assert
  //   assertFalse(actual);
  // }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  //  - test a set where none start with A
  //  - test a set with only a single element
  //  - more you can think of!


//allStartWithA
  @Test
  void testAllStartWithA_falseNoneStartWithA() {
      // Arrange
      Set<String> input = Set.of("banana", "cherry", "dog");
      // Act
      boolean actual = ProblemSolving.allStartWithA(input);
      // Assert
      assertFalse(actual); //expected res = false
  }
  
  @Test
  void testAllStartWithA_trueSingleElement() {
      // Arrange
      Set<String> input = Set.of("Apple");
      // Act
      boolean actual = ProblemSolving.allStartWithA(input);
      // Assert
      assertTrue(actual); //expected res = true
  }
  

//-----------------------------

  //examples
  // @Test
  // void testHasEmptyString_falseAllNonEmpty() {
  //   // arrange
  //   Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
  //   // act
  //   boolean actual = ProblemSolving.hasEmptyString(input);
  //   // assert
  //   assertFalse(actual);
  // }

  // @Test
  // void testHasEmptyString_trueOneEmpty() {
  //   // arrange
  //   Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
  //   // act
  //   boolean actual = ProblemSolving.hasEmptyString(input);
  //   // assert
  //   assertTrue(actual);
  // }

  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!


//hasEmptyString
  @Test
void testHasEmptyString_trueMultipleEmptyStrings() {
    // Arrange
    Set<String> input = new HashSet<>(List.of("", "apple", "", "banana")); // allows multiple of the same strings aka multiple empty strings
    // Act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // Assert
    assertTrue(actual); //expected res = True
}

@Test
void testHasEmptyString_trueAllEmptyStrings() {
    // Arrange
    Set<String> input = new HashSet<>(List.of("", "", "")); // allows multiple of the same strings aka empty strings
    // Act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // Assert
    assertTrue(actual); //expected res = true
}


//-----------------------------

  //examples
  // @Test
  // void testMaxLength_multipleWords() {
  //   // arrange
  //   Set<String> input = Set.of("by", "a", "commodius", "vicus");
  //   // act
  //   int actual = ProblemSolving.maxLength(input);
  //   // assert
  //   assertEquals(9, actual);
  // }

  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!
  

//maxLength
@Test
void testMaxLength_oneWord() {
    // Arrange
    Set<String> input = Set.of("supercalifragilisticexpialidocious");
    // Act
    int actual = ProblemSolving.maxLength(input);
    // Assert
    assertEquals(34, actual); //expected res = 34 characters
}

@Test
void testMaxLength_longestWordsTied() {
    // Arrange
    Set<String> input = Set.of("magnificent", "tremendous", "knickknacks");
    // Act
    int actual = ProblemSolving.maxLength(input);
    // Assert
    assertEquals(11, actual); // expected res = 11 characters

}


//-----------------------------
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration


//minLength
@Test
void testMinLength_singleCharacters() {
    // Arrange
    Set<String> input = Set.of("a", "b", "c");
    // Act
    int actual = ProblemSolving.minLength(input);
    // Assert
    assertEquals(1, actual); // expected res = 1
}

@Test
void testMinLength_mixedLengths() {
    // Arrange
    Set<String> input = Set.of("dinosaur", "hello", "a", "Sarcosuchus");
    // Act
    int actual = ProblemSolving.minLength(input);
    // Assert
    assertEquals(1, actual); // expected res = 1
}


}//end ProblemSolvingTest.java
