package io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wqh
 * @date 18-9-26
 */
public class ByteToCharacterStreamBridge {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("in.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             FileWriter fileWriter = new FileWriter("byte_to_character_out.txt")
                ) {
            int ch ;
            while ((ch=inputStreamReader.read())!=-1){
                fileWriter.write(ch);
            }

        }


    }
}
