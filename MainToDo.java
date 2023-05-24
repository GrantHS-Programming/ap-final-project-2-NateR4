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
            menu();
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
            writer.write("\n" + add);
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

    }
    public MainToDo() throws Exception{
        menu();
    }
}
