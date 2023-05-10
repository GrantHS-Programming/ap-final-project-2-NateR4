import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test {
    //to do, search append to existing file


    public static void main(String[] args)throws IOException {
            //Appending to a file
            FileWriter file = new FileWriter("MyFile.txt",true);
            BufferedWriter writer2 = new BufferedWriter(file);
           // writer2.write("writing to a file!!");
           // writer2.newLine();
            writer2.close();
            file.close();

            //Reading file
        File fileobj = new File("C:\\Users\\nrobertson4799\\IdeaProjects\\ap-final-project-2-NateR4\\MyFile.txt");
        Scanner input = new Scanner(fileobj);
            while (input.hasNext() ){
                String a = input.nextLine();
                System.out.println(a);
            }
    }

}
