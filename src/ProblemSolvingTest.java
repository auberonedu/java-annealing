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

  //  - test an empty set (expecting true)
  @Test
  void testAllStartWithA_trueEmptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }
  //  - test a set where none start with A
  @Test
  void testAllStartWithA_falseAllElements() {
    // arrange
    Set<String> input = Set.of("zebra", "horse", "Dog");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }
  //  - test a set with only a single element
  @Test
  void testAllStartWithA_falseSingleElement() {
    // arrange
    Set<String> input = Set.of("Single");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }
  //  - test set with one string that starts with a
  @Test
  void testAllStartWithA_falseAllButOneElement() {
    // arrange
    Set<String> input = Set.of("Cherry", "vanilla", "Almond");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }
  //  - test set with single character strings
  @Test
  void testAllStartWithA_trueSingleChar() {
    // arrange
    Set<String> input = Set.of("a", "A");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }
  //  - test set with empty string
  @Test
  void testAllStartWithA_falseOneEmptyString() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }
  //  - test set with all Uppercase/lowercase
  @Test
  void testAllStartWithA_trueUppercase() {
    // arrange
    Set<String> input = Set.of("ALL", "ANTELOPE", "ARDVARK");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  // !! hasEmptyString tests 

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

  // true all empty
  @Test
  void testHasEmptyString_trueAllEmpty() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }
  // false set is empty
  @Test
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }
  // true half empty
  @Test
  void testHasEmptyString_trueHalfEmpty() {
    // arrange
    Set<String> input = Set.of("","hey");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }
  // true last empty
  @Test
  void testHasEmptyString_trueLastEmpty() {
    // arrange
    Set<String> input = Set.of("yeah", "okay", "hey", "");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }
  // false set of spaces
  @Test
  void testHasEmptyString_falseAllSpaces() {
    // arrange
    Set<String> input = Set.of(" ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }


  // !! maxLength tests !
  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  // empty set (expect 0)
  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }
  // equal length words
  @Test
  void testMaxLength_allSameLength() {
    // arrange
    Set<String> input = Set.of("enter", "lucky", "dance", "kitty");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);
  }
  // one word
  @Test
  void testMaxLength_oneWords() {
    // arrange
    Set<String> input = Set.of("howdy");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);
  }
  // word longer by one
  @Test
  void testMaxLength_longerByOne() {
    // arrange
    Set<String> input = Set.of("is", "words", "sound", "chance");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(6, actual);
  }
  // all single chars
  @Test
  void testMaxLength_singleCharWords() {
    // arrange
    Set<String> input = Set.of("I", "a", "o");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(1, actual);
  }
  // all empty strings
  @Test
  void testMaxLength_emptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }
  
  // !! minLength tests
  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  // empty set (expect Integer.MAX_VALUE)
  @Test
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = new HashSet<>();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }
  // equal length words
  @Test
  void testMinLength_allSameLength() {
    // arrange
    Set<String> input = Set.of("enter", "lucky", "dance", "kitty");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
  }
  // one word
  @Test
  void testMinLength_oneWords() {
    // arrange
    Set<String> input = Set.of("howdy");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
  }
  // word longer by one
  @Test
  void testMinLength_shorterByOne() {
    // arrange
    Set<String> input = Set.of( "sound", "chance", "yellow", "tiller");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(5, actual);
  }
  // all single chars
  @Test
  void testMinLength_singleCharWords() {
    // arrange
    Set<String> input = Set.of("I", "a", "o");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }
  // all empty strings
  @Test
  void testMinLength_emptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }

}
