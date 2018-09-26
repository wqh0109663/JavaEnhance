package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 拷贝字节流的FileInputStream和FileOutputStream（文本文件）
 * @author wqh
 * @date 18-9-26
 */
public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream("in.txt");
             FileOutputStream outputStream = new FileOutputStream("out.txt")) {
            int ch;
            while ((ch = inputStream.read()) != -1) {
                outputStream.write(ch);
            }

        }
    }
}
