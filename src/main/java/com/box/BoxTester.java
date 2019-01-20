package com.box;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Box box3 = new Box3();
        Box box5 = new Box5();

        String[] sizeArray = {"length","width","height"};
        ArrayList<Float> typeInSize = new ArrayList();
        //取得箱子的長寛長尺寸
        for (int i = 0; i < sizeArray.length; i++) {
            float aFloat =0.0f;
            System.out.println(" Please enter object's "+ sizeArray[i]);
            try {
                 aFloat = scanner.nextFloat();
            }catch (Exception e){
                System.out.println("請輸入0-9數字 謝謝 , 如要離開請輸入-1");
                break;
            }
            if(aFloat == -1){
                break;
            }else {
                typeInSize.add(aFloat);
            }
        }

        if(box5.validate(typeInSize)){
            if (box3.validate(typeInSize)){
                System.out.println(box3.getBoxType());
            }else {
                System.out.println(box5.getBoxType());
            }

        }else {
            System.out.println("sorry 輸入尺寸和Box3 & Box5 不符合");
        }






    }
}
