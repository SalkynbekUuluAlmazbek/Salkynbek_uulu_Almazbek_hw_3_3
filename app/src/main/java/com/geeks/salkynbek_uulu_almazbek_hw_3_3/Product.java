package com.geeks.salkynbek_uulu_almazbek_hw_3_3;

import java.io.Serializable;

public class Product implements Serializable {

    String name,title,color;
    int image,sum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Product(String name, String title, String color, int image, int sum) {
        this.name = name;
        this.title = title;
        this.color = color;
        this.image = image;
        this.sum = sum;
    }
}
