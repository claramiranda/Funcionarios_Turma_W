package br.fiap.turmaw.domain.model;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;


    public void calcularSalario(){
        System.out.println("Método para calculo de salário de um Funcionário");
    }


    //CONSTRUTOR
    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }



    //Getters and Setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
