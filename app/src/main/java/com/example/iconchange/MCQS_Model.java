package com.example.iconchange;

public class MCQS_Model
{
    int img;
    String title1;
    String title2;
    public MCQS_Model(int img,String title1,String title2)
    {
        this.img = img;
        this.title1 = title1;
        this.title2 = title2;
    }

    public int getImg()
    {
        return img;
    }

    public String getTitle1()
    {
        return title1;
    }

    public String getTitle2()
    {
        return title2;
    }
}
