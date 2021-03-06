package org.launchcode;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of infix expression");
        String str = scanner.next();

        String result = infixToPostfix(str);
        System.out.println(result);
    }

    public static String infixToPostfix(String str) {
        String result = new String("");
        Stack<Character> stack = new Stack<Character>();
        char[] strArray = str.toCharArray();

        for(char c:strArray) {
            if(Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            }
            else{
                while(!stack.isEmpty() && prec(c) <= prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
        }
        while(!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    public static int prec(char c) {
        switch(c){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }
}
