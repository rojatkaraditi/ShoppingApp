package com.example.shoppingcartapp;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Products implements Serializable {
    int id, discount;
    String name, photo;
    Long price;
    Bitmap productImage;
    int quantity;

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", discount=" + discount +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", price=" + price +
                ", productImage=" + productImage +
                '}';
    }
}