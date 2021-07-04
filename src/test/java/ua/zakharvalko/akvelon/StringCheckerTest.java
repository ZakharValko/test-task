package ua.zakharvalko.akvelon;

import org.junit.Assert;
import org.junit.Test;

public class StringCheckerTest {

    StringChecker stringChecker = new StringChecker();

    @Test
    public void shouldReturnTrueIfStringNotEmpty() {
        String input = "([{}])";
        Assert.assertTrue(stringChecker.checkForEmpty(input));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlyBrackets() {
        String input = "([{}])";
        Assert.assertTrue(stringChecker.checkForCorrectness(input));
    }

    @Test
    public void shouldReturnTrueIfStringHasOpenAndClosedBrackets() {
        String input = "([{}])";
        Assert.assertTrue(stringChecker.checkForOpenClosedBrackets(input));
    }

}
