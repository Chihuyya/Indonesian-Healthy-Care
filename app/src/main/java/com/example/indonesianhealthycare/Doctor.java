package com.example.indonesianhealthycare;

public class Doctor {
    private String name;
    private String specialist;
    private String rating;
    private int imageResId;

    public Doctor(String name, String specialist, String rating, int imageResId) {
        this.name = name;
        this.specialist = specialist;
        this.rating = rating;
        this.imageResId = imageResId;
    }

    public String getName() { return name; }
    public String getSpecialist() { return specialist; }
    public String getRating() { return rating; }
    public int getImageResId() { return imageResId; }
}