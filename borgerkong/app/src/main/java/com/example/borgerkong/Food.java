package com.example.borgerkong;

public class Food {
    // unique identifier of the food
    private int foodID;

    private String foodName;
    private int price;
    private String summary;

    //variable that keeps track of amount of food items ordered
    private int numberOrdered;

    private int imageDrawableId;


    public Food(int foodID, String foodName, int price, String summary,int numberOrdered, int imageDrawableId) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
        this.summary = summary;
        this.numberOrdered = numberOrdered;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return price;
    }

    public void setFoodPrice(int price) {
        this.price = price;
    }

    public String getFoodSummary() {
        return summary;
    }

    public void setFoodSummary(String summary) {
        this.summary = summary;
    }

    public int getNumberOrdered() {
        return numberOrdered;
    }

    public void setNumberOrdered(int numberOrdered) {
        this.numberOrdered = numberOrdered;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}

