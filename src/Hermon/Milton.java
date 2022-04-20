package Hermon;

import java.util.Scanner;

public class Milton {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o tamanho");
        int tamanho = read.nextInt();

        String [] a = new String [tamanho];
        System.out.println("Digite um nome");


        for(int i = 0; i < tamanho; i++){
            a[i] = read.next();

        }

        for (String x : a){
            System.out.println(x);

        }

    }

}