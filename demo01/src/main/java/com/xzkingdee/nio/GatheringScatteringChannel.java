package com.xzkingdee.nio;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/**
 * @author qy
 * @date Created in 17:32 2020/6/29
 * 分散读取和聚合写入
 **/
public class GatheringScatteringChannel {

    public static void main(String[] args) {
        try {
            testGatheringScatter();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /**
     * 测试分散读取和聚合写入。理解
     */
    private static void testGatheringScatter() throws IOException {
        File file = new File("E:/algorithmQ/demo01/src/main/resources/gatherScatterTestFile.txt");
        FileInputStream fis = new FileInputStream(file);
        FileChannel fisChannel = fis.getChannel();

        File outFile = new File("E:/algorithmQ/demo01/src/main/resources/gatherScatterWriteResult.txt");
        FileOutputStream fos = new FileOutputStream(outFile);
        FileChannel fosChannel = fos.getChannel();

        ByteBuffer allocate1 = ByteBuffer.allocate(5);
        ByteBuffer allocate2 = ByteBuffer.allocate(5);
        ByteBuffer allocate3 = ByteBuffer.allocate(5);
        ByteBuffer[] buffers = new ByteBuffer[]{allocate1, allocate2, allocate3};


        //循环写入到buffers缓冲区数组中，分散读取
        long read;
        long sumLength = 0;
        while ((read = fisChannel.read(buffers)) != -1) {
            sumLength += read;
            Arrays.stream(buffers)
                    .map(buffer -> "position=" + buffer.position() + ",limit=" + buffer.limit())
                    .forEach(System.out::println);
            //切换模式
            Arrays.stream(buffers).forEach(Buffer::flip);
            //聚合写入到文件输出通道
            fosChannel.write(buffers);
            //清空缓冲区
            Arrays.stream(buffers).forEach(Buffer::clear);
        }
        System.out.println("总长度:" + sumLength);

        fis.close();
        fos.close();
        fisChannel.close();
        fosChannel.close();
    }
}
