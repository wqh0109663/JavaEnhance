package io;

import java.io.*;

/**
 * @author wqh
 * @date 18-9-26
 */
public class BufferReadLineDemo {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("in.txt"));
             PrintWriter printWriter = new PrintWriter(new FileWriter("buffer_out.txt"))
        ) {
            String l;
            while ((l = bufferedReader.readLine()) != null) {
                /**
                 * 会叠加到一行输出printWriter.write(l);printWriter.flush()
                 */
                printWriter.println(l);
            }

        }


    }
}
