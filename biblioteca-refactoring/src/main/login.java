package main;

public class Login implements command{
    @Override
    public void execute()
    {
        Login.login();
    }

    private static void login() {
        clearLogin();
        System.out.println("Enter your library number");

        String libraryNumber =Program.readString();
        if (validLibraryNumber(libraryNumber)) {

            System.out.println("Enter your Password: ");

            if (validPassword(Program.readString())) {
                Program.loggedIn = true;
                Program.savedLibraryNumber = libraryNumber;
            }

        }
    }

    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }
    private static void clearLogin() {
        Program.loggedIn = false;
        Program.savedLibraryNumber = "";
    }

}
