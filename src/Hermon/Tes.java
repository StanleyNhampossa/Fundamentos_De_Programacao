package Hermon;

import Hermon.Func;

import java.util.Scanner;

public class Tes {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Func func1 = new Func("Milton", "De informatica", "Director", "Activo",
                2000);

        Func func2 = new Func("Stanley", "De matemática", "Chefe", "Activo",
                3500);

        func1.aumentarSalario(func1.getSalario());

        System.out.println("Qual é o novo salário");
        double novoSalario = read.nextDouble();

        func1.setSalario(novoSalario);

        func2.demitirFuncionario();

        func1.imprimirDados();

        func2.imprimirDados();

        func2.readmitirFuncionario();

    }

}
