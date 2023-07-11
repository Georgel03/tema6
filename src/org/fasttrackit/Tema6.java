package org.fasttrackit;

import java.util.Random;
import java.util.Scanner;

public class Tema6 {

    static Scanner console = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int intArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayGrtThan[] = new int[intArray.length];
        int count = 0, intSum = 0;

        //Ex 1
        intSum = sumInt(intArray);
        System.out.println("Suma numerelor intreg este: " + intSum);
        System.out.println("----------------------------------------");

        //Ex 2
        count = countImp(intArray);
        System.out.println("Numaru de elemente impare sunt: " + count);
        System.out.println("-----------------------------------------");

        //Ex 3
        int number;
        System.out.print("Give a number: ");
        number = console.nextInt();
        arrayGrtThan = returnGrtThan(intArray, number);
        System.out.println("The new array is: ");
        for (int i = 0; i < arrayGrtThan.length; i++) {
            System.out.print(arrayGrtThan[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------");


        //Ex 4
        Donation(20000, 10);
        System.out.println("----------------------------------------");

        //Ex 5
        printStrings("George are mere. Alexis merge la cumparaturi. Casi, Ana si Andreea merg in oras..");
    }

    public static int sumInt(int array[]) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int countImp(int array[]) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count ++;
            }
        }

        return count;
    }

    public static int[] returnGrtThan(int array[], int number) {

        int newArray[] = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                newArray[j] = array[i];
                j++;
            }
        }

        return newArray;
    }

    public static void Donation(int targetDon, int maxDon) {

        int sumDon = 0, donations = 0, count = 0;

        donations = random.nextInt(0, targetDon);
        sumDon += donations;
        System.out.println(String.format("Donation #%d is %d", count, donations));
        count ++;
        while (sumDon < targetDon && count <= maxDon) {
            if (count == maxDon) {
                return;
            }
            donations += random.nextInt(0, targetDon);
            sumDon += donations;
            System.out.println(String.format("Donation #%d is %d", count, donations));
            count ++;
        }

        System.out.println("Congratulations! We reached the target:)");

    }

    public static void printStrings(String sentence) {

        String[] str = sentence.split("\\.", 0);
        for (String myStr : str) {
            System.out.println(myStr);
        }
    }


}
