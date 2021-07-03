package ua.zakharvalko.akvelon;

public class StringChecker {

    public boolean checkForEmpty(String str) {
        if (str.isEmpty()){
            System.out.println("Your brackets line is empty");
            throw new IllegalArgumentException();
        } else {
            return false;
        }
    }

    public boolean checkForCorrectness(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '(' && str.charAt(i) != ')' && str.charAt(i) != '{' && str.charAt(i) != '}' && str.charAt(i) != '[' && str.charAt(i) != ']'){
                System.out.println("Your brackets line is incorrect");
                throw new IllegalArgumentException();
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
        System.out.println("Your brackets line has only open brackets");
        throw new IllegalArgumentException();
    }
}
