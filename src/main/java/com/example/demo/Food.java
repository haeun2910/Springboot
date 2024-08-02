package com.example.demo;

public class Food {
    private String foodName;
    private String foodDescription;

    public Food(String foodName, String foodDescription) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}
