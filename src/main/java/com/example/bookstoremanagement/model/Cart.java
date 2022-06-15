package com.example.bookstoremanagement.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Book,Integer> listBook = new HashMap<>();
    private int sumPrice;

    public Cart() {
    }

    public Map<Book, Integer> getListBook() {
        return listBook;
    }

    public void setListBook(Map<Book, Integer> listBook) {
        this.listBook = listBook;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }
}
