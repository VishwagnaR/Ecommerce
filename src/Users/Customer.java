package Users;

import Orders.Cart;

public class Customer extends User {
	private Cart cart;

	@Override
	public Boolean verifyUser() {
		return true;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
