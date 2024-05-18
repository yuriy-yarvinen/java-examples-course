package com.yygames.lib;

public class MyClass {
    public static void main(String[] args) {
        /// java output
        System.out.print("Hello World \n");

        int age1 = 25;

        System.out.print("Hello World " + age1);

        // byte: -128 --> 127
        byte x = 100;

        // short -32,768 -> 32,767
        short y = 7777;

        // int: -2147483648 --> 2147483647
        int z = 88776655;

        // Long: -9223372036854775808 --> 9223372036854775807
        Long w = 1122334455667788L;

        // float: you should add "F" or "f" at the end of the number
        float pi = 3.14F;

        // double: store decimal numbers with higher precision
        double pi2 = 3.14159;

        // boolean: true or false
        boolean isRaining = true;
        boolean allCoinsCollected = false;


        // char: holds only one single number, symbol or letter
        char myChar = 'A';
        char myNumber = '7';
        char mySymbol = '$';
        char newLine = '\n';
        char tab = '\t';


        // Arithmetic Operators: + *1%
        System.out.println(10 % 5);

        // Comparison Operators: = > < >= <=
        int xx = 10;
        System.out.println(xx != 9999);


        // Logical Operators: && || !
        boolean isSunny = true;
        boolean needUmbrella = false;
        boolean shouldGoOutside = isSunny && !needUmbrella;
        boolean canPlayGames = isSunny || needUmbrella;


        // Printing Strings: System.out.println(sayHello);

        // Concatenating Strings: "+"
        String myFriends = "My Friends";
        String sayHello = "My Friends";
        System.out.println(sayHello + myFriends);
        // String Length:
        int length = myFriends.length();
        System.out.println("The length is: " + length);


        // if-else statement
        int age = 40;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age == 60) {
            System.out.println("Aged Person");
        } else {
            System.out.println("You are a minor");
        }


        // Switch Statement:
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown");
                break;
        }


        int number = 1;
        while (number <= 5) {
            // Code to be executed repeatedly
            // as long as the condition is true
            System.out.println(number);
            number++;
        }

        for (int i = 0; i < 10; i++) {
            if(i == 3){
                continue;
            }
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        //dataType[] arrayName = new dataType[size];
        int[] arrInt = new int[5];
        arrInt[0] = 1;
        arrInt[1] = 20;
        arrInt[3] = 20;

        for(int num: arrInt){
            System.out.println(num);
        }

        int [][] myMatrix = new int[3][3];
        myMatrix[0][0] = 1;
        myMatrix[0][1] = 1;

        int [][] myMatrix2 = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };
    }
}