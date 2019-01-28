package org.launchcode;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression");

        String str = scanner.next();

        System.out.println(postfixEvaluation(str));
    }

    public static int postfixEvaluation(String str){
        char[] strArray = str.toCharArray();
        Stack<Integer> stack = new Stack();

        for(char c:strArray) {
            if(Character.isDigit(c))
                stack.push(c - '0');
            else{
                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (c) {
                    case '+' :
                        stack.push(op2 + op1);
                        break;

                    case '-' :
                        stack.push(op2 - op1);
                        break;

                    case '*' :
                        stack.push(op2 * op1);
                        break;

                    case '/' :
                        stack.push(op2 / op1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
