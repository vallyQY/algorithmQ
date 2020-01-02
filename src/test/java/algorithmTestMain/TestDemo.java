package algorithmTestMain;

import algorithmTestDemo.ValidParentheses;


public class TestDemo {
    public static void main(String[] args){
        ValidParentheses solution = new ValidParentheses();
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        printArr(intArray);
        System.out.println(solution.isValidParenthese0("()"));
    }

    public static <E> void printArr(E[] arr){
        for(E element : arr){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
}
