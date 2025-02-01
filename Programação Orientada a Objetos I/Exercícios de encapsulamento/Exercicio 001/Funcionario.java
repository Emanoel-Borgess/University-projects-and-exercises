package br.main.appfuncionario;

import java.util.Scanner;

/**
 *
 * @author Emanoel Borges
 */
public class Funcionario {
    private String nome;
    private Double salario;
    private String secao;
    
    public Funcionario(){
    nome = "";
    salario = 0.0;
    secao = "";
    }
    public Funcionario(String nome, Double salario, String secao){
        this.nome = nome;
        this.salario = salario;
        this.secao = secao;
    }
    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public String getSecao() {
        return secao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }
    public Double bonificacao(){
        return salario = salario *(1+0.10);
    }
    public void lerDados(){
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        nome = input.next();
        input.nextLine();// Limpa o buffer do scanner
        System.out.print("Digite o valor do seu salario:");
        salario = input.nextDouble();
        input.nextLine();// Limpa o buffer do scanner
        System.out.print("Digite secao:");
        secao = input.next();
    }
}
