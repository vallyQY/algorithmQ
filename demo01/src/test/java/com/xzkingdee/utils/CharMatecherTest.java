package com.xzkingdee.utils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author qy
 * @date Created in 2020/7/16
 **/
public class CharMatecherTest {

    private final static String input = "H*el.lo,}12";

    /**
     * 保留字符串中的字符和数字
     */
    @Test
    public void testRetainForm() {
        String retain = CharMatcher.forPredicate(Character::isLetterOrDigit).retainFrom(input);
        System.out.println(retain);
    }

    /**
     * and 操作
     */
    @Test
    public void testAnd() {
        CharMatcher charMatcher = CharMatcher.forPredicate(Character::isLetter);
        CharMatcher charMatcher1 = CharMatcher.forPredicate(Character::isLowerCase);
        String retain = charMatcher.and(charMatcher1).retainFrom(input);
        System.out.println(retain);
    }

    /**
     * 匹配任意字符
     */
    @Test
    public void testAny() {
        String retain = CharMatcher.any().retainFrom(input);
        System.out.println(retain);

        CharMatcher matcher = CharMatcher.none();
        System.out.println(matcher.removeFrom(input));
    }

    /**
     * 匹配指定字符,(或过滤指定字符)
     */
    @Test
    public void testAnyOf() {
        String retain = CharMatcher.anyOf("hel").retainFrom(input);
        String remove = CharMatcher.anyOf("hel").removeFrom(input);
        //不匹配input中的任意一个字符，与anyOf相反
        String noneOf = CharMatcher.noneOf("hel").removeFrom(input);
        System.out.println(retain);
        assertEquals("ell", retain);
        System.out.println(remove);
        assertEquals("H*.o,}12", remove);
        System.out.println(noneOf);
    }

    /**
     * 将charMatcher连续被匹配到的字符用一个replacement替换
     */
    @Test
    public void testCollapse() {
        String input = "       hel    lo      ";
        String result = CharMatcher.whitespace().trimAndCollapseFrom(input, '-');
        String resultWithoutTrim = CharMatcher.whitespace().collapseFrom(input, '-');
        System.out.println(result);
        System.out.println(resultWithoutTrim);
    }

    /**
     * 统计字符串中字母和数字出现的次数
     */
    @Test
    public void testCount() {
        CharMatcher charMatcher = CharMatcher.forPredicate(Character::isLetterOrDigit);
        assertEquals(7, charMatcher.countIn(input));
    }

    /**
     * 统计字符第一次出现的下标
     * 或指定下标后第一次出现的位置
     * 或最后一个出现的位置
     */
    @Test
    public void testIndexIn() {
        String input = "**el.lo,}12";
        CharMatcher charMatcher = CharMatcher.forPredicate(Character::isLetterOrDigit);
        System.out.println(charMatcher.indexIn(input));
        System.out.println(charMatcher.indexIn(input, 4));
        System.out.println(charMatcher.lastIndexIn(input));
    }

    /**
     * 判断CharSequence每一个字符是不是都已被charMatcher匹配
     */
    @Test
    public void matchesAllOfTest() {
        String input = "**e,l.lo,}12";
        CharMatcher matcher = CharMatcher.is(',');
        System.out.println(matcher.matchesAllOf(input));
        System.out.println(matcher.matchesAnyOf(input));
        System.out.println(matcher.matchesNoneOf(input));
        assertFalse(matcher.matchesAllOf(input));
    }

    /**
     * 删除前后指定的字符
     * */
    @Test
    public void testTrim(){
        String input = "---hello,,,";
        System.out.println(CharMatcher.is('-').trimLeadingFrom(input));
        System.out.println(CharMatcher.is(',').trimTrailingFrom(input));
        System.out.println(CharMatcher.anyOf("-,").trimAndCollapseFrom(input,'='));
    }

    @Test
    public void testMethod() {
        System.out.println(CharMatcher.is('a').removeFrom("acvd"));
        System.out.println(CharMatcher.inRange('a', 'b').replaceFrom("eabcvdf", "hh"));

    }

    @Test
    public void withKeyValueSeparatorTest() {
        Map<Integer, String> idNameMap = Maps.newHashMap();
        idNameMap.put(1, "Michael");
        idNameMap.put(2, "Mary");
        idNameMap.put(3, "Jane");

        String result = Joiner.on("\n").withKeyValueSeparator(":").join(idNameMap);
        System.out.println(result);
    }

    @Test
    public void testRemoveLinebreaks() {
        String stringWithLinebreaks = "This is an example\n" +
                "of a String with linebreaks\n" +
                "we want on one line";
        String expected = "This is an example of a String with linebreaks we want on one line";
        String scrubbed = CharMatcher.breakingWhitespace().replaceFrom(stringWithLinebreaks, ' ');
        System.out.println(scrubbed);
        assertThat(scrubbed, is(expected));
    }

    @Test
    public void testRemoveWhiteSpace() {
        String tabsAndSpaces = "String  with      spaces     and           tabs";
        String expected = "String with spaces and tabs";
        String scrubbed = CharMatcher.whitespace().collapseFrom(tabsAndSpaces, ' ');
        System.out.println(scrubbed);
        assertThat(scrubbed, is(expected));
    }

    @Test
    public void testTrimRemoveWhiteSpace() {
        String tabsAndSpaces = "    String  with      spaces     and           tabs";
        String expected = "String with spaces and tabs";
        String scrubbed = CharMatcher.whitespace().trimAndCollapseFrom(tabsAndSpaces, ' ');
        System.out.println(scrubbed);
        assertThat(scrubbed, is(expected));
    }

    @Test
    public void testRetainFrom() {
        String lettersAndNumbers = "foo989yxbar234";
        String expected = "989234";
        String retained = CharMatcher.javaDigit().retainFrom(lettersAndNumbers);
        System.out.println(retained);
        assertThat(expected, is(retained));
    }

    @Test
    public void testCombineMatchers() {
        CharMatcher cm = CharMatcher.inRange('A', 'E');
        String retained = cm.retainFrom("aaaABbbccCdddDEeee");
        System.out.println(retained);
        assertThat(retained, is("ABCDE"));
    }


}