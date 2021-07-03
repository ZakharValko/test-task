package ua.zakharvalko.akvelon;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceVerificator {

        StringChecker stringChecker = new StringChecker();

        public int checkForBalance(String str) {

            // Creating bracketsQueue, like a storage for brackets.
            Deque<Character> bracketsQueue = new ArrayDeque();

            // Checking our string for all types of mistakes.
            stringChecker.checkForEmpty(str);
            stringChecker.checkForCorrectness(str);
            stringChecker.checkForOpenClosedBrackets(str);

            for (int i = 0; i < str.length(); i++) {

                // Take current bracket
                char current = str.charAt(i);

                // Checking for brackets type. If the last bracket in storage is open type, we put current bracket in the storage.
                if (current == '(' || current == '{' || current == '[') {
                    if (bracketsQueue.isEmpty() || (bracketsQueue.getLast() == '(' || bracketsQueue.getLast() == '{' || bracketsQueue.getLast() == '[')) {
                        bracketsQueue.addLast(current);
                    }

                    // Checking for brackets type. If our bracket is close type storage cant be empty.
                } else {
                    if (bracketsQueue.isEmpty()) {
                        System.out.println("NOT BALANCED " + (i+1));
                        return (i + 1);

                        // If last bracket in the storage identity to our current bracket, last bracket have to be removed.
                    } else if (bracketsQueue.getLast() == '(' && current == ')') {
                        bracketsQueue.removeLast();
                    } else if (bracketsQueue.getLast() == '{' && current == '}') {
                        bracketsQueue.removeLast();
                    } else if (bracketsQueue.getLast() == '[' && current == ']') {
                        bracketsQueue.removeLast();
                    }
                }
            }

            // Checking for capacity. If our brackets storage is empty, we have a BALANCED brackets line.
            if(bracketsQueue.isEmpty()){
                System.out.println("BALANCED");
                return -1;
            } else {
                System.out.println("NOT BALANCED, we have " + bracketsQueue.size() + " extra brackets.");
                return (bracketsQueue.size());
            }

        }
}
