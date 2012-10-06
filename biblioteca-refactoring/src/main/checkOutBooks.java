package main;
public class CheckOutBooks implements command {
    @Override
    public void execute()
    {
      CheckOutBooks.checkOutBooks();
    }
    private static void checkOutBooks() {
        System.out.println(" Please enter the number of the book you wish to checkout: ");
        int selectedBook = Program.readInt();

        System.out.println("\n");
        if(selectedBook>0&&selectedBook<4)
            System.out.println(" Thank You! Enjoy the book.");
        else
            System.out.println("Sorry we don't have that book yet.");

    }

}
