package main;

public class CheckLibraryNumber implements command {
    @Override
    public void execute()
    {
        CheckLibraryNumber.checkLibrarayNumber();

    }
    private static void checkLibrarayNumber() {
        if (loggedIn()) {
            System.out.println("\n");
            System.out.println("Your library number is " + Program.savedLibraryNumber);
        } else {

            System.out.println("\n");
            System.out.println("Please talk to Librarian. Thank you. ");
        }
    }
    private static boolean loggedIn() {
        return Program.loggedIn;
    }

}
