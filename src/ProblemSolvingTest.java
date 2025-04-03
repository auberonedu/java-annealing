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
  void testAllStartWithA_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_nothingStartsWithA() {
    // arrange
    Set<String> input = Set.of("Best Buy", "utopia", "Terror");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_OneElementWithA() {
    // arrange
    Set<String> input = Set.of("Astra");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_OneElementNoA() {
    // arrange
    Set<String> input = Set.of("Behemoth");
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


  @Test
  void testHasEmptyString_allSpaces() {
    // arrange
    Set<String> input = Set.of("    ", "     ", "       ", "          ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_oneEmptyAndSpaces() {
    // arrange
    Set<String> input = Set.of("    ", "", "       ", "          ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_oneEmpty() {
    // arrange
    Set<String> input = Set.of("");
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
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }


  @Test
  void testMaxLength_multipleWordsAndOneBigSpace() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus", "              ");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(14, actual);
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
  void testMaxLength_noSet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = Set.of("", "Jordan");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(6, actual);
  }
    
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
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMinLength_oneEmptySetMultipleWords() {
    // arrange
    Set<String> input = Set.of("", "hello", "fire", "oops");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

}
