package br.digitalhouse.revisao;

public class Funcionario extends Pessoa implements Imposto {
    private Float salario;
    private Float porcentagem;

    public Funcionario(String novoNome, Data novoNascimento, Float novoSalario) {
        super(novoNome, novoNascimento);
        salario = novoSalario;
    }

    @Override
    public Float calculaImposto() {
        float calImposto = (float) (salario * 0.03);
        return calImposto;
    }

//    public Float calculaImposto(){
//        return salario * 0.03f;
//    }

    @Override
    public void imprimeDados() {
        float salarioComImposto = salario - calculaImposto();
        System.out.println("O valor final do cálculo é de: " + salarioComImposto);

    }

    public Float getSalario(){
        return salario;
    }

    public void setSalario(Float novoSalario){
        salario = novoSalario;
    }

}
