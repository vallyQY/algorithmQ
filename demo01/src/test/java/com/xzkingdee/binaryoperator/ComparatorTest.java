package com.xzkingdee.binaryoperator;

import com.xzkingdee.compare.CompareLen;
import com.xzkingdee.compare.compareable.dto.LegDto;
import com.xzkingdee.compare.compareable.dto.LegDtoComparator;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class ComparatorTest {

    @Test
    public void testComparator(){
        String[] str = {"harry","robot","wali","alice","taylor","lena","linda","luis","aimilicate"};
        Comparator<String> comparator = new CompareLen();
        Arrays.sort(str,comparator);
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void testLegComparator(){
        Set<LegDto> origin = new TreeSet<>(new LegDtoComparator());
        LegDto temp;
        for(int i=0;i<75;i++){
            temp = new LegDto("LegDto:"+i,i);
            origin.add(temp);
        }
        origin.forEach(System.out::println);
    }
}
