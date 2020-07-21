package com.letcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetCodeTest {

    @Test
    public void testSearchIndex() {
        int[] inputData = {1, 2, 3, 4, 5};
        assertEquals(3, SearchIndex.searchInsert(inputData, 3));
    }

    @Test
    public void testRevertString(){
        String origion = "hello";
        assertEquals("olleh",StringRevert.revertString(origion));
        assertEquals("olleh",StringRevert.revertStringAdd(origion));
    }
}
