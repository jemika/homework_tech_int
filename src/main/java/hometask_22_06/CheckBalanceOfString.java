package hometask_22_06;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

public class CheckBalanceOfString {

    private static StackBasedOnLinkedList<Character> stack = new StackBasedOnLinkedList<>();
    private static final List<Character> LIST_OF_CLOSED_BRACKETS = Arrays.asList(')', ']', '}');
    private static final List<Character> LIST_OF_OPEN_BRACKETS = Arrays.asList('(', '[', '{');

    public static boolean checkString(String str) {
        for (char ch : str.toCharArray()) {
            if (LIST_OF_OPEN_BRACKETS.contains(ch)) {
                stack.push(ch);
            } else if (LIST_OF_CLOSED_BRACKETS.contains(ch)) {
                if (stack.size() != 0) {
                    if (!stack.pop().equals(reverseBracket(ch))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    private static char reverseBracket(char ch) {
        if (ch == ')') {
            return '(';
        } else if (ch == '}') {
            return '{';
        } else if (ch == ']') {
            return '[';
        }
        throw new InvalidParameterException();
    }
}
