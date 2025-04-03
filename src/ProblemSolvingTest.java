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

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:

  // test an empty set
  @Test
  void testAllStartWithA_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  // test a set where none start with A
  @Test
  void testAllStartWithA_noA() {
    // arrange
    Set<String> input = Set.of("blue", "Miku", "underground");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // test a set with only a single element with A
  @Test
  void testAllStartWithA_oneWordA() {
    // arrange
    Set<String> input = Set.of("above");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  // test a set with only a single element with no A
  @Test
  void testAllStartWithA_oneWordNoA() {
    // arrange
    Set<String> input = Set.of("miku");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // test a set with only a single element with A in a set
  @Test
  void testAllStartWithA_oneWordWithA() {
    // arrange
    Set<String> input = Set.of("masked", "Miku", "alien");
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
  void testHasEmptyString_noEmptyString() {
    // arrange
    Set<String> input = Set.of("I'm", "thinking", "miku", "beam");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_spaceElement() {
    // arrange
    Set<String> input = Set.of("saki", " ", "airi", "mizuki");
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
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_emptyElement() {
    // arrange
    Set<String> input = Set.of("monday", "tuesday", "", "thursday");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(8, actual);
  }

  @Test
  void testMaxLength_oneElement() {
    // arrange
    Set<String> input = Set.of("Hatsune");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(7, actual);
  }

  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("Miku", "Shiroko", "Nene", "emu");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3, actual);
  }

  @Test
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_oneElement() {
    // arrange
    Set<String> input = Set.of("Hatsune");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(7, actual);
  }

  @Test
  void testMinLength_oneEmpty() {
    // arrange
    Set<String> input = Set.of("saki", "", "airi", "mizuki");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }
}
