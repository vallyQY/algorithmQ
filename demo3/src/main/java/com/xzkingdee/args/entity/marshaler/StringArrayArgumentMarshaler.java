package com.xzkingdee.args.entity.marshaler;

import com.xzkingdee.args.exception.ArgsException;
import com.xzkingdee.args.exception.ErrorCode;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author qy
 * @date 2020/8/2
 */
public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] stringArr = new String[0];

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        int i = 0;
        try {
            if (currentArgument.hasNext()) {
                stringArr[i] = currentArgument.next();
                i += 1;
            }
        } catch (NoSuchElementException e) {
            throw new ArgsException(ErrorCode.MISSING_STRING);
        }
    }

    public static String[] getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArrayArgumentMarshaler) {
            return ((StringArrayArgumentMarshaler) am).stringArr;
        } else {
            return new String[0];
        }
    }
}
