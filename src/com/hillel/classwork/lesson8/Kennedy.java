package com.hillel.classwork.lesson8;

public class Kennedy {
    public static void main(String[] args) {

        int[] values = {40,12,15,48,97,43,2,6,46};
        int index = 0;
        int max = values[index];


        for (int i = 0; i < values.length; i++) {
            if (values[i] > max){
                max =values[i];
                index = i;
            }
        }

        System.out.println(index + " murder " + max);
    }
}
