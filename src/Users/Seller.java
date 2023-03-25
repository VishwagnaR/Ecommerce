package Users;

import ProductDetails.Product;

public class Seller extends User {
	String SellerId = "";
	String sellerPassword = "";
	private Product[] ProductListed;
	
	public String getSellerId() {
		return SellerId;
	}

	public void setSellerId(String sellerId) {
		this.SellerId = sellerId;
	}

	public String getSellerPassword() {
		return password;
	}

	public void setSellerPassword(String password) {
		this.password = password;
	}

	@Override
	public Boolean verifyUser() {
		return true;
	}

	public Product[] getProductListed() {
			return ProductListed;
	}

	public void setProductListed(Product[] productListed) {
		ProductListed = productListed;
	}

}
