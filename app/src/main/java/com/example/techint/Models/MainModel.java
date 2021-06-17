package com.example.techint.Models;

public class MainModel {
    int image;




    String ratings;
    String name ,price,description;
    public MainModel(int image, String name, String price, String description,String ratings) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
        this.ratings=ratings;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }



}
