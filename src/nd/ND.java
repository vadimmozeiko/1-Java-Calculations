package nd;

import java.util.Scanner;


public class ND {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
