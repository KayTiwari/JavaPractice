import java.io.*;

//Byte streams
public class inputoutput {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        //whats coming in
        FileOutputStream out = null;
        //whats going to destination

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while (c = in.read() != -1){
                out.write(c);
            }
        } finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}

//io library consists of every class needed
// input source -> destination
// io stream - sequence of data

//1st: input stream - used to read data from source
// source -input-> program -output-> destination
//2nd: output stream - writing data to destination
