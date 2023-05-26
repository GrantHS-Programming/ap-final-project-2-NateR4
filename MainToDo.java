import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class MainToDo {
    Scanner myScanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        new MainToDo();

    }
    public void menu() throws IOException {
        System.out.println("0. Exit list");
        System.out.println("1. Show list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println("Chose an option");
        int choice = myScanner.nextInt();
        if (choice == 0){
            exitList();
        }
        if (choice == 1){
            showList();
            menu();
        }
        if (choice ==2){
            addList();
        }
        if (choice == 3){
            removeList();
        }
    }
    public void exitList(){

    }
    public void showList(){
        System.out.println("To Do List:\n");
        for (int i = list.size()-1;i>=0;i = list.size()-1){
            list.remove(i);
        }
        try {
            File fileobj = new File("C:\\Users\\nrobertson4799\\IdeaProjects\\ap-final-project-2-NateR4\\ToDo.txt");
            Scanner input = new Scanner(fileobj);
            int count= 1;
            while (input.hasNext()) {
                String text = input.nextLine();
                System.out.println(count + ": " + text);
                count++;

                list.add(text);
            }
            System.out.println("");

        }
        catch (IOException ioe) {
            System.out.println("Can't access file");
        }
    }
    public void addList() {
        System.out.println("What would you like to add?");
        try {
            String add = myScanner.next();
            FileWriter file = new FileWriter("ToDo.txt", true);
            BufferedWriter writer = new BufferedWriter(file);
            writer.write(add + "\n");
            writer.close();
                menu();
        }
            catch (IOException ioe) {
                System.out.println("Can't access file");
            }

        }

    public void removeList(){
        showList();
        System.out.println("What would you like to remove?");
        int remove = myScanner.nextInt()-1;
        try{
            FileWriter fw = new FileWriter("ToDo.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();

        }
        catch (IOException ioe){
            System.out.println("Can't access file");
        }
    }
    public static void clearFile()
    {
        try{
            FileWriter fw = new FileWriter("ToDo.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }catch(Exception exception){
            System.out.println("Exception have been caught");
        }
    }
    public MainToDo() throws Exception{
        menu();
    }
}
