package array;

import java.util.Arrays;

public class Main_Array {
    public static void main(String[] args) {
//  ex14
//        findMax2InArray();
//        findMax2Line();

//        ex16
//        checkArrayElementUpOrNo();
//          checkElementArray1ContainsArray2();
//        System.out.println(findTubeCatLinhHaDong());


//  ex17
//        countElementToWrite();
//        findElementOnlyOnce();

//  ex18
//        findCommonElementIn2Array();
//        findLongestElementAscendingList();
//        checkElement1toNInArray(9);
//        checkElement1ToNInArray2(8);


//  ex19
//         System.out.println(findMultiplicationMaxABInArray());
//        findLargestRangeInArray();
//        findKElementMax(4);
//
//        ex20
//        findCoupleElement(12);
//        arrangeEvenNumber();

//        ex21
//        System.out.println(getSumElementInArray(6));
//        System.out.println(getFactorialOfNumber(4));
//        System.out.println(findGCD(7,20));
//
//        ex22
        System.out.println(getFibonacci(10));





    }
    public static void findMax2InArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int max1 = array[0];
        int max2 = 0;
        for (int j : array) {
            if (j > max1) {
                max1 = j;
            }
        }
        for (int j : array) {
            if (j > max2 && max2 < max1) {
                max2 = j;
            }
        }
    }
    public static void findMax2Line() {
        int[][] array2line = new int[][]{{1, 4, 5, 6, 7}, {8, 9, 10, 4}, {6, 6, 4, 3}};
        int max = array2line[0][0];
        for (int[] ints : array2line) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println(max);
    }
    public static void findElementOnlyOnce() {
        int[] array1 = new int[]{7, 3, 6, 5, 5, 2};
        int count = 0;
        for (int j : array1) {
            for (int k : array1) {
                if (j == k) {
                    count++;
                }
                if (count == 2) {
                    count = 0;
                    break;
                }
            }
            if (count == 1) {
                System.out.println(j);
                count = 0;
            }
        }
    }
    public static void countElementToWrite() {
        int[] array = new int[]{4, 5, 4, 6, 7, 5, 8};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (i > j) {
                        check = true;
                    }
                }
            }
            if (!check) {
                System.out.println("Number " + array[i] + " Xuat hien " + count + " lan");
            }
            count = 0;
        }
    }
    public static void findCommonElementIn2Array(){
        int[] array1 = new int[]{ 1,2,3,4,5,6,7};
        int[] array2 = new int[]{ 1,9,3,0,5,9,7};
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    System.out.println(k);
                }
            }

        }


    }
    public static void findLongestElementAscendingList(){
        int[] array = new int[]{6,5,1,2,3,4,2,6,3,4,5,7,9};
        int countIndex = 0;
        int elementLength = 0;
        int elementLengthMax = 0;
        for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    elementLength++;
                }else {
                    if (elementLength > elementLengthMax){
                        elementLengthMax = elementLength;
                        countIndex = i - elementLengthMax;
                    }
                    elementLength = 1;
                }
        }
        if (elementLength > elementLengthMax){
            elementLengthMax = elementLength;
            countIndex = array.length - elementLengthMax;
        }

        for (int i = countIndex; i < countIndex +elementLengthMax ; i++) {
            System.out.println(array[i]);
        }
    }

    public static void checkArrayElementUpOrNo(){
        int[] array = new int[]{1,2,5,6,8,9};
        int count =1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]){
                count++;
            }
        }
        if (count == array.length){
            System.out.println("Oke");
        }else {
            System.out.println("Not Oke");
        }
    }

    public static void checkElementArray1ContainsArray2(){
        int[] arr = {8,4, 2, 1, 3, 5};
        int[] arr2 = {4, 2, 1, 3, 5,6,8,7,10};
        int count =0;
        for (int k : arr) {
            for (int i : arr2) {
                if (k == i) {
                    count++;
                    break;
                }
            }
        }
        if (count == arr.length){
            System.out.println("OKe");
        }
        else {
            System.out.println("Not Oke");
        }
    }

    public static int findTubeCatLinhHaDong() {
        int[] ducCompany = new int[]{4,2,2, 5, 6, 7, 7, 8};
        int[] koreaCompany = new int[]{6, 6, 2, 5,2,9,2};
        int count = 0;
        for (int k : koreaCompany) {
            for (int j = 0; j < ducCompany.length; j++) {
                if (k == ducCompany[j]) {
                    count++;
                    ducCompany[j] = 0;
                }
            }
        }
        return count;
    }

    public static void checkElement1toNInArray(int number){
        int[] array = new int[]{1,3,2,5,4,2,1,6,7,8,9,10,11,12};
        int[] array2 = new int[number];
        int index = 0;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            for (int k : array) {
                if (i == k) {
                    array2[index] = i;
                    index++;
                    count++;
                    break;
                }
            }
        }
        if (count == number){
            System.out.println("Oke");
        }else {
            System.out.println("False");
        }

    }

    public static void checkElement1ToNInArray2(int number){
        int[] arr = {4, 2, 1, 3, 5,6,8,7,10};
        boolean[] isContains = new boolean[number + 1]; // Mảng để đánh dấu sự hiện diện của các số từ 1 đến n
        // Đánh dấu các số trong mảng arr
        for (int j : arr) {
            if (j <= number) {
                isContains[j] = true;
            }
        }

        boolean checkIsContains = true;
        for (int i = 1; i <= number; i++) {
            if (!isContains[i]) {
                checkIsContains = false;
                break; // Nếu có số nào thiếu, thoát khỏi vòng lặp
            }
        }

        if (checkIsContains) {
            System.out.println("Mảng chứa tất cả các số từ 1 đến " + number);
        } else {
            System.out.println("Mảng không chứa tất cả các số từ 1 đến " + number);
        }
    }

    public static String findMultiplicationMaxABInArray(){
        int[] array = new int[]{1,2,3,4,5,6,7};
        int multiplicationMax = array[0]*array[0];
        int maxNumber1 = 0;
        int maxNumber2 = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i!=j){
                    if (array[i]*array[j] > multiplicationMax){
                        maxNumber1 = array[i];
                        maxNumber2 = array[j];
                    }
                }
            }

        }return "Result : " + maxNumber1 + " and " + maxNumber2;
    }

    public static void findLargestRangeInArray(){
        int[] array = new int[] {1,2,3,4,1,5,6,8,11};
        int sumCheck = array[0];
        int sumMax = 0;
        int countIndex = 0;
        int countElement = 1;
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i] < array[i+1]){
                countElement++;
                sumCheck += array[i+1];
            }else {
                if (sumCheck > sumMax){
                    sumMax = sumCheck;
                    sumCheck = 0;
                    countIndex = i - countElement;
                    countElement = 0;
                }
            }
        }
        if (sumCheck > sumMax){
            sumMax = sumCheck;
            countIndex = array.length - countElement;
        }
        for (int i = countIndex; i < countIndex+countElement; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Total = "+ sumMax);
    }

    public static void findKElementMax(int number){
        int[] array = new int[] {1,2,11,3,4,1,5,6,8,8,11};
        boolean check;
        do{
            check = false;
            for (int i = 0; i <array.length -1 ; i++) {
                if (array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    check = true;
                }
            }
        }while (check);
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < number; i++) {
            if (array[i] > array[i+1]){
                System.out.println(array[i]);
            }
            else {
                number++;
            }
        }

    }

    public static void findCoupleElement(int number){
        int[] array = new int[] {4,8,8,8,6,5,7,8};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                    if (array[i]+array[j] == number){
                        System.out.println(array[i] +" And " + array[j]);
                        break;
                    }

            }
        }
    }

    public static void arrangeEvenNumber(){
        int[] array = new int[] {1,8,3,3,1,8,6,5,7,8};
        boolean check;
        do { check =false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]%2 != 0 && array[i+1]%2 == 0){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    check = true;
                }
            }

        }while (check);

        System.out.println(Arrays.toString(array));
    }

    public static int getSumElementInArray(int number){
        if (number <= 0) {
            return 0;
        }else {
            return number + getSumElementInArray(number-1);
        }

    }

    public static int getFactorialOfNumber(int number){
        if (number == 0) {
            return 1;
        }else {
            return number * getSumElementInArray(number -1 );
        }
    }

    public static int findGCD(int number1 , int number2){
        if (number2 == 0){
            return number1;
        }else {
            return findGCD(number2, number1%number2);
        }
    }

    public static int getFibonacci(int number){
        if (number <= 1){
            return number;
        }else {
            return getFibonacci((number -1 )) + getFibonacci((number -2 ));
        }
    }
















}


