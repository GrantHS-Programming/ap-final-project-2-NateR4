import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class MainToDo {
    //universal items I need in multiple classes
    Scanner myScanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> files = new ArrayList<>();
    String fileName;

    public static void main(String[] args) throws Exception{
        new MainToDo();

    }
    //Allows you to pick a file for your list
    public void choseList() throws IOException {
        System.out.println("These are your current lists");
        fileName = "Files.txt";
        showList();
        System.out.println("Type the name of your To-Do list. No spaces. \nIf you chose a new file, add an item first in the next step to create it.");
        fileName = myScanner.next();
        FileWriter file = new FileWriter("Files.txt", true);
        BufferedWriter writer = new BufferedWriter(file);
        boolean print = true;
        for (int i = 0;i< list.size();i++) {
            if (fileName.equals(list.get(i))) {
                print = false;
                break;
            }
        }
        if (print){
            writer.write(fileName + "\n");
        }
        writer.close();
        fileName += ".txt";

        menu();
    }
    //Prints the menu and calls appropriate methods depending on what the user wants
    public void menu() throws IOException {
        System.out.println("0. Exit list");
        System.out.println("1. Show list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println("4. Chose another list");
        System.out.println("5. Delete a list");
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
        if (choice == 4){
            choseList();
        }
    }
    //stops the code
    public void exitList(){

    }
    //Saves the list to an empty array list each time it runs.
    //Reads the contents of the file and saves it to the array list and prints the contents.
    public void showList(){
        System.out.println("List Contents:\n");
        for (int i = list.size()-1;i>=0;i = list.size()-1){
            list.remove(i);
        }
        try {
            File fileobj = new File(fileName);
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
    //Adds items to a new line of the list
    public void addList() {
        System.out.println("What would you like to add?");
        try {
            myScanner.skip("\\R?");
            String add = myScanner.nextLine();
            FileWriter file = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(file);
            writer.write(add + "\n");
            writer.close();
                menu();
        }
            catch (IOException ioe) {
                System.out.println("Can't access file");
            }

        }
//Calls showList method then saves the requested item to remove.
    //clears the whole file then replaces it with the contents of the array list minus the removed item.
    public void removeList(){
        showList();
        System.out.println("What would you like to remove?");
        int remove = myScanner.nextInt()-1;
        try{
            FileWriter fw = new FileWriter(fileName, false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();

            FileWriter file = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(file);
            list.remove(remove);
            for (int i = 0; i < list.size();i++) {

                writer.write(list.get(i) + "\n");
            }
            writer.close();
            menu();
        }
        catch (IOException ioe){
            System.out.println("Can't access file");
        }
    }
    public void removeFile(){
        System.out.println("These are your current lists");
        fileName = "Files.txt";
        showList();
        System.out.println("Type the name of the File you would like to remove (with.txt at the end)");
        fileName = myScanner.next();
    }

    public MainToDo() throws Exception{
        choseList();
    }
}
