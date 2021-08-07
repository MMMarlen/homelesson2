package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(mmm(generateRandomAge(), 34));
        System.out.println(mmm(generateRandomAge(), 34));
        System.out.println(mmm(generateRandomAge(), 34));
        System.out.println(mmm(generateRandomAge(), 34));
        System.out.println(mmm(generateRandomAge(), 34));

        System.out.println(generateRandomAge());
        System.out.println(generateRandomAge());
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(70);
    }

    public static String mmm(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять1";
        else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять3";
        } else {
            System.out.println(age);
            return "Оставайтесь дома";
        }

    }

}