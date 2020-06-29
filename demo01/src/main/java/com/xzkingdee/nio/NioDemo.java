package com.xzkingdee.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author qy
 * @date Created in 9:52 2020/6/29
 **/
public class NioDemo {

    public static void main(String[] args) {
        //测试byteBuffer
        //testByteBuffer();
        //测试channel
        //testChannel();

        //测试socketChannel,使用telnet 127.0.0.1 8089去测试链接情况，注意不能同时测试
        testSocketChannel();
    }

    private static void testByteBuffer() {
        String msg = "java amateur";
        ByteBuffer allocateBuffer = ByteBuffer.allocate(512);
        byte[] readBytes = msg.getBytes();
        allocateBuffer.put(readBytes);
        //转换读取模式
        allocateBuffer.flip();
        int i = 0;
        byte[] receiveArr = new byte[readBytes.length];
        while (allocateBuffer.hasRemaining()) {
            receiveArr[i++] = allocateBuffer.get();
        }
        System.out.println(new String(receiveArr));
    }

    private static void testChannel() {
        File file = new File("E:/algorithmQ/demo01/src/main/resources/nioTest.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            FileChannel inputChannel = fis.getChannel();
            ByteBuffer inputBuffer = ByteBuffer.allocate((int) file.length());
            inputChannel.read(inputBuffer);

            FileOutputStream fos = new FileOutputStream("E:/algorithmQ/demo01/src/main/resources/nioReceive.txt");
            FileChannel outputChannel = fos.getChannel();

            inputBuffer.flip();
            outputChannel.write(inputBuffer);

            fis.close();
            fos.close();
            inputChannel.close();
            outputChannel.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void testSocketChannel() {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8089);
            serverSocketChannel.bind(address);

            ByteBuffer byteAllocate = ByteBuffer.allocate(1024);
            while (true) {
                SocketChannel socketChannel = serverSocketChannel.accept();
                while (socketChannel.read(byteAllocate) != -1) {
                    System.out.println(new String(byteAllocate.array()));
                    byteAllocate.clear();
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
