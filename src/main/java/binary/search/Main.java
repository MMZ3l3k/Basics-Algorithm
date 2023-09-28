package binary.search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        RandomNumbers randomNumbers = new RandomNumbers();
        int numb = randomNumbers.rollNumb();

     System.out.println(numb);
        System.out.println("Podaj swoją liczbe: ");
        int myNumb = in.nextInt();


        if(myNumb!=numb){
            while (myNumb!=numb) {

                if (numb > myNumb) {
                    System.out.println("Wylosowana liczba jest wieksza: ");
                } else {
                    System.out.println("Wylosowana liczba jest mniejsza : ");
                }
                System.out.println("Podaj swoją liczbe: ");
                myNumb = in.nextInt();
            }if(myNumb==numb){
                System.out.println("Twoja wylosowana liczba to: " + numb);

            }
        }

            else {
                System.out.println("Twoja wylosowana liczba to: " + numb);
            }
        }
       }

