package com.example.bookstoremanagement.service.Iplm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C {
   double price;

   public static void main(String[] args) {
      String a = "XVII";
      String arr[] =a.split("");
      List<Integer> arrList=new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
         switch (arr[i]){
            case "X":
               arrList.add(10);
               break;
            case "V":
               arrList.add(5);
               break;
            case "I":
               arrList.add(1);
               break;
            default:
               System.out.println("không hợp lệ");
         }
      }
      System.out.println(arrList);
   }
}


