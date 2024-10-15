package com.example.demo;

import java.util.Date;
import java.util.List;

public class Cliente extends Funcionario {
    private String codigo;
    private Profissao profissao;

    public Cliente(String codigo, String nome, Date dataNascimento, Endereco endereco, List<Telefone> telsContato, Cargo cargo, double salario, Date dataAdmissao, Profissao profissao) {
        super(0, nome, dataNascimento, endereco, telsContato, cargo, salario, dataAdmissao); // Passa a matrícula como 0, por exemplo
        this.codigo = codigo;
        this.profissao = profissao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Código: " + codigo + ", Profissão: " + profissao.getDescricao());
    }

    // Getters e setters
}


