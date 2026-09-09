package com.practise.pages;

import java.util.Arrays;

public class Sentence_Reversal {

    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps over a lazy dog";
        //Expected output : man my is abhay

       String[] array= sentence.split(" ");

     //   System.out.println(com.practise.pages.Arrays.toString(array));
         int left=0;
         int right=array.length-1;

         while(left<right){
             String temp = array[left];
             array[left]=array[right];
             array[right]=temp;
             left++ ;
             right-- ;
         }
      String result=  String.join("/", array);
        System.out.println(result);




    }
}
