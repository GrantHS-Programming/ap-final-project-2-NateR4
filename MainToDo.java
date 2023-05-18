import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class MainToDo {
    public static void main(String[] args) throws Exception{
        new MainToDo();

    }
    public void file() throws Exception{
        //Creating File and writing to it
        System.out.println("why won't this type");
        FileWriter file = new FileWriter("ToDo.txt");
        BufferedWriter writer = new BufferedWriter(file);
        writer.write("writing to a file!!");
    }
    public MainToDo() throws Exception{
        file();
    }
}
