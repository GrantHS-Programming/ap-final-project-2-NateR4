import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    //to do, search append to existing file


    public static void main(String[] args) {
        try {
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("output2.txt"));
            //writer2.write("writing to a file!!");
            writer2.append("\n This should be a line down");
            writer2.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
