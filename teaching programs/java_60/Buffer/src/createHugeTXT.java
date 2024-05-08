import java.io.FileWriter;
import java.io.IOException;

public class createHugeTXT {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<1024;i++){

            sb.append('a');
        }

        FileWriter fw = new FileWriter("buffer\\source\\1.txt");

        for(int i =0;i<1024;i++){

            fw.write(sb.toString());
        }

        fw.close();
    }
}
