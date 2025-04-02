import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  // @Test
  // void testAllStartWithA_trueMixedCase() {
  //   // arrange
  //   Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
  //   // act
  //   boolean actual = ProblemSolving.allStartWithA(input);
  //   //assert
  //   assertTrue(actual);
  // }

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
  void testAllStarWithA_emptySet() {
    //arrange
    Set<String> input = Set.of();   

    //act
    boolean actual = ProblemSolving.allStartWithA(input);

    //assert
    assertFalse(actual);
  }

  @Test
  void testAllStarWithA_noneStartWithA() {
    //arrange
    Set<String> input = Set.of("one", "utopia", "help");   

    //act
    boolean actual = ProblemSolving.allStartWithA(input);

    //assert
    assertFalse(actual);
  }

  // @Test
  // void testAllStarWithA_oneElement() {
  //   //arrange
  //   Set<String> input = Set.of("aoli");   

  //   //act
  //   boolean actual = ProblemSolving.allStartWithA(input);

  //   //assert
  //   assertTrue(actual);
  // }



  @Test
  void testHasEmptyString_falseAllNoneEmpty() {
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
  void testHasEmptyString_spaces() {
    // arrange
    Set<String> input = Set.of("armadillo", " ", "utopia", "    ", "");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyStrings_noEmptyStrings() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", " ");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }


//   @Test
//   void testMaxLength_multipleWords() {
//     // arrange
//     Set<String> input = Set.of("by", "a", "commodius", "vicus");
//     // act
//     int actual = ProblemSolving.maxLength(input);
//     // assert
//     assertEquals(9, actual);
//   }


//   // TODO:
//   // Come up with more tests to thoroughly test maxLength
//   // Use your creativity here!
//   @Test 
//   void tesMaxLength_sameLength() {
//     // arrange
//     Set<String> input = Set.of("hello", "beets", "timer", "vicus");
//     // act
//     int actual = ProblemSolving.maxLength(input);
//     // assert
//     assertEquals(5, actual);
//   }

//   @Test 
//   void tesMaxLength_oneWord() {
//     // arrange
//     Set<String> input = Set.of("grip");
//     // act
//     int actual = ProblemSolving.maxLength(input);
//     // assert
//     assertEquals(4, actual);
//   }

//   @Test 
//   void tesMaxLength_spaces() {
//     // arrange
//     Set<String> input = Set.of("   ", " ", "", "      ");
//     // act
//     int actual = ProblemSolving.maxLength(input);
//     // assert
//     assertEquals(6, actual);
//   }

  
  
//   // TODO:
//   // Come up with ALL tests to thoroughly test minLength
//   // Use your creativity here, and consider looking back at the maxLength
//   // tests for inspiration  
//   @Test
//   void testMinLength_multipleWords() {
//     // arrange
//     Set<String> input = Set.of("by", "a", "commodius", "vicus");
//     // act
//     int actual = ProblemSolving.minLength(input);
//     // assert
//     assertEquals(1, actual);
//   }

//   @Test 
//   void tesMinLength_sameLength() {
//     // arrange
//     Set<String> input = Set.of("hello", "beets", "timer", "vicus");
//     // act
//     int actual = ProblemSolving.minLength(input);
//     // assert
//     assertEquals(5, actual);
//   }

//   @Test 
//   void tesMinLength_oneWord() {
//     // arrange
//     Set<String> input = Set.of("grip");
//     // act
//     int actual = ProblemSolving.minLength(input);
//     // assert
//     assertEquals(4, actual);
//   }

//   @Test 
//   void tesMinLength_spaces() {
//     // arrange
//     Set<String> input = Set.of("   ", " ", "", "      ");
//     // act
//     int actual = ProblemSolving.maxLength(input);
//     // assert
//     assertEquals(0, actual);
//   }
}
