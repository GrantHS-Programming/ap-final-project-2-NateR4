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
    public void file() throws Exception{
        //Creating File and writing to it
        FileWriter file = new FileWriter("ToDo.txt");
        BufferedWriter writer = new BufferedWriter(file);
        writer.write("writing to a file!");
        writer.close();
    }
    public void menu(){
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

    }
    public void addList(){
        System.out.println("What would you like to add?");
        String add = myScanner.next();
    }
    public void removeList(){

    }
    public MainToDo() throws Exception{
        file();
        menu();
    }
}
