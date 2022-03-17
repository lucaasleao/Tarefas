package TarefaMod10;

import java.util.Scanner;

public class Notas {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Você deseja ver sua media?");
        String inicio = s.next();

        while (inicio.equals("Sim")){
            System.out.println("Digite a primeira nota: ");
            int resposta1 = s.nextInt();
            System.out.println("Digite a segunda nota: ");
            int resposta2 = s.nextInt();
            System.out.println("Digite a terceira nota: ");
            int resposta3 = s.nextInt();
            System.out.println("Digite a quarta nota: ");
            int resposta4 = s.nextInt();
            int somadasrespostas = resposta1 + resposta2 + resposta3 + resposta4;
            int media = somadasrespostas/4;

            if (media >= 7) {
                System.out.println("Você esta aprovado !");
            } else if (media >= 5) {
                System.out.println("Você esta de recuperação!");
            } else {
                System.out.println("Você esta reprovado !");
            }

            System.out.println("Você deseja rever suas notas?");
            inicio = s.next();

        }

        System.out.println("Obrigado!");
    }

    }
