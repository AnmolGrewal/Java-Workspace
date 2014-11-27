package Lab6;
//***************************************************************
//Shop.java
//
//Uses the Item class to create items and add them to a shopping
//cart stored in an ArrayList.
//***************************************************************
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        double total = 0;
        
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        List<Item> cart = new ArrayList<Item>();
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            scan.nextLine();
            // *** print the contents of the cart object using println
            total += (item.getPrice() * item.getQuantity());
            cart.add(item);
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        } while (keepShopping.equals("y"));
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Your total price is: " + fmt.format(total));


        scan.close();
    }
}