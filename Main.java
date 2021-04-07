package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //variables
        int count = 0;
        int userInt = 0;
        int userSearch = 0;
        int[] integers = new int[10];
        int[] integerList;

        //scanner, merge sorter, binary searcher
        Scanner sc = new Scanner(System.in);
        MergeSort ms = new MergeSort();
        BinarySearch bs = new BinarySearch();

        //user input integers
        System.out.println("\nEnter Integers, -999 to Stop.");

        while (count < 10 && userInt != -999) {
            userInt = sc.nextInt();

            if (userInt != -999) {
                integers[count] = userInt;
                count++;
            }
        }

        //creating array of proper size with merge sort
        integerList = new int[count];
        for (int i = 0; i < count; i++) {
            integerList[i] = integers[i];
        }
        ms.sort(integerList, 0, count-1);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(integerList));

        //searching for specific number
        while (userSearch != -999) {
            System.out.print("\nSearch for Integer, -999 to Stop: ");
            userSearch = sc.nextInt();

            int index = bs.binarySearch(integerList, 0, count-1, userSearch);

            if (index == -1) {
                System.out.println("Not in Array.");
            }
            else {
                System.out.println("Found in Array at: Index " + index);
            }
        }
    }
}
