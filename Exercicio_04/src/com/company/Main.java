package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercicio 04
        int a = 0, bc = 0, ab = 0, ac = 0,abc = 0, semJornal=0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("<--------------------->participante "+i+"<--------------------->");
            Scanner teclado = new Scanner(System.in);
            System.out.println("assinantes dos 3 jornais? (s/n):");
            String jornal = teclado.next();

            if (jornal.equals("n") || jornal.equals("N")) {
                Scanner teclado1 = new Scanner(System.in);
                System.out.println("assinante do Diário A e Diário C? (s/n):");
                String jornal1 = teclado.next();

                if  (jornal1.equals("n") || jornal1.equals("N")) {
                    Scanner teclado2 = new Scanner(System.in);
                    System.out.println("assinante do Diário A e Diário B? (s/n):");
                    String jornal2 = teclado.next();

                    if  (jornal2.equals("n") || jornal2.equals("N")) {
                        Scanner teclado3 = new Scanner(System.in);
                        System.out.println("assinante do Diário B e Diário C? (s/n):");
                        String jornal3 = teclado.next();

                        if  (jornal3.equals("n") || jornal3.equals("N")) {
                            Scanner teclado4 = new Scanner(System.in);
                            System.out.println("assinante apenas do Jornal A (s/n):");
                            String jornal4 = teclado.next();

                            if (jornal4.equals("n") || jornal4.equals("N")) {
                                semJornal+=1;
                            } else if (jornal4.equals("s") || jornal4.equals("S")){ a += 1;}
                                   else  {System.out.println("informar 'S' ou 'N'"); i--;}

                        } else if (jornal3.equals("s") || jornal3.equals("S")){ bc += 1;}
                              else  {System.out.println("informar 'S' ou 'N'"); i--;}

                    } else if (jornal2.equals("s") || jornal2.equals("S")){ ab += 1;}
                           else  {System.out.println("informar 'S' ou 'N'"); i--;}

                }else if (jornal1.equals("s") || jornal1.equals("S")){ ac += 1;}
                      else  {System.out.println("informar 'S' ou 'N'"); i--;}

            }else if (jornal.equals("s") || jornal.equals("S")){ abc += 1;}
                  else  {System.out.println("informar 'S' ou 'N'"); i--;}
        }
        System.out.println("<--------------------->Resultado Final<--------------------->");
        System.out.println("Total de assinanttes dos 3 jornais:          "+abc);
        System.out.println("Total de assinanttes do Diário A e Diário C: "+ac);
        System.out.println("Total de assinanttes do Diário A e Diário B: "+ab);
        System.out.println("Total de assinanttes do Diário B e Diário C: "+bc);
        System.out.println("Assinanttes do jornal A:                     " +a);
        System.out.println("Participantes que não assinam nenhum jornal: "+semJornal);
        System.out.println("<----------------------------------------------------------->");
    }
}
