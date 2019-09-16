package Task6.SubTask4;

import java.util.Stack;

public class Check<Character> {

    public boolean checkParenthesis(String randomString){
        Stack<java.lang.Character> parenthesis = new Stack();
    for (int i = 0; i<randomString.length(); i++){
        char currentChar = randomString.charAt(i);
        if (currentChar == '(' || currentChar == '{' || currentChar == '['){
            parenthesis.push(randomString.charAt(i));
        }
        if (currentChar == ')' || currentChar == '}' || currentChar== ']')
        {
            if (parenthesis.isEmpty())
                return false;
            char last = parenthesis.peek();
            if (currentChar == '}' && last == '{' || currentChar == ')' && last == '(' || currentChar == ']' && last == '[')
                parenthesis.pop();
            else
                return false;
        }

    }
        return parenthesis.isEmpty();
    }

}
