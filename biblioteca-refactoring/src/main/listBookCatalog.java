package main;

public class ListBookCatalog implements command {
    @Override
    public void execute()
    {
     ListBookCatalog.listBookCatalog();
    }
    private static void listBookCatalog() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
    }
}
