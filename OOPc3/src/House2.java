import javax.swing.*;

public class House2
{
    public static void main(String[] args)
    {
        String address, type, owner;
        int price;

        address = JOptionPane.showInputDialog(null,"Please enter the address: ");
        type = JOptionPane.showInputDialog(null, "Please enter the type of house: ");
        price = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the price of this house: "));
        owner = JOptionPane.showInputDialog(null,"Please enter the name of the owner: ");

        House house = new House(address, type, price, new Person(owner));

        JOptionPane.showMessageDialog(null, house);

    }


}
