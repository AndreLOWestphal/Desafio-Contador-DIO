package edu.contador;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite um segundo valor: ");
        int valor2 = scan.nextInt();

        try {
            contar(valor1, valor2);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        scan.close();
    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException{ 
        if(valor1 > valor2){
           System.err.println("O segundo parâmetro deve ser maior que o primeiro."); 
        }
            int contagem = valor2 - valor1;
            for(int x = 0; x < contagem;x++){
                System.out.println("Imprimindo o número " + (x+1));
            }
    }

}
