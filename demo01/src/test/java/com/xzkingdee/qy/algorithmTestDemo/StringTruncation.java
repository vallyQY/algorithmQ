package com.xzkingdee.qy.algorithmTestDemo;
/**
 * String truncated by byte
 * Java intercepts strings with Chinese characters. Chinese characters cannot be intercepted into half.At present,sunstring(int beginIndex,int endIndex)
 *  is designed as truncating by Character.
 *          For example,String str = "我ABC",
 *                      System.out.println(str.substring(0,4))  ===>"我ABC"
 *      The reason for this problem is that the substring method treats double byte Chinese characters as one byte characters (ucs2 characters)
 * Example:
 *
 * Input: "我ABC",(4)
 * Output: "我A"
 *
 * Input: "我ABC汉DEF",(6)
 * Output: "我ABC"
 * */
public class StringTruncation {
}
