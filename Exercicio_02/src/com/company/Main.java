package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //exercicio 02
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o Valor do salário: ");
        double vlSalario = teclado.nextInt();
        System.out.println("Informe seu RG: ");
        long docRg = teclado.nextInt();

        if (vlSalario <= 20000){
            vlSalario += vlSalario * 0.20;
            System.out.println("Aumento de 20%, salário reajustado é R$ "+vlSalario);
        }else if (vlSalario > 20000 && vlSalario <= 45000){
            vlSalario += vlSalario * 0.10;
            System.out.println("Aumento de 10%, salário reajustado é R$ "+vlSalario);
        }else {
            vlSalario += vlSalario * 0.05;
            System.out.println("Aumento de 05%, salário reajustado é R$ "+vlSalario);
        }
    }
}
