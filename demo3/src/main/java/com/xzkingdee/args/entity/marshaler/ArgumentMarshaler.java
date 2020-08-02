package com.xzkingdee.args.entity.marshaler;

import com.xzkingdee.args.exception.ArgsException;

import java.util.Iterator;

/**
 * @author qy
 * @date 2020/8/2
 */
public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
