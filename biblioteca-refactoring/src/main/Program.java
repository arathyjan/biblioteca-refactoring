package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    private static boolean loggedIn = false;
    private static String savedLibraryNumber = "";

    public static void main(String[] args) {
        while (true) {

            displayMenu();
            int menuOption= readInt();

            if (menuOption == 1)
                listBookCatalog();

            else if (menuOption == 2)
                checkOutBooks();

            else if (menuOption == 3)
                checkLibrarayNumber();

            else if (menuOption == 4)
                movieListing();

            else if (menuOption == 5)
                login();

            else if (menuOption == 9) {
                System.out.println("Quitting...");
                break;
            }

            else {
                System.out.println("\n");
                System.out.println("Enter a valid integer!!");
            }
        }
    }

    private static void login() {
        clearLogin();
        System.out.println("Enter your library number");

        String libraryNumber =readString();
        if (validLibraryNumber(libraryNumber)) {

            System.out.println("Enter your Password: ");

            if (validPassword(readString())) {
                loggedIn = true;
                savedLibraryNumber = libraryNumber;
            }

        }
    }

    private static void movieListing() {
        System.out.println(createMovie("Rocky", "John G. Avildsen", "10"));
        System.out.println(createMovie("Rocky II", "John G. Avildsen", "9"));
        System.out.println(createMovie("Rocky III", "John G. Avildsen", "8"));
        System.out.println(createMovie("Rocky IV", "John G. Avildsen", "7"));
        System.out.println(createMovie("Rocky V", "John G. Avildsen", "8"));
        System.out.println(createMovie("Drainage", "Francisco Trindade", "N/A"));
        System.out.println(createMovie("The Shawshank Redemption", "Frank Darabont", "10"));
        System.out.println(createMovie("The Godfather", "Francis Ford Coppola", "7"));
        System.out.println(createMovie("Inception", "Frank Darabont", "10"));
        System.out.println(createMovie("Pulp Fiction", "Quentin Tarantino", "6"));
    }

    private static void checkLibrarayNumber() {
        if (loggedIn()) {
            System.out.println("\n");
            System.out.println("Your library number is " + savedLibraryNumber);
        } else {

            System.out.println("\n");
            System.out.println("Please talk to Librarian. Thank you. ");
        }
    }

    private static void checkOutBooks() {
        System.out.println(" Please enter the number of the book you wish to checkout: ");
        int selectedBook = readInt();

        System.out.println("\n");
        if(selectedBook>0&&selectedBook<4)
            System.out.println(" Thank You! Enjoy the book.");
        else
            System.out.println("Sorry we don't have that book yet.");

    }

    private static void listBookCatalog() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
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

    private static int readInt() {

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
    private static String readString()
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


    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }

    private static boolean loggedIn() {
        return loggedIn;
    }


    private static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }

    private static String createMovie(String movieTitle, String movieDirector, String movieRanking) {
        return movieTitle + " - Director: " + movieDirector + " Rating: " + movieRanking;
    }
}

