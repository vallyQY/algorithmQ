package com.xzkingdee.args;

import com.xzkingdee.args.entity.Args;
import com.xzkingdee.args.exception.ArgsException;

/**
 * @author qy
 * @date 2020/8/2
 */
public class ArgsCall {

    public static void main(String[] args) {
        try {
            Args arg = new Args("1,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            //executeApplication(logging, port, directory);
            System.out.println(logging);
            System.out.println(port);
            System.out.println(directory);
        } catch (ArgsException e) {
            System.out.printf("Argumenterror:%s\n", e.errorMessage());
        }
    }
}
