package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o Valor do Produto: ");
        float vlProduto = teclado.nextInt();
        System.out.println("Informe o numero da Fabrica: ");
        int fabrica = teclado.nextInt();
        double vlProdFinal = 0;

        switch (fabrica) {
            case 1:
                vlProdFinal = (vlProduto + (vlProduto * 0.07)) + ((vlProduto + (vlProduto * 0.07)) * 0.25);
                break;
            case 2:
                vlProdFinal = (vlProduto + (vlProduto * 0.15)) + ((vlProduto + (vlProduto * 0.15)) * 0.25);
                break;
            case 3:
                vlProdFinal = (vlProduto + (vlProduto * 0.22)) + ((vlProduto + (vlProduto * 0.22)) * 0.25);
                break;
            default:
                System.out.println("Fabrica não econtrada");
        }

        System.out.println("valor do produto final é R$ " + vlProdFinal);
    }
}
