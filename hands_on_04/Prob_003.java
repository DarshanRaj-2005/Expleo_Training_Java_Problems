package hands_on_04;

import java.util.Scanner;
import java.util.ArrayList;

//Product Cart Management System

class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;

	Product(int productId,String productName,double price,int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;			
	}
	
	public int getProductId() {
		return productId;
	}
	
	public double getProductPrice() {
		return price;
	}

	public String getProductDetails() {
		return "-----------------------\n"+"Product Id: "+ productId +
			   "\nProduct Name: "+productName +
				"\nProduct Price: "+price + "\nProduct Quantity: "+quantity 
				+"\n-----------------------\n";
	}

	public void setQuantity(int newQty) {
			quantity = newQty;
	}

	public double calculateTotal() {
		return price * quantity;
	}
}

class Cart {
	private ArrayList<Product> products = new ArrayList<>();
	
	
	public void addProduct(Product p) {
		products.add(p);
	}

	public void removeProduct(int productId) {
		int flag = 0;
		for(int i = 0; i < products.size();i++) {
			if(productId == products.get(i).getProductId()) {
				products.remove(i);
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("Product Removed from Cart");
		}
		else {
			System.out.println("Product Not Available in Cart");
		}
	}
	
	public void updateQuantity(int id, int quantity ) {
		
		for(Product p : products) {
			if(id == p.getProductId()) {
				p.setQuantity(quantity);
			}
		}
	}
	public void calculateCartTotal() {
		double total = 0;
		
		for(Product p : products) {
			total += p.calculateTotal();
		}
		
		System.out.println("Total Price: "+total);
	}

	public void displayCartItems() {
		if (products.isEmpty()) {
			System.out.println("Cart is Empty");
		}
		for(Product p : products) {
			System.out.print(p.getProductDetails());
		}
	}
}

public class Prob_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product p = null;
		
		Cart c = new Cart();
		

		while (true) {
			
			System.out.println("1. Add Product to Cart");
			System.out.println("2. Remove Product to Cart");
			System.out.println("3. Update Product Quantity");
			System.out.println("4. Display Cart Items");
			System.out.println("5. View Total Cart Price");
			System.out.println("6. Exit");
			int action = sc.nextInt();
			
			if (action ==1) {
				System.out.println("Enter Product Id:");
				int id = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Product Name:");
				String name = sc.nextLine();
				
				System.out.println("Enter Price of the Product:");
				double price = sc.nextDouble();
				
				System.out.println("Enter Quantity of Product:");
				int quantity = sc.nextInt();
				
				p = new Product(id,name,price,quantity);
				c.addProduct(p);
				
				System.out.println("Product added to Cart");
			}
			else if (action == 2) {
				if (p != null) {
					System.out.println("Enter Product Id:");
					int id = sc.nextInt();
					
					c.removeProduct(id);
				}
				
				else {
					System.out.println("Please Add the Product");
				}
			}
			else if (action == 3) {
				if(p != null) {
					System.out.println("Enter Product Id:");
					int id = sc.nextInt();
					
					System.out.println("Enter Product Quantity:");
					int quantity = sc.nextInt();
					
					c.updateQuantity(id, quantity);
					
				}
			}
			else if (action == 4) {
					c.displayCartItems();
			}
			else if (action ==5) {
				c.calculateCartTotal();
			}
			else if (action == 6) {
				break;
			}
		}
	}
}
