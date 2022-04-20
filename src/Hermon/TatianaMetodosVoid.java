package Hermon;

import java.util.Scanner;

public class TatianaMetodosVoid {

    public static void printData(String nome, int idade, String morada) {
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua morada é " + morada);
        System.out.println("Sua idade é " + idade);
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o seu nome");
        String name = read.next();

        System.out.println("Introduza a sua idade");
        int age = read.nextInt();

        System.out.println("Introduza a sua morada");
        String address = read.next();

        printData(name, age, address);

    }

}
