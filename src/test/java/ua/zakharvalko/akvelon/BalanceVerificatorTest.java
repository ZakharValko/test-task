package ua.zakharvalko.akvelon;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class BalanceVerificatorTest {

    StringChecker stringCheckerMock = Mockito.mock(StringChecker.class);
    BalanceVerificator balanceVerificator = new BalanceVerificator(stringCheckerMock);

    @Test
    public void checkForBalance_balanced() {
        String balancedString = "([{}])";
        Assert.assertEquals(-1, balanceVerificator.checkForBalance(balancedString));
    }

    @Test
    public void checkForBalance_notBalanced() {
        String notBalancedString = "([{}]))";
        Assert.assertEquals(7, balanceVerificator.checkForBalance(notBalancedString));
    }
}
