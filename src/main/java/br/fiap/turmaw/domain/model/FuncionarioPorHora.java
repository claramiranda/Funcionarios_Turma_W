package br.fiap.turmaw.domain.model;

public class FuncionarioPorHora extends Funcionario{

    private double valorPorHora;
    private float horasTrabalhadas;


    @Override
    public void calcularSalario() {
        setSalario(horasTrabalhadas * valorPorHora);
        System.out.println("O salário do Funcionario por Hora " + getNome() + " é de R$" + getSalario());
    }

    //CONTRUCTOR
    public FuncionarioPorHora(String nome, int idade, double valorPorHora, float horasTrabalhadas){
        super(nome, idade);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }


}
