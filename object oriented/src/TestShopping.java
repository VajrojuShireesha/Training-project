public class TestShopping {
public static void main(String []args) {
        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product ("Airpods",9000);
             cart.addToCart(p1);
             cart.addToCart(new Product("Apple Watch",220000));
             cart.checkout();
}
}