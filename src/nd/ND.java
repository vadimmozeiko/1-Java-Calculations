package nd;

import java.util.Scanner;


public class ND {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Ivesti pirma skaiciu:");
//        int num1 = sc.nextInt();
//        System.out.println("Ivesti antra skaiciu:");
//        int num2 = sc.nextInt();
//        System.out.println("Ivesti trecia skaiciu:");
//        int num3 = sc.nextInt();
//        System.out.println("Ivesti ketvirta skaiciu:");
//        int num4 = sc.nextInt();
//
//        System.out.println("-----------------------");
//        float average = (num1 + num2 + num3 + num4) / 4f;
//        System.out.println("Ivestu skaiciu vidurkis:" + average);
//
//        int firstNumSq = num1 * num1;
//        int secondNumSq = num2 * num2;
//        int thirdNumSq = num3 * num3;
//        int fourthNumSq = num4 * num4;
//        System.out.println("-----------------------");
//        System.out.println("Pirmo skaiciaus kvadratas:" + firstNumSq);
//        System.out.println("Antro skaiciaus kvardatas:" + secondNumSq);
//        System.out.println("Trecio skaiciaus kvadratas:" + thirdNumSq);
//        System.out.println("Ketvirto skaiciaus kvadratas:" + fourthNumSq);
//
//        int firstNumCb = num1 * num1 * num1;
//        int secondNumCb = num2 * num2 * num2;
//        int thirdNumCb = num3 * num3 * num3;
//        int fourthNumCb = num4 * num4 * num4;
//        System.out.println("-----------------------");
//        System.out.println("Pirmo skaiciaus kubas:" + firstNumCb);
//        System.out.println("Antro skaiciaus kubas:" + secondNumCb);
//        System.out.println("Trecio skaiciaus kubas:" + thirdNumCb);
//        System.out.println("Ketvirto skaiciaus kubas:" + fourthNumCb);
//
//        float averageCb = (firstNumCb + secondNumCb + thirdNumCb + fourthNumCb) / 4f;
//        
//        System.out.println("-----------------------");
//        System.out.println("Ivestu skaiciu kubu vidurkis:" + averageCb );
        System.out.println("Amount of number you want to enter:");
        System.out.println();
        int quantity = sc.nextInt();
        System.out.println();
        
        int[] numbers = new int[quantity];
        float sum = 0;
        int numberSquare = 0;
        int numberCube = 0;
        float numSqSum = 0;
        float numCbSum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            System.out.println("Enter " + (i+1) + " number:");
            System.out.println();
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        
        for (int i = 0; i < numbers.length; i++) {
            numberSquare = numbers[i] * numbers[i];
            numSqSum += numberSquare;
            System.out.println();
            System.out.println("Number " + numbers[i] + " square is: " + numberSquare);
            numberCube = numbers[i] * numbers[i] * numbers[i];
            numCbSum += numberCube;
            System.out.println("Number " + numbers[i] + " cube is: " + numberCube);
            System.out.println("-----------------");
        }
        
       float numAverage = sum / numbers.length;
       float numSqAverage = numSqSum / numbers.length; ;
       float numCubeAverage = numCbSum / numbers.length;
       System.out.println("All numbers average is: " + numAverage );
       System.out.println("All numbers square average is: " + numSqAverage);
       System.out.println("All numbers cube average is: " + numCubeAverage);
    }

}
