package com.xzkingdee.utils;

import com.google.common.base.CaseFormat;
import com.google.common.base.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseFormatTest {

    @Test
    public void testCoverter() {
        Converter<String, String> camelConverter = CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL);
        String input = "input_camel";
        String result = camelConverter.convert(input);
        System.out.println(result);
    }

    @Test
    public void toTest() {
        /*将str按照源caseFormat格式转化为目标format格式*/
        String result = CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "foo-bar");
        System.out.println(result);
        assertEquals("fooBar", result);
    }

    @Test
    public void toTestCamel() {
        /*将str按照源caseFormat格式转化为目标format格式*/
        String origin = "input_camel";
        String result = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, origin);
        System.out.println(result);
    }
}
