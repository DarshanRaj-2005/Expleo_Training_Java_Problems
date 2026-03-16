package hands_on_08;
import java.util.Scanner;

/* Creating invoice for a product */
class Invoice {

    int partNumber;
    String description;
    int quantity;
    double price;

    public Invoice(int partNumber, String description, int quantity, double price) {

        if(partNumber <= 0)
            throw new IllegalArgumentException("Part number must be greater than 0");

        if(description == null || description.trim().isEmpty())
            throw new IllegalArgumentException("Description cannot be empty");

        if(quantity <= 0)
            throw new IllegalArgumentException("Quantity must be greater than 0");

        if(price <= 0)
            throw new IllegalArgumentException("Price must be greater than 0");

        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}

public class Prob_005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter the part number:");
            int partNumber = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter the part description:");
            String description = sc.nextLine();

            System.out.println("Enter Quantity:");
            int quantity = sc.nextInt();

            System.out.println("Enter the price per item:");
            double price = sc.nextDouble();

            Invoice i = new Invoice(partNumber, description, quantity, price);

            System.out.println("Total Price: " + i.getInvoiceAmount());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input type");
        }

        sc.close();
    }
}