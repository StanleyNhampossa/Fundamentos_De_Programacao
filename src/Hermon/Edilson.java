package Hermon;

import fichanr4.Ex3_Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class Edilson {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<Ex3_Conta> cliente = new ArrayList<>();

        System.out.println("Quantos deseja registar");
        int numeroARegistar = ler.nextInt();


        for(int i = 0; i < numeroARegistar; i++) {

            System.out.println("Introduza o nome do titular da conta");
            String titular = ler.next();

            System.out.println("Introduza o número da conta");
            int numeroDaConta = ler.nextInt();

            cliente.add(i, new Ex3_Conta(titular, numeroDaConta, true));


        }


        for(int i = 0; i < cliente.toArray().length; i++ ){
            System.out.println(cliente.stream().sorted());
        }
            

        
    }

}
