package com.example.graceliu.bubble;

//package starterhacks;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.ArrayList;

import static com.example.graceliu.bubble.BoyMain.topButton;


public class myProj{
    //functions that will give grace the pic nums
    public static int giveTop(Top myTop)
    {
        return myTop.getNum();
    }
    public static int giveBottom(Bottom myBottom) {
        return myBottom.getNum();
    }
    public static int giveShoe(Shoes myShoes) {
        return myShoes.getNum();
    }
    public static void setBest1n2ndOne(boolean wintG, boolean formG, Top myTop, ArrayList<Top> topsList, Bottom myBottom, ArrayList<Bottom> bottomsList, Shoes myShoe, ArrayList<Shoes> shoeList)
    {
        myTop.setSeason(wintG);
        myBottom.setSeason(wintG);
        myShoe.setSeason(wintG);
        for(int i =0; i < topsList.size(); i++)
        {
            if (formG == topsList.get(i).getFormal())
                myTop.setFormal(formG);//if there is the 2nd preference available, select it
            else if (i== topsList.size() - 1)
                myTop.setFormal(!formG);
        }
        for(int i =0; i < bottomsList.size(); i++)
        {
            if (formG == bottomsList.get(i).getFormal())
                myBottom.setFormal(formG);//if there is the 2nd preference available, select it
            else if (i== topsList.size() - 1)
                myBottom.setFormal(!formG);
        }
        for(int i =0; i < shoeList.size(); i++)
        {
            if (formG == shoeList.get(i).getFormal())
                myShoe.setFormal(formG);//if there is the 2nd preference available, select it
            else if (i== shoeList.size() - 1)
                myShoe.setFormal(!formG);
        }
    }
    public static void setBest3rdOne(int comffG, Top myTop,  ArrayList<Top> topsList, Bottom myBottom, ArrayList<Bottom> bottomsList, Shoes myShoe, ArrayList<Shoes> shoeList)
    {
        for(int i =0; i < topsList.size(); i++)
        {
            if (comffG == topsList.get(i).getComfort())
                myTop.setComfort(comffG);
            else if (i== topsList.size() - 1)
            {
                if (comffG == 1)
                    myTop.setComfort(2);
                else if (comffG == 2)
                    myTop.setComfort(1);
            }
        }
        for(int i =0; i < bottomsList.size(); i++)
        {
            if (comffG == bottomsList.get(i).getComfort())
                myBottom.setComfort(comffG);
            else if (i== bottomsList.size() - 1)
            {
                if (comffG == 1)
                    myBottom.setComfort(2);
                else if (comffG == 2)
                    myBottom.setComfort(1);
            }
        }
        for(int i =0; i < shoeList.size(); i++)
        {
            if (comffG == shoeList.get(i).getComfort())
                myShoe.setComfort(comffG);
            else if (i== shoeList.size() - 1)
            {
                if (comffG == 1)
                    myShoe.setComfort(2);
                else if (comffG == 2)
                    myShoe.setComfort(1);
            }
        }
    }
    public static void setBestLastOne(int collG, Top myTop,  ArrayList<Top> topsList, Bottom myBottom, ArrayList<Bottom> bottomsList, Shoes myShoe, ArrayList<Shoes> shoeList)
    {
        for(int i =0; i < topsList.size(); i++)
        {
            if (collG == topsList.get(i).getColour())
                myTop.setColour(collG);
            else if (i== topsList.size() - 1)
            {
                if (collG == 1)
                    myTop.setColour(2);
                else
                    myTop.setColour(1);
            }
        }
        for(int i =0; i < bottomsList.size(); i++)
        {
            if (collG == bottomsList.get(i).getColour())
                myBottom.setColour(collG);
            else if (i== bottomsList.size() - 1)
            {
                if (collG == 1)
                    myBottom.setColour(2);
                else
                    myBottom.setColour(1);
            }
        }
        for(int i =0; i < shoeList.size(); i++)
        {
            if (collG == shoeList.get(i).getColour())
                myShoe.setColour(collG);
            else if (i== shoeList.size() - 1)
            {
                if (collG == 1)
                    myShoe.setColour(2);
                else
                    myShoe.setColour(1);
            }
        }
    }
    //main
    public static void main(String[] args)
    {
        ArrayList<Top> topsList = new ArrayList<Top>();
        ArrayList<Bottom> bottomsList = new ArrayList<Bottom>();
        ArrayList<Shoes> shoesList = new ArrayList<Shoes>();

        Top hoodie = new Top( 1,true, false, 1, 2);
        Top dress_shirt = new Top( 2,false, true, 0, 1);
        Top tanktop = new Top(3, false, false, 1, 3);
        Top t_shirt = new Top(4, false,false, 1, 2);
        Top sweater = new Top(5,true, false, 1, 4);
        Top light_jacket = new Top(6, true,true, 3,3);

        Bottom sweatpants = new Bottom(1, true, false, 1, 4);
        Bottom jeans = new Bottom(2, true, false, 1, 3);
        Bottom dresspants = new Bottom (3, true, true, 0, 3);
        Bottom shorts = new Bottom(4, false, false,1,4);

        Shoes leathershoes = new Shoes(1, true, true, 0, 3);
        Shoes runners = new Shoes(2,true,false, 1, 2);
        Shoes slippers = new Shoes(3, true, true,2,3);
        Shoes heels = new Shoes(3, false, true, 0, 3);

        topsList.add(hoodie);
        topsList.add(dress_shirt);
        topsList.add(tanktop);
        topsList.add(t_shirt);
        topsList.add(sweater);
        topsList.add(light_jacket);

        bottomsList.add(sweatpants);
        bottomsList.add(jeans);
        bottomsList.add(dresspants);
        bottomsList.add(shorts);

        shoesList.add(leathershoes);
        shoesList.add(runners);
        shoesList.add(slippers);
        shoesList.add(heels);


        Top myTop = new Top();
        Bottom myBottom = new Bottom();
        Shoes myShoe = new Shoes();

        //get data from grace

        //call the setbest functions with graces values
        boolean wintG = topButton.getSeason();
        boolean formG = topButton.getFormal();
        int comffG = topButton.getComfort();
        int collG = topButton.getColour();
        setBest1n2ndOne(wintG,  formG,  myTop, topsList,  myBottom, bottomsList, myShoe,  shoesList);
        setBest3rdOne(comffG, myTop, topsList,  myBottom, bottomsList, myShoe,  shoesList);
        setBestLastOne(collG, myTop, topsList,  myBottom, bottomsList, myShoe,  shoesList);

        giveTop(myTop);
        giveBottom(myBottom);
        giveShoe(myShoe);
    }
}
