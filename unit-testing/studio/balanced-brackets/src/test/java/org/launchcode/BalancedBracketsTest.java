package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

//    True Cases
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

//    The function BalancedBrackets should return true if and only if
//            * the input string has a set of "balanced" brackets.
//     *
//             * That is, whether it consists entirely of pairs of opening/closing
//     * brackets (in that order), none of which mis-nest. We consider a bracket
//     * to be square-brackets: [ or ].
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketInTheMiddleReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsAtTheStartReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringOfCharactersWithoutBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

//  False Cases
    @Test
    public void singleOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void reversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void singleBracketWithOtherCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void unbalancedBracketsAmongOtherCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void mixOfUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]["));
    }


//            *
//            * The string may contain non-bracket characters as well.
//            *
//            * These strings have balanced brackets:
//            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//            *
//            * While these do not:
//            *   "[LaunchCode", "Launch]Code[", "[", "]["
//            *
//            * @param str - to be validated
//     * @return true if balanced, false otherwise
}