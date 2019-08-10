package br.digitalhouse.revisao;

import java.util.ArrayList;
import java.util.List;

public class TestaCadastro {
    public static void main(String[] args) {

        Data novaData = new Data(10, 8, 2019);

        Cliente novoCliente = new Cliente("João", novaData, 234);
        novoCliente.imprimeDados();

        System.out.println("********************************************************");

        Funcionario novoFuncionario = new Funcionario("Maria", novaData, 200.00f);
        novoFuncionario.calculaImposto();
        novoFuncionario.imprimeDados();

        System.out.println("********************************************************");

        Gerente novoGerente = new Gerente ("José", novaData, 5000.00f, "Tecnologia");
        novoGerente.calculaImposto();
        novoGerente.imprimeDados();

        System.out.println("********************************************************");

        CadastroPessoas novoCadastro = new CadastroPessoas();
        novoCadastro.cadastraPessoa(novoCliente);
        novoCadastro.cadastraPessoa(novoFuncionario);
        novoCadastro.cadastraPessoa(novoGerente);
        novoCadastro.imprimeCadastro();

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(novoFuncionario);

    }
}
