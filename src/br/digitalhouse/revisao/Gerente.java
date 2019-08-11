package br.digitalhouse.revisao;

public class Gerente extends Funcionario implements Imposto{
    private String area;

    public Gerente(String novoNome, Data novoNascimento, Float novoSalario, String novaArea) {
        super(novoNome, novoNascimento, novoSalario);
        area = novaArea;
    }

    @Override
    public Float calculaImposto() {
        float calImposto = (float) (super.getSalario() * 0.05);
        return calImposto;
    }

//    public Float calculaImposto(){
//        return getSalario() * 0.05f;
//    }

    @Override
    public void imprimeDados() {
//        super.imprimeDados();
        float salarioComImposto = super.getSalario() - calculaImposto();
        System.out.println("O valor final do cálculo é de: " + salarioComImposto);

    }

    public String getArea(){
        return area;
    }

    public void setArea(String novaArea){
        area = novaArea;
    }
}
