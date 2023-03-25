package ProductDetails;

public class Catalogue {
	private Product[] listOfAllProduct;
	Category cat1 = new Category();
	Category cat2 = new Category();
	Category cat3 = new Category();
	private Product[] SellerProducts;
	public String addProduct = "";

	public Product[] getListOfAllProduct() {
		cat1.setCategoryName("Clothes");
		cat2.setCategoryName("Electronic");
		cat3.setCategoryName("Furniture");

		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Short");
		product1.setCost("200");
		product1.setCategory(cat1);
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("pant");
		product2.setCost("500");
		product2.setCategory(cat1);

		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("Mobile");
		product3.setCost("8000");
		product3.setCategory(cat2);
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Earphone");
		product4.setCost("500");
		product4.setCategory(cat2);

		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("Sofa");
		product5.setCost("12000");
		product5.setCategory(cat3);
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Chair");
		product6.setCost("4000");
		product6.setCategory(cat3);

		listOfAllProduct = new Product[6];
		listOfAllProduct[0] = product1;
		listOfAllProduct[1] = product2;
		listOfAllProduct[2] = product3;
		listOfAllProduct[3] = product4;
		listOfAllProduct[4] = product5;
		listOfAllProduct[5] = product6;

		return listOfAllProduct;
	}

	public void setListOfAllProduct(Product[] listOfAllProduct) {
		this.listOfAllProduct = listOfAllProduct;
	}

	public Product[] getSellerProducts() {
		cat1.setCategoryName("Clothes");
		cat2.setCategoryName("Electronic");
		cat3.setCategoryName("Furniture");

		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Short");
		product1.setCost("200");
		product1.setCategory(cat1);
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("pant");
		product2.setCost("500");
		product2.setCategory(cat1);

		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("Mobile");
		product3.setCost("8000");
		product3.setCategory(cat2);
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Earphone");
		product4.setCost("500");
		product4.setCategory(cat2);

		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("Sofa");
		product5.setCost("12000");
		product5.setCategory(cat3);
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Chair");
		product6.setCost("4000");
		product6.setCategory(cat3);

		SellerProducts = new Product[6];
		SellerProducts[0] = product1;
		SellerProducts[1] = product2;
		SellerProducts[2] = product3;
		SellerProducts[3] = product4;
		SellerProducts[4] = product5;
		SellerProducts[5] = product6;
		return SellerProducts;
	}

	public String getAddProduct() {
		return addProduct;
	}

	public void setAddProduct(String addProduct) {
		this.addProduct = addProduct;
	}
	

}
