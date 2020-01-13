package algorithmTestMain;

import algorithmTestDemo.Palindrome;
import algorithmTestDemo.StringLengthCompare;
import algorithmTestDemo.ValidParentheses;

import java.util.Arrays;


public class TestDemo {
    public static void main(String[] args){
        //testStringLengthCompare();
        //testPalindrome();
        testValidParentheses();
        String s = "a加b等于c，如果a等1、b等于2，那么c等3";
        System.out.println(s.substring(0,6));
    }

    private static void testStringLengthCompare(){
        /*String[] strArr = {"aadsaf","dqwd","dqwfcsqc","xqsccaac","csfwffqaf","czxca","cas","cacs","casc"};
        Comparator comparator = new StringLengthCompare();
        Arrays.sort(strArr,comparator);
        System.out.println(Arrays.toString(strArr));*/

        String[] str = {"aadsaf","dqwd","dqwfcsqc","xqsccaac","csfwffqaf","czxca","cas","cacs","casc"};
        String[] str1 = str;
        StringLengthCompare com1 = new StringLengthCompare();
        str = (String[]) com1.sort(str);
        System.out.println(Arrays.toString(str));
        Arrays.sort(str1, com1);
        System.out.println(Arrays.toString(str1));
    }

    private static void testPalindrome(){
        System.out.println(new Palindrome().isPalindrome1(1221));
    }

    private static void testValidParentheses(){
        System.out.println(new ValidParentheses().isValidParenthese0("([])"));
    }

}
