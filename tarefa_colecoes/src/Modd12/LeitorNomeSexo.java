package Modd12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorNomeSexo {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja realizar um cadastro? ");
        String inicio = s.next();
        while (inicio.equals("Sim")) {
            System.out.println("Digite seu nome e sexo? ");
            String resposta1 = s.next();
            String[] ordenacao = resposta1.split("-");
            if (ordenacao[1].equals("Feminino")) {
                List<String> listaFe = new ArrayList<>();
                listaFe.add(resposta1);
                System.out.println(listaFe);
            } else if (ordenacao[1].equals("Masculino")) {
                List<String> listaMa = new ArrayList<>();
                listaMa.add(resposta1);
                System.out.println(listaMa);
            } else {
                System.out.println("Obrigado(a)!");
            }
            System.out.println("Deseja realizar um novo cadastro? ");
            inicio = s.next();
        }
        System.out.println("Obrigado(a)!");
    }
}

