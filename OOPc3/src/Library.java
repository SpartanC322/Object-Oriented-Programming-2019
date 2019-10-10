import javax.swing.*;

public class Library
{
    public static void main(String[] args)
    {
        String title, ISBN;
        int pages;
        double price;

        Book[] book = new Book[2];
        Book book2;


        for(int i=0; i <= 1;i++)
        {
            title = JOptionPane.showInputDialog(null,"Please enter the title");

            ISBN = JOptionPane.showInputDialog(null,"Please enter the ISBN");

            pages = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of pages"));

            price = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price"));

            book2 = new Book (title,ISBN,price,pages);

            book[i] = book2;

        }

        for(int i=0; i <= 2; i++)
        {
            JOptionPane.showMessageDialog(null, book[i]);
        }

        System.exit(0);


    }
}
