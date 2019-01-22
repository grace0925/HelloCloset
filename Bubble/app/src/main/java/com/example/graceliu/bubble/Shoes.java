package com.example.graceliu.bubble;

//package starterhacks;


public class Shoes {
    private int number;
    private boolean winter; //true for winter
    private boolean formal;//true for formal
    private int comfortLevel;//least =1, most = 3
    private int colour; // red, o, y, g, b, v, b

    //default constructor
    public Shoes()
    {
        number = 1;
        winter = true;
        formal = true;
        comfortLevel = 1;
        colour = 1;
    }

    public Shoes(int num, boolean seas, boolean form, int comf, int col)
    {
        number = num;
        winter = seas;
        formal = form;
        comfortLevel = comf;
        colour = col;
    }
    //setters
    public void setSeason(boolean seas){
        winter = seas;
    }
    public void setFormal(boolean form)
    {
        formal = form;
    }
    public void setComfort(int comf)
    {
        comfortLevel = comf;
    }
    public void setColour(int col){
        colour = col;
    }

    //getters
    public int getNum()
    {
        return number;
    }
    public boolean getSeason()
    {
        return winter;
    }
    public boolean getFormal()
    {
        return formal;
    }
    public int getComfort()
    {
        return comfortLevel;
    }
    public int getColour(){
        return colour;
    }
}
