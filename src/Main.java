import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any number : ");
//        int number = scanner.nextInt();

        //level 1 :
//        findEvenNumber(number);
//
        //level 2 :
//        findMax();

        //lv3 :
//        System.out.println("Enter number 1 : ");
//        int number1 = input.nextInt();
//        System.out.println("Enter number 2 : ");
//        int number2 = input.nextInt();
//        System.out.println("Enter number 3 : ");
//        int number3 = input.nextInt();
//        findTriangleType(number1,number2,number3);

//        findCount(number1);


        //so chinh phuong
//        showSoChinhPhuong(number1,number2);

        //binh phuong tong
//        System.out.println(getTongBinhPhuong(number1,number2));

        //get S
//        System.out.println(getS(number1));


//        getCommonMultiplesMax(number1,number2);


//        getListNumber();
//        riceCake();

//        getMoney();
//        getMoneyTotalMin();


//        getCommonMultiplesMax(number1,number2);
//
//        System.out.println(getCommonDivisor(number1,number2));

//        changeIndexABC();

//        runReadNumber();

//        findMax2Line();

//        findElement();
//
//        countElement();



//        int[] groupMember = new int[]{2, 3, 4, 4, 2, 1, 3, 1, 2};
//        System.out.println(riceCake(groupMember));

        runReadNumber();


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

    public static void showSoChinhPhuong(int number1, int number2) {
        int check = 0;
        System.out.println("List so nguyen tu " + number1 + " Toi " + number2 + " la :");

        for (int i = number1; i <= number2; i++) {
            double canBac2 = Math.pow(i, 0.5);
            check = findSoNguyen(canBac2);
            if (check == 1) {
                System.out.println(i);
            }
        }
    }

    public static int findSoNguyen(double a) {
        int flag = 1;
        if (Math.ceil(a) != Math.floor(a)) {
            flag = 0;
        }
        return flag;
    }

    public static int getTongBinhPhuong(int nb1, int nb2) {
        int sum = 0;
        for (int i = nb1; i <= nb2; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double getS(int nb1) {
        double S = (double) 1 / 2;
        for (int i = 1; i <= nb1; i++) {

            S += (double) (2 * i + 1) / (2 * i + 2);
        }
        return (double) Math.round(S * 100) / 100;
    }

    public static double getSum2(int number) {
        int sum = 100;
        for (int i = 0; i < number; i++) {
            sum += i * (i + 1) / (i + 1) * (i + 2);
        }
        return sum;
    }

    public static int getDivisorMin(int number) {
        int divisonMax = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                if (i > divisonMax) {
                    divisonMax = i;
                }
            }
        }
        return divisonMax;
    }

    public static void getMultiplesMin(int number) {
        System.out.println(number * 2);
    }

    public static int getCommonDivisor(int number1, int number2) {
        int min = 0;
        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }

        for (int i = min; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void getCommonMultiplesMax(int number1, int number2) {
        System.out.println((number1 * number2) / getCommonDivisor(number1, number2));

    }

    public static void getListNumber() {
        int number1 = 4;
        int number2 = 6;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number1; j++) {
                for (int k = 0; k < number1; k++) {
                    if (i + j + k == number2) {
                        System.out.println("A = " + i + " B = " + j + " C = " + k);
                    }
                }
            }
        }

    }

    public static void getCoupleGirlBoy() {
        int girl = 50;
        int boy = 81;
        System.out.println("Total Couple Girl - Boy is : " + girl);
        System.out.println("Couple Boy - Boy is : " + (boy - girl) / 2);
        System.out.println("Boy FA is :" + (boy - girl) % 2);
    }

    public static int riceCake(int[] member) {
        int sum = 0;
        int count = 0;
        boolean check = false;
        for (int j : member) {
            if (j == 3){
                count++;
            }
            if (j == 1){
                check = true;
            }
            sum = sum + j;
        }
        if (!check) sum += count;

        return (sum % 4 == 0) ? sum / 4 : sum / 4 + 1;

    }

    public static void getMoney() {
        int money1 = 1;
        int money2 = 2;
        int money3 = 5;
        int count = 0;
        int target = 20;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 8; j++) {
                for (int k = 1; k < 14; k++) {
                    if (i * money3 + j * money2 + k * money1 == target) {
                        count++;
                        System.out.println("1k :" + k + " 2k :" + j + " 5k :" + i);
                    }
                }
            }
        }
        System.out.println("So lan : " + count);
    }

    public static void getMoneyTotalMin() {
        int money = 1;
        int money2 = 2;
        int money3 = 5;
        int count = 0;
        int target = 20;
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 8; j++) {
                for (int k = 1; k < 4; k++) {
                    if (i * money + j * money2 + k * money3 == target) {
                        System.out.println("1k :" + i + " 2k :" + j + " 5k :" + k);
                        return;
                    }
                }
            }
        }
    }

    public static void changeIndexABC() {
        int[] Array = new int[]{3, 3, 3};
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k != j && k != i && i != j) {
                        boolean flag = false;
                        String number = "" + Array[i] + Array[j] + Array[k];
                        if (arr.isEmpty()) {
                            arr.add(number);
                        } else {
                            for (String s : arr) {
                                if (number.equals(s)) {
                                    flag = true;
                                    break;
                                }
                            }
                            if (!flag) {
                                arr.add(number);
                            }
                        }
                    }

                }
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }


    public static String getStringReadNumber(int number) {
        switch (number) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return null;
        }
    }

    public static void runReadNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = input.nextInt();
        String result = "";
        int unit = number % 10;
        int chuc = (number / 10) % 10;
        int tram = number / 100;
        if (tram != 0) {
            result = result + getStringReadNumber(tram);
            result = result + " Trăm ";
        }
        if (chuc != 0) {
            if (chuc == 1) {
                result = result + " Mười ";
            } else {
                result = result + getStringReadNumber(chuc);
                result = result + " Mươi ";
            }
        }
        if (chuc == 0){
            result = result + "Lẻ ";
        }
        if (unit != 0 && unit != 1) {
            result = result + getStringReadNumber(unit);
        }
        if (chuc > 1 && unit == 1) {
            result = result + "Mốt ";
        }
        if (chuc <= 1 && unit == 1) {
            result = result + "Một ";
        }
        if (number == 0) {
            result = result + "zero";
        }


        System.out.println("Số bạn nhập đọc là : " + result);
    }

    public static void findMax2Array() {
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

    public static void findElement() {
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


    public static void countElement() {
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


}











