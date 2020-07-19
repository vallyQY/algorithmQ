package com.xzkingdee.stream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author qy
 * @date Created in 14:29 2020/7/1
 **/
@Data
public class CustBook {

    private String bookName;

    public CustBook(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
