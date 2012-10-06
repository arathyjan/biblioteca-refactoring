package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {
    protected static boolean loggedIn = false;
    protected static String savedLibraryNumber = "";

    public static void main(String[] args) {
        ArrayList<command> menuOption=new ArrayList<command>();

        menuOption.add(new ListBookCatalog());
        menuOption.add(new CheckOutBooks());
        menuOption.add(new CheckLibraryNumber());
        menuOption.add(new MovieListing());
        menuOption.add(new Login());
        command cmd;
        commandInvoker cmdInvoker;
        while (true) {

            displayMenu();
            int option= readInt();
            if(option<=menuOption.size()&&option>0) {
                cmd=menuOption.get(option-1);
                cmdInvoker=new commandInvoker(cmd);
                cmdInvoker.invoke();
            }
            else if (option == 9) {
                System.out.println("Quitting...");
                break;
            }

            else {
                System.out.println("\n");
                System.out.println("Enter a valid integer!!");
            }
        }
    }





    private static void displayMenu() {
        System.out.println("**********************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Check out Book                              *");
        System.out.println("*         3. Check Library Number                        *");
        System.out.println("*         4. Movie Listing                               *");
        System.out.println("*         5. Login                                       *");
        System.out.println("*         9. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");

    }

    protected static int readInt() {

        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        int menuOption = 0;
        try {
            menuOption = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Enter a valid integer!!");
        }
        return menuOption;
    }
    protected static String readString()
    {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        String value="";
        try {
            value = reader.readLine();
        } catch (Exception e) {

        }
        return value;

    }
}

