package com.example.bookstoremanagement.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private int quantity;
    private int rest;
    private String writer;
    private String translator;
    private String producer;
    private int pages;
    private String size;
    @Column(columnDefinition = "Date")
    private String date;
    private int price;
    private int promotion;
    @ManyToOne()
    private Category category;
    @ManyToMany(mappedBy = "listBook")
    private Set<Customer> customerList;

    public Book() {
    }

    public Book(String code, int quantity, int rest, String writer, String translator,
                String producer, int pages, String size,
                String date, int price, int promotion, Category category,
                Set<Customer> customerList) {
        this.code = code;
        this.quantity = quantity;
        this.rest = rest;
        this.writer = writer;
        this.translator = translator;
        this.producer = producer;
        this.pages = pages;
        this.size = size;
        this.date = date;
        this.price = price;
        this.promotion = promotion;
        this.category = category;
        this.customerList = customerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(Set<Customer> customerList) {
        this.customerList = customerList;
    }
}
