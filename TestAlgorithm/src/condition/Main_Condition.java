package condition;

import java.util.Scanner;

public class Main_Condition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int number1 = input.nextInt();
//        System.out.println("Enter number 2 : ");
//        int number2 = input.nextInt();
//        System.out.println("Enter number 3 : ");
//        int number3 = input.nextInt();

        findMax();
        findEvenNumber(number1);
//        findTriangleType(number1,number2,number3);
        findCountCookCakeMin(number1);


    }
    public static void findEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is a Even number");
        } else {
            System.out.println(number + " is a not Even number");
        }

    }
    public static void findMax() {
        int[] Arr = new int[]{7, 6, 9};
        int max = Arr[0];
        for (int j : Arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Number max is : " + max);
    }
    public static void findTriangleType(int number1, int number2, int number3) {
        int number1Up = number1 * number1;
        int number2Up = number2 * number2;
        int number3Up = number3 * number3;

        if (number1 + number2 > number3 && number2 + number3 > number1 && number1 + number3 > number2) {
            if (number1 == number2 || number1 == number3 || number2 == number3) {
                if (number1Up == number2Up + number3Up || number2Up == number1Up + number3Up || number3Up == number1Up + number2Up) {
                    System.out.println("Triangle Vuong Can");
                    return;
                } else if (number1 == number2 && number1 == number3) {
                    System.out.println("Triangle Deu");
                    return;
                } else {
                    System.out.println("Triangle can");
                    return;
                }
            }

            if (number1Up == number2Up + number3Up || number2Up == number1Up + number3Up || number3Up == number1Up + number2Up) {
                System.out.println("Triangle Vuong");
                return;
            }
            if (number1Up > number2Up + number3Up || number2Up > number1Up + number3Up || number3Up > number1Up + number2Up) {
                System.out.println("Triangle Tu");
                return;
            } else {
                System.out.println("Triangle Nhon ");
                return;
            }

        }
        System.out.println("Not a Triangle");


    }
    public static void findCountCookCakeMin(int quantity) {
        int count = 9;
        if (quantity >= 1 && quantity <= 1000) {
            if (quantity % count == 0) {
                System.out.println("Can toi thieu " + quantity / count + " lan ran !");
            } else {
                System.out.println("Can toi thieu " + (quantity / count + 1) + " lan ran !");
            }
        } else {
            System.out.println("So banh phai lon hon 1 va nho hon 1000");
        }

    }


}
