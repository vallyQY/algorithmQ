package algorithmTestMain;

import algorithmTestDemo.MaxSubArray;
import algorithmTestDemo.Palindrome;
import algorithmTestDemo.StringLengthCompare;
import algorithmTestDemo.ValidParentheses;

import java.util.Arrays;


public class TestDemo {
    public static void main(String[] args){
        //testStringLengthCompare();
        //testPalindrome();
        //testValidParentheses();
        testMaxSubArray();
        System.out.println(randomStr(6));
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

    private static void testMaxSubArray(){
        Integer[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaxSubArray().maxSubArray1(arr));
    }

    /**
     * Top 6 bit obfuscation encryption
     * */
    private static String randomStr(int length){
        StringBuilder result = new StringBuilder();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int charLen = chars.length();
        for (int i = 0; i < length; i++) {
            result.append(chars.charAt((int)Math.floor(Math.random() * charLen)));
        }
        return result.toString();
    }

}
