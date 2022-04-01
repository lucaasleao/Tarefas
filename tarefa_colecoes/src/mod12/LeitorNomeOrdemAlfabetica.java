package mod12;

import java.util.*;

public class LeitorNomeOrdemAlfabetica {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja realizar um cadastro? ");
        String inicio = s.next();


        while (inicio.equals("Sim")){
            System.out.println("Digite três nomes: ");
            String resposta1 = s.next();
            String[] ordenacao = resposta1.split(",");
            List<String> lista = new java.util.ArrayList<>();
            lista.add(ordenacao[0]);
            lista.add(ordenacao[1]);
            lista.add(ordenacao[2]);
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println("Deseja realizar o processo novamente? ");
            inicio = s.next();
            System.out.println("Obrigado(a)!");

            }

        }



    }

