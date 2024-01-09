package utilities;

import java.util.ArrayList;
import java.util.List;

import entities.CartItem;

public class Cart {
	private static List<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        items.removeIf(item -> item.getItemId().equals(itemId));
    }

    public void updateQuantity(String itemId, int quantity) {
        for (CartItem item : items) {
            if (item.getItemId().equals(itemId)) {
                item.setQuantity(quantity);
                break;
            }
        }
    }

    public static List<CartItem> getItems() {
        return items;
    }
    
    
    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
