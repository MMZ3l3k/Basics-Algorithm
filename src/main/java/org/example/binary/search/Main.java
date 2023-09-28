package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        RandomNumbers randomNumbers = new RandomNumbers();
        int numb = randomNumbers.rollNumb();

     System.out.println(numb);

        System.out.println("Podaj swoją liczbe: ");
        int myNumb = in.nextInt();

       // System.out.println(myNumb);

        if(myNumb==numb){
            System.out.println("Twoja wylosowana liczba to: " + numb);
        }else {
            while (myNumb!=numb) {

                if(numb>myNumb) {
                    System.out.println("Wylosowana liczba jest wieksza: ");
                    System.out.println("Podaj swoją liczbe: ");
                    myNumb = in.nextInt();
                }else {
                    System.out.println("Wylosowana liczba jest mniejsza : ");
                    System.out.println("Podaj swoją liczbe: ");
                    myNumb = in.nextInt();
                }
            }
        }
        System.out.println("Twoja wylosowana liczba to: " + numb);
       }
    }
