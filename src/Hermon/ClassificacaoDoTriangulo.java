package Hermon;

import java.util.Scanner;

public class ClassificacaoDoTriangulo {

    public static boolean isItATriangle(int lado1, int lado2, int lado3){

        if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o primeiro lado do triângulo");
        int lado1 = read.nextInt();

        System.out.println("Introduza o segundo lado do triângulo");
        int lado2 = read.nextInt();

        System.out.println("Introduza o terceiro lado do triângulo");
        int lado3 = read.nextInt();

        if(isItATriangle(lado1, lado2, lado3) == false)
            System.out.println("Os lados não condizem a de um triângulo");

        else {
            if(lado1 == lado2 && lado2 == lado3)
                System.out.println("O triângulo é equilátero");

            else
                if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
                    System.out.println("O triângulo é escaleno");

                else
                    System.out.println("O triângulo é isosceles");
        }
    }

}
