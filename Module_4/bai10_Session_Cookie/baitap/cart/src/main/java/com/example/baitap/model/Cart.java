package com.example.baitap.model;


import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart;

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    public Cart() {
        cart = new HashMap<>();
    }


    public Cart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    public Integer getAmount(Product product) {
        return cart.get(product);
    }

    public void saveCart(Product product) {
        if (cart.containsKey(product)) {
            cart.replace(product, cart.get(product), cart.get(product) + 1);
        } else {
            cart.put(product, 1);
        }
    }

    public void remove(Product product) {
        cart.remove(product);
    }

    public void deleteAll() {
        cart.clear();
    }
}
