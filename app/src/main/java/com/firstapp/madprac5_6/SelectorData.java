package com.firstapp.madprac5_6;

public class SelectorData {

    private String imageName;
    private String imageLabel;

    // Constructor
    public SelectorData(String pImageName, String pImageLabel){
        this.imageName = pImageName;
        this.imageLabel = pImageLabel;
    }

    // Getters
    public String getImageName(){return imageName;}
    public String getImageLabel(){return imageLabel;}

    // Setters
    public void setImageName(String pImageName){this.imageName = pImageName;}
    public void setImageLabel(String pImageLabel){this.imageLabel = pImageLabel;}
}
