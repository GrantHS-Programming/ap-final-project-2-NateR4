import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test {
    //to do, search append to existing file

    public static String fileToString(String filePath) throws Exception {

        String input = null;
        Scanner sc = new Scanner(new File("C:\\Users\\nrobertson4799\\IdeaProjects\\ap-final-project-2-NateR4\\MyFile.txt"));
        StringBuffer sb = new StringBuffer();
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            sb.append(input);
        }
        return sb.toString();
    }


    public static void main(String[] args) throws Exception {
            //Appending to a file
            FileWriter file = new FileWriter("MyFile.txt",true);
            BufferedWriter writer2 = new BufferedWriter(file);
           // writer2.write("writing to a file!!");
           // writer2.newLine();
            ;




            //Reading file
        File fileobj = new File("C:\\Users\\nrobertson4799\\IdeaProjects\\ap-final-project-2-NateR4\\MyFile.txt");
        Scanner input = new Scanner(fileobj);
            while (input.hasNext() ){
                String text = input.nextLine();


                //String remove = text;
                //remove.replaceAll(remove, "");


            }
        String result = fileToString("C:\\Users\\nrobertson4799\\IdeaProjects\\ap-final-project-2-NateR4\\MyFile.txt");
        System.out.println("Contents:" + result);
        result = result.replaceAll("\bwriting to a file!!\b"," ");
        FileWriter writer3 = new FileWriter("C:\\Users\\nrobertson4799\\IdeaProjects\\ap-final-project-2-NateR4\\MyFile.txt");
        writer3.append(result);
        writer3.flush();
        //file.close();

        System.out.println("New contents:" + result);
    }


}
