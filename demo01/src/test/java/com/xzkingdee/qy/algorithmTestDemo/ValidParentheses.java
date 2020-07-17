package com.xzkingdee.qy.algorithmTestDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *          1.Open brackets must be closed by the same type of brackets.
 *          2.Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * */
public class ValidParentheses {
    private HashMap<Character, Character> mappings;

    public boolean isValidParenthese0(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.empty() || c != stack.pop()) return false;
        }
        if (stack.empty()) return true;
        return false;
    }

    private void initMap() {
        mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
    }

    public boolean isValidParenthese1(String s) {
        initMap();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidParenthese2(String s) {
        if (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            return isValidParenthese2(
                    s.replace("()", "")
                            .replace("[]", "")
                            .replace("{}", ""));
        } else {
            return "".equals(s);
        }
    }

    public boolean isValidParenthese3(String s) {
        if (s.length() == 0)
            return true;
        if ((s.length() & 1) == 1)
            return false;

        int index = 0;
        char[] stack = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack[index++] = s.charAt(i);
                    continue;
                case ')':
                    if (index == 0 || stack[--index] != '(')
                        return false;
                    continue;
                case ']':
                    if (index == 0 || stack[--index] != '[')
                        return false;
                    continue;
                case '}':
                    if (index == 0 || stack[--index] != '{')
                        return false;
            }
        }
        return index == 0;
    }

    public boolean isValidParenthese4(String s) {
        if (s.length() == 0)
            return true;
        if ((s.length() & 1) == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    continue;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    continue;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    continue;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    continue;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValidParenthese5(String s) {
        if ((s.length() & 1) == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                switch (s.charAt(i)) {
                    case ')': {
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    }
                    case ']': {
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                    }
                    case '}': {
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    }
                    default:
                        stack.push(s.charAt(i));
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

    public static boolean isValidParenthese6(String s) {
        if (s.length() == 0) return true;
        List<Character> charStack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 40 || s.charAt(i) == 91 || s.charAt(i) == 123) {
                charStack.add(s.charAt(i));
            }
            if (s.charAt(i) == 41 || s.charAt(i) == 93 || s.charAt(i) == 125) {
                if (charStack.size() == 0) return false;
                char a = charStack.get(charStack.size() - 1);
                if (s.charAt(i) - a != 1 && s.charAt(i) - a != 2) {
                    return false;
                }
                charStack.remove(charStack.size() - 1);
            }
        }
        if (charStack.size() != 0) return false;
        return true;
    }

    public boolean isValidParenthese7(String s) {
        if (s.length() % 2 != 0)
            return false;
        char[] inputStrChars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char foo : inputStrChars) {
            if (foo == '(' || foo == '[' || foo == '{') {
                stack.add(foo);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(foo - top<=2&&foo - top>0){
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidParenthese8(String s) {
        char[] chars = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '}' && s.charAt(i) != ']' && s.charAt(i) != ')') {
                chars[index++] = s.charAt(i);
            } else if (index == 0) {
                return false;
            } else if (s.charAt(i) == '}' && chars[index - 1] == '{') {
                index--;
            } else if (s.charAt(i) == ']' && chars[index - 1] == '[') {
                index--;
            } else if (s.charAt(i) == ')' && chars[index - 1] == '(') {
                index--;
            } else {
                return false;
            }
        }
        return index == 0;
    }
}
