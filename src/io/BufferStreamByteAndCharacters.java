package io;

import java.io.*;

/** BufferedInputStream与 BufferedOutputStream创建缓冲字节流
 *  BufferedReader与 BufferedWriter创建缓冲字符流,见BufferReadLineDemo.java
 * @author wqh
 * @date 18-9-26
 */
public class BufferStreamByteAndCharacters {
    public static void main(String[] args) throws IOException {


        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("in.txt"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("buffer_byte_out.txt"))
        ) {
            byte[] bytes = new byte[1024];
            int ch ;
            while ((ch=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,ch);
            }
            bufferedOutputStream.flush();
        }



    }
}
