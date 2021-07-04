package ua.zakharvalko.akvelon;

public class StringChecker {

    public boolean checkForEmpty(String str) {
        if (str.isEmpty()){
            throw new IllegalArgumentException("Your brackets line is empty");
        } else {
            return true;
        }
    }

    public boolean checkForCorrectness(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '(' && str.charAt(i) != ')' && str.charAt(i) != '{' && str.charAt(i) != '}' && str.charAt(i) != '[' && str.charAt(i) != ']'){
                throw new IllegalArgumentException("Your brackets line is incorrect");
            }
        }
        return true;
    }

    public boolean checkForOpenClosedBrackets(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                continue;
            } else {
                return true;
            }
        }
        throw new IllegalArgumentException("Your brackets line has only open brackets");
    }
}
