package br.fiap.turmaw.domain.model;

public class Gerente extends Funcionario{

    private double salarioBase;
    private double bonus;


    @Override
    public void calcularSalario() {
        setSalario(salarioBase + bonus);
        System.out.println("O salário do Gerente " + getNome() + " é de R$" + getSalario());
    }

    //CONSTRUTOR
    public Gerente(String nome, int idade, double salarioBase, double bonus) {
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }
}
