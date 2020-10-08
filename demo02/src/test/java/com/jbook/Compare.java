package com.jbook;

import com.google.common.collect.Lists;
import com.letcode.entity.EntityDemo;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description:
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/9/5
 */
public class Compare {

    @Test
    public void test() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        List<EntityDemo> content = Lists.newArrayList();
        EntityDemo demo1 = new EntityDemo(LocalDateTime.now(), "a");
        content.add(demo1);
        EntityDemo demo2 = new EntityDemo(null, "a");
        content.add(demo2);

        EntityDemo demo3 = new EntityDemo(LocalDateTime.parse("2020-08-29 16:08:14", format), "a");
        content.add(demo3);

        System.out.println(content);
        List<EntityDemo> temp = Lists.newArrayList();
        content.forEach(item -> {
            if (item.getTime() == null) {
                temp.add(item);
            }
        });

        List<EntityDemo> collect = content.stream().filter(item -> item.getTime() != null)
                .sorted(Comparator.comparing(EntityDemo::getTime).reversed()).collect(Collectors.toList());
        if (temp.size() != 0) {
            collect.addAll(temp);
        }
        System.out.println(collect);
    }
}
