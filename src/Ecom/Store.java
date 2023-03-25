package Ecom;

import java.util.*;

import Orders.Cart;
import ProductDetails.Catalogue;
import ProductDetails.Product;
import Users.*;

public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to the ecommerce store!");
		System.out.println("Which user are you? 1.Customer 2.Seller 3.Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your userId?");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			
			System.out.println("What is your password");
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("user verified");
				while (true) {
					System.out.println("Do you want to 1.view Products 2.view Cart 3.contact Us 4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("choose category");
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListOfAllProduct();
						System.out.println("1.Clothes 2.Electronic 3.Furniture");
						sc.nextLine();
						int chooseCategory = sc.nextInt();
						String selected = "";
						if (chooseCategory == 1) {
							selected = "Clothes";
						} else if (chooseCategory == 2) {
							selected = "Electronic";
						} else if (chooseCategory == 1) {
							selected = "Furniture";
						}

						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
						System.out.println("Do you want to add any product to the cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();

						if (addToCart.equals("Y")) {
							System.out.println("Input the product id of the product which you want to add to the cart.");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId))
									cartProducts[0] = allProducts[i];
							}
							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListOfProducts(cartProducts);
							current.setCart(cart);
							System.out.println("The product is successfully added to the cart");
						}
					} else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProducts();
						current.getCart();
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y")) {
							if (current.getCart().checkOut()) {
								System.out.println("Your order is " + 1 + " for the user id " + current.getUserId()+ " placed successfully");
							}
						}

					} else if (choice == 3) {
						System.out.println("To contact us, please email on store@ecom.com");
					} else if (choice == 4) {
						break;
					} else {
						System.out.println("Invalid input, please try again.");
					}
				}
			}
		}

		else if (choice == 2) {
			typeOfUser = "Seller";
			Seller cs = new Seller();
			System.out.println("What is your sellerId?");
			sc.nextLine();
			cs.setSellerId(sc.nextLine());
			System.out.println("What is your password?");
			cs.setSellerPassword(sc.nextLine());
			if (cs.verifyUser() == true) {
				System.out.println("Seller verified");
				while (true) {
					System.out.println("Do you want to 1.view Products 2.Add Product 3.contact Us 4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("choose category");
						Catalogue catalogue2 = new Catalogue();
						Product[] allProducts = catalogue2.getSellerProducts();
						System.out.println("1.Clothes 2.Electronic 3.Furniture");
						sc.nextLine();
						int chooseCategory = sc.nextInt();
						String selected = "";
						if (chooseCategory == 1) {
							selected = "Clothes";
						} else if (chooseCategory == 2) {
							selected = "Electronic";
						} else if (chooseCategory == 1) {
							selected = "Furniture";
						}

						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
					}
					else if (choice == 2) {
							System.out.println("Add product to the category");
							Catalogue catalogueAdd = new Catalogue();
							sc.nextLine();
							catalogueAdd.setAddProduct(sc.nextLine());
							System.out.println("product added " + catalogueAdd.getAddProduct()+ " sucessfully");
							
						}
						else if(choice==3){
							System.out.println("To contact us, please email on store@ecom.com");
						}
						else if(choice == 4) {
							break;
						}
						else {
							System.out.println("Invalid input try again");
						}
					}
				

			}
		}

		else if (choice == 3) {
			typeOfUser = "Admin";
			Admin current1 = new Admin();
			while (true) {
				System.out.println("Do you want to 1.view all Products");
				choice = sc.nextInt();
				if (choice == 1) {
					Catalogue catalogue1 = new Catalogue();
					Product[] allProducts = catalogue1.getListOfAllProduct();
					for (int i = 0; i < allProducts.length; i++) {
						System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName() + " "
								+ allProducts[i].getCost());
					}
					
				}
			}
		
		} else
			System.out.println("Invalid input.Try again");
	}
}
