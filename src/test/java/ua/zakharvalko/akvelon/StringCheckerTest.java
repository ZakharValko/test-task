package ua.zakharvalko.akvelon;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class StringCheckerTest {

    StringChecker stringChecker = new StringChecker();
    String input = "([{}])";

    @Test
    @DisplayName("Should return true if string is not empty")
    public void checkForEmpty_nominal() {
        Assert.assertTrue(stringChecker.checkForEmpty(input));
    }

    @Test(expected = IllegalArgumentException.class)
    @DisplayName("Should throw IllegalArgumentException if string is empty")
    public void checkForEmpty_exception() {
        String input = "";
        stringChecker.checkForEmpty(input);
    }

    @Test
    @DisplayName("Should return true if string has only brackets")
    public void checkForCorrectness_nominal() {
        Assert.assertTrue(stringChecker.checkForCorrectness(input));
    }

    @Test(expected = IllegalArgumentException.class)
    @DisplayName("Should throw IllegalArgumentException if string has not brackets")
    public void checkForCorrectness_exception() {
        String input = "(s)";
        Assert.assertTrue(stringChecker.checkForCorrectness(input));
    }

    @Test
    @DisplayName("Should return true if string has open and close brackets")
    public void checkForOpenClosedBrackets_nominal() {
        Assert.assertTrue(stringChecker.checkForOpenClosedBrackets(input));
    }

    @Test(expected = IllegalArgumentException.class)
    @DisplayName("Should throw exception if string has only open brackets")
    public void checkForOpenClosedBrackets_exception() {
        String input = "(((";
        Assert.assertTrue(stringChecker.checkForOpenClosedBrackets(input));
    }

}
