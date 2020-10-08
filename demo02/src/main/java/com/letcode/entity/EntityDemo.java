package com.letcode.entity;

import java.time.LocalDateTime;

/**
 * description:
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/9/5
 */
public class EntityDemo {
    private LocalDateTime time;
    private String name;

    public EntityDemo() {
    }

    public EntityDemo(LocalDateTime time, String name) {
        this.time = time;
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntityDemo{" +
                "time=" + time +
                ", name='" + name + '\'' +
                '}';
    }
}
