package com.xzkingdee.args.entity.marshaler;

import com.xzkingdee.args.exception.ArgsException;
import com.xzkingdee.args.exception.ErrorCode;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author qy
 * @date 2020/8/2
 */
public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(ErrorCode.MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArgumentMarshaler) {
            return ((StringArgumentMarshaler) am).stringValue;
        } else {
            return "";
        }
    }
}
