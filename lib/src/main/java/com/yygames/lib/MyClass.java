package com.yygames.lib;

public class MyClass {
    public static void main(String[] args){
        /// java output
        System.out.print("Hello World \n");

        int age = 25;

        System.out.print("Hello World " + age);

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
        char tab = '\t' ;



        // Arithmetic Operators: + *1%
        System.out.println(10%5);

        // Comparison Operators: = > < >= <=
        int xx = 10;
        System.out.println(xx != 9999);


        // Logical Operators: && || !
        boolean isSunny = true;
        boolean needUmbrella = false;
        boolean shouldGoOutside = isSunny && !needUmbrella;
        boolean canPlayGames = isSunny || needUmbrella;

    }
}