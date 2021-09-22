package test;
import main.BalancedBrackets;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
  //  @Test
    //public void emptyTest() {
      //  assertEquals(true, true);
    //}

    //@Test
    //public void onlyBracketsReturnsTrue() {
      //  assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    //}
      //  @Test
        //public void SpaceInBracketReturnTrue() {
          //  assertTrue(BalancedBrackets.hasBalancedBrackets("[ ]"));
        //}
        //@Test
        //public void onlyOpenBracket () {
          //  assertFalse(BalancedBrackets.hasBalancedBrackets("[[ ]"));
       // }
        //@Test
    //public void emptyString(){
      //  assertTrue(BalancedBrackets.hasBalancedBrackets(""));
       // }
        //@Test
    //public void multipleBrackets(){
      //  assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[]]]]]"));
       // }
        //@Test
    //public void backToBack(){
      //  assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
        //}
        //@Test
    //public void justOne(){
      //      assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
       // }
        //@Test
    //public void twoClosingBrackets(){
      //      assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
       // }
   @Test
   public void twoOpeningBrackets(){
     assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
   }
   @Test
   public void bracketsWithParanthesis(){
     assertTrue(BalancedBrackets.hasBalancedBrackets("( [ ) ]"));
   }
@Test
public void backSlash(){
  assertTrue(BalancedBrackets.hasBalancedBrackets("[\n]"));
}

    @Test
    public void initTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringAndBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void twoSetsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    @Test
    public void nestedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    // expected false results
        @Test
        public void reverseOnlyBracketsReturnsFalse () {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        }

        @Test
        public void onlyLeftBracketsReturnsFalse () {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        }

        @Test
        public void wrongOrderBracketsReturnsFalse () {
            assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        }

        @Test
        public void leftBracketReturnsFalse () {
            assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        }

        @Test
        public void mismatchReturnsFalse () {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[launch[]"));
        }

        @Test
        public void otherMismatchReturnsFalse () {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]launch[]"));
        }

    }


