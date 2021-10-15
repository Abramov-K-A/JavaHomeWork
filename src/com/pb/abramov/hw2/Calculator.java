package com.pb.abramov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        System.out.print ("Введите первое целое число");
        operand1 = scan.nextInt();

        System.out.print ("Введите второе целое число");
        operand2 = scan.nextInt();
//        {
//
//        }
//        symbol = scan.next();
//        {
        System.out.print ("Введите значение");
        //}
        String sign = scan.next(); // + - * /

        switch (sign) {
            case "+":
                System.out.println(+(operand1 + operand2));
                break;

            case "-":
                System.out.println(+(operand1 - operand2));
                break;

            case "*":
                System.out.println(+(operand1 * operand2));
                break;

            case "/":
                if (operand2==0) {
                System.out.println("Я ТЕБЯ НА НОЛЬ ПОДЕЛЮ!");}
                else if (operand2>0) {
                System.out.println(+(operand1 / operand2));
            }
            break;

            default:
                System.out.println("Неверная операция");
            }


        }


    }
