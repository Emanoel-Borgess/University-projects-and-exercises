package br.main.appfuncionario;

import java.text.DecimalFormat;

/**
 *
 * @author Emanoel Borges
 */
public class AppFuncionario {

    public static void main(String[] args) {
        //Definindo o primeiro e o segundo objeto da classe para teste
        Funcionario teste01 = new Funcionario();
        Funcionario teste02 = new Funcionario("Mario", 1200.0,"Casa");
        //Setando o valor de A e B
        teste01.setNome("Joana");
        teste01.setSalario(1400.0);
        teste01.setSecao("Jardim");
        
        imprimirDados(teste01);
        imprimirDados(teste02);
        //Printando os atributos com os valores modificados
        teste01.lerDados();
        imprimirDados(teste01);
    }
    public static void imprimirDados(Funcionario funcionario){
        DecimalFormat df = new DecimalFormat("0.00"); // Formato para duas casas decimais
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + df.format(funcionario.getSalario()));
        System.out.println("Secao: " + funcionario.getSecao());
        System.out.println("Salario com Bonificacao: "+ df.format(funcionario.bonificacao()));
    }
}
