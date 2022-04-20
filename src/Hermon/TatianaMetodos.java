package Hermon;

import java.util.Scanner;

public class TatianaMetodos {

    public static int calculateFactorial(int numberToCalculateFactorial){
        int factorial = 1;

        for(int i = 1; i <= numberToCalculateFactorial; i++){
            factorial = factorial * i;
        }
        return factorial;

    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza um número");
        int number = read.nextInt();



        System.out.println("O valor do factorial é " + calculateFactorial(number));



    }

}
