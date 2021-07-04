package ua.zakharvalko.akvelon;

public class Application {
    public static void main(String[] args) {

        StringChecker stringChecker = new StringChecker();
        BalanceVerificator verificator = new BalanceVerificator(stringChecker);
        String toCheck = "([{}]))";
        verificator.checkForBalance(toCheck);

    }
}
