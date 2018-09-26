package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 拷贝字符流的FileReader，FileWriter（文本文件）
 * @author wqh
 * @date 18-9-26
 */
public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        try(FileReader fileReader = new FileReader("in.txt");
                FileWriter fileWriter = new FileWriter("character_out.txt")
                ) {
            int ch ;
            while ((ch=fileReader.read())!=-1){
                fileWriter.write(ch);
            }
        }


    }
}
