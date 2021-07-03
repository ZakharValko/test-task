package ua.zakharvalko.akvelon;

public class Application {
    public static void main(String[] args) {

        BalanceVerificator verificator = new BalanceVerificator();
        String toCheck = "(({[]}))";
        verificator.checkForBalance(toCheck);

    }
}
