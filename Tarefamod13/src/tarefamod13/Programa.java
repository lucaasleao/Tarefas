package tarefamod13;

public class Programa {
    public static void main (String args[]){
    PessoaFisica pessoaFisica = new PessoaFisica();
    pessoaFisica.setCpf(125f);
    pessoaFisica.setNome("Lucas");
    System.out.println("Nome: " + pessoaFisica.getNome() + " " +"CPF: " + pessoaFisica.getCpf());

    PessoaJuridica pessoaJuridica = new PessoaJuridica();
    pessoaJuridica.setCnpj(240f);
    pessoaJuridica.setNome("Brasil");
    System.out.println("Nome: " + pessoaJuridica.getNome() + " " +"CNPJ: " + pessoaJuridica.getCnpj());


    }

       }



