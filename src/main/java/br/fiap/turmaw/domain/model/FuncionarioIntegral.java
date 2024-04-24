package br.fiap.turmaw.domain.model;

public class FuncionarioIntegral extends Funcionario{


    @Override
    public void calcularSalario() {
        System.out.println("O salário do Funcionario Integral " + getNome() + " é de R$" + getSalario());
    }

    //CONTRUTOR
    public FuncionarioIntegral(String nome, int idade, double salario) {
        super(nome, idade);
        setSalario(salario);
    }

}
