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
  void testAllStartWithA_EmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_nonAwords() {
    // arrange
    Set<String> input = Set.of("hachiware", "usagi", "chiikawa");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_SingleElement() {
    // arrange
    Set<String> input = Set.of("chiikawa");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_upperCase() {
    // arrange
    Set<String> input = Set.of("Army", "A", "Astra");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);  
  }

//--------------------------------------------------------------------------------------------

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
  void testHasEmptyString_falseEmpty() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_WithSpaces() {
    // arrange
    Set<String> input = Set.of(" armadillo ", "Arcanine", " utopia ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual); 
  }

  @Test
  void testHasEmptyString_EmptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);  
  }

  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!

//---------------------------------------------------------------------------------------
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
  void testMaxLength_singleElement() {
    // arrange
    Set<String> input = Set.of("chiikawa");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(8, actual);
  }

  @Test
  void testMaxLength_mixedLengths() {
    // arrange
    Set<String> input = Set.of("chiikawa", "hachiware", "usagi", "rakko");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);  
  }

  @Test
  void testMaxLength_empty() {
    // arrange
    Set<String> input = Set.of("chiikawa", "hachiware", "usagi", "");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);  
  }

  @Test
  void testMaxLength_sameLengths() {
    // arrange
    Set<String> input = Set.of("asdfg", "qwert", "tyuio", "zxcvb");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);  
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
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_singleElement() {
    // arrange
    Set<String> input = Set.of("chiikawa");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(8, actual);
  }

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("chiikawa", "loves", "to", "dance");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMinLength_empty() {
    // arrange
    Set<String> input = Set.of("chiikawa", "hachiware", "usagi", "");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);  
  }

  @Test
  void testMinLength_sameLengths() {
    // arrange
    Set<String> input = Set.of("asdfg", "qwert", "tyuio", "zxcvb");
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
}
