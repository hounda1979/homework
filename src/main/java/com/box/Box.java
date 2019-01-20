package com.box;

import java.util.ArrayList;


public abstract class Box {
    float length;
    float width;
    float height;

    public boolean validate(ArrayList<Float> sizeDate){
       boolean b =  validate(sizeDate.get(0),sizeDate.get(1),sizeDate.get(2));
       return b;
    }
    public boolean validate(float length,float width,float height){
        return length <= this.length && width <= this.width && height <= this.height;

    }
    public abstract String getBoxType();



}
