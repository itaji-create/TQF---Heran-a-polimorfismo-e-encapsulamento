package com.example.demo;

import java.util.Date;
import java.util.List;

public class Funcionario {
    private int matricula;
    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private List<Telefone> telsContato;
    private Cargo cargo;
    private double salario;
    private Date dataAdmissao;

    public Funcionario(int matricula, String nome, Date dataNascimento, Endereco endereco, List<Telefone> telsContato, Cargo cargo, double salario, Date dataAdmissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void cadastrar() {
        // Implementação do método de cadastro
    }

    public int obterIdade() {
        // Calcular e retornar a idade do funcionário
        return 0; // Placeholder
    }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }

    public void exibirInformacoes() {
        System.out.println("Matricula: " + matricula + ", Nome: " + nome + ", Data de Nascimento: " + dataNascimento);
        // Exibir mais informações conforme necessário
    }

    // Getters e setters
}


