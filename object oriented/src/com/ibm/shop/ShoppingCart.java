package com.ibm.shop;
public class ShoppingCart {
	private Product[] products;
	private double total;
	private int idx;
	 public ShoppingCart() {
		 products = new Product[5];
	 }
	 public void addToCart(Product p) {
		 
	 }
	 public void checkout() {
		 System.out.println("Products in Your cart");
		 for(int i=0;i<idx;i++)
			 products[i].description();
		 System.out.println("Cart Total:" + total);
	 }

}