import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primeiro {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Voce deseja realizar um cadastro? ");
        String inicio = s.next();
        while (inicio.equals("Sim")){
            System.out.println("Qual é o seu nome? ");
            String resposta1 = s.next();
            System.out.println("Qual é o seu sexo? ");
            String resposta2 = s.next();

            if(resposta2.equals("Feminino")){
                List<String> listaFe = new ArrayList<>();
                listaFe.add(resposta2);
                System.out.println(listaFe);


            }
            else if (resposta2.equals("Masculino")){
                List<String> listaMa = new ArrayList<>();
                listaMa.add(resposta2);
                System.out.println(listaMa);
            }
            else{
                System.out.println("Obrigado(a)!");
            }

            System.out.println("Deseja realizar um novo cadastro? ");
            inicio = s.next();
        }
            System.out.println("Obrigado(a)!");

    }
}
