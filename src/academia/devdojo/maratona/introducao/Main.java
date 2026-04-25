package academia.devdojo.maratona.introducao;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    static void main(String[] args) {

        // && (AND) || (or) !

        int idade = 0;
        boolean EntradaValida = false;
        while (!EntradaValida) {
            System.out.print("SUA IDADE: ");
            try {
                idade = ler.nextInt();
                EntradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida, Tente um número inteiro!");
                ler.nextLine();
            }
        }
        if (idade >= 2 && idade <= 13) {

            System.out.println("Você faz parte da geração alfa! 👼");
        } else if (idade >= 14 && idade <= 29) {
            System.out.println("Você faz parte da geração Z!👦");
        } else if (idade >= 30 && idade <= 45) {
            System.out.println("Você faz parte da geração Millennials(Geração Y)! 🧑");
        } else if (idade >= 46 && idade <= 61) {
            System.out.println("Você faz parte da geração X! 👨‍🦳");
        } else if (idade > 61){
            System.out.println("Você faz parte da geração Baby boomers ou inferiores! 🧓👴");
        }



ler.close();

        }

    }
