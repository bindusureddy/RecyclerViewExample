package com.ceyon.recyclerviewexample;

public class Product {

    private int id;
    private String title;
    private String image;
    private String Description;
    private double Rating;
    private double Price;


    public Product(int id, String title, String image, String description, double Rating, double Price){
        this.id= id;
        this.title = title;
        this.Description = description;
        this.Rating = Rating;
        this.Price = Price;
        this.image = image;


    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return Description;
    }

    public double getRating() {
        return Rating;
    }

    public double getPrice() {
        return Price;
    }
}
