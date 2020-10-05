package com.freeit.exercises;

import java.util.Arrays;

//разделить строчку по 3 

public class Task1 {

        public static void main(String[] args) {
            String str = "1234467868688697";
            int n = 3;
            String[] result = split(str,n);
            System.out.println(Arrays.toString(result));

        }
        public static String[] split(String str, int n){
            int arraySize = (int) Math.ceil(str.length() / (double) n);
            String[] result = new String[arraySize];
            int counter =0;
            for(int i = 0; i< str.length(); i+=n){
                int endIndex = Math.min(str.length(), i + n);
                String substring = str.substring(i, endIndex);
                result[counter] = substring;
                counter++;
            }
            return  result;
        }


    }

