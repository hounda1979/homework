package com.box;

public class Box3 extends Box {
   public Box3(){
       length = 23;
       width = 14;
       height = 13;
   }

    @Override
    public String getBoxType() {
        return "Box3";
    }
}
