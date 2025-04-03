import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  // ******************** TESTS for allStartsWithA ********************

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
  @Test
  void testAllStartWithA_emptySet()
  {
    // Arrange
    Set<String> input = Set.of();
    // Act
    boolean actual = ProblemSolving.allStartWithA(input);
    // Assert
    assertTrue(actual);

  }

  //  - test a set where none start with A
  @Test
  void testAllStartWithA_noneStartWithA()
  {
    // Arrange
    Set<String> input = Set.of("toast", "Lemon", "tea");
    // Act
    boolean actual = ProblemSolving.allStartWithA(input);
    // Assert
    assertFalse(actual);

  }

  //  - test a set with only a single element
  @Test
  void testAllStartWithA_onlyOneTrue()
  {
    // Arrange
    Set<String> input = Set.of("act");
    // Act
    boolean actual = ProblemSolving.allStartWithA(input);
    // Assert
    assertTrue(actual);

  }

  @Test
  void testAllStartWithA_onlyOneFalse()
  {
    // Arrange
    Set<String> input = Set.of("Track");
    // Act
    boolean actual = ProblemSolving.allStartWithA(input);
    // Assert
    assertFalse(actual);

  }

  //  - more you can think of!
  @Test
  void testAllStartWithA_emptyString()
  {
    // Arrange
    Set<String> input = Set.of("");
    // Act
    boolean actual = ProblemSolving.allStartWithA(input);
    // Assert
    assertFalse(actual);

  }


  // ******************** TESTS for hasEmptyString ********************

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
  void testHasEmptyString_spaces()
  {
    // Arrange
    Set<String> input = Set.of("    ");
    // Act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // Assert
    assertTrue(actual);

  }

  @Test
  void testHasEmptyString_emptySet()
  {
    // Arrange
    Set<String> input = Set.of();
    // Act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // Assert
    assertFalse(actual);

  }


  // ******************** TESTS for maxLength ********************

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
  void testMaxLength_emptySet()
  {
    // Arrange
    Set<String> input = Set.of();
    // Act
    int actual = ProblemSolving.maxLength(input);
    // Assert
    assertEquals(0, actual);

  }

  @Test
  void testMaxLength_emptyString()
  {
    // Arrange
    Set<String> input = Set.of("");
    // Act
    int actual = ProblemSolving.maxLength(input);
    // Assert
    assertEquals(0, actual);

  }

  @Test
  void testMaxLength_spaces()
  {
    // Arrange
    Set<String> input = Set.of("     ");
    // Act
    int actual = ProblemSolving.maxLength(input);
    // Assert
    assertEquals(0, actual);

  }
  
  
  // ******************** TESTS for minLength ********************

  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration
  @Test
  void testMinLength_multipleWords()
  {
    // Arrange
    Set<String> input = Set.of("Bulbasaur", "Ivysaur", "Venusaur");
    // Act
    int actual = ProblemSolving.minLength(input);
    // Assert
    assertEquals(7, actual);

  }

  @Test
  void testMinLength_emptySet()
  {
    // Arrange
    Set<String> input = Set.of();
    // Act
    int actual = ProblemSolving.minLength(input);
    // Assert
    assertEquals(Integer.MAX_VALUE, actual);

  }

  @Test
  void testMinLength_emptyString()
  {
    // Arrange
    Set<String> input = Set.of("");
    // Act
    int actual = ProblemSolving.minLength(input);
    // Assert
    assertEquals(0, actual);

  }

  @Test
  void testMinLength_spaces()
  {
    // Arrange
    Set<String> input = Set.of("        ");
    // Act
    int actual = ProblemSolving.minLength(input);
    // Assert
    assertEquals(0, actual);

  }


}
