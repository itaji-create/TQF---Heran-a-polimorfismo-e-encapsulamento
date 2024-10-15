package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Criando objetos necessários
		Endereco endereco = new Endereco("Rua A", "Cidade B", "Estado C", "12345-678");
		Telefone telefone1 = new Telefone("1234-5678");
		Telefone telefone2 = new Telefone("8765-4321");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(telefone1);
		telefones.add(telefone2);
		Cargo cargo = new Cargo("Desenvolvedor", 5000.00);
		Profissao profissao = new Profissao("Engenheiro");

		// Criando um funcionário
		Funcionario funcionario = new Funcionario(123, "João", new Date(), endereco, telefones, cargo, 7000.00, new Date());

		// Criando um cliente
		Cliente cliente = new Cliente("C001", "Maria", new Date(), endereco, telefones, cargo, 7000.00, new Date(), profissao);

		// Exibindo informações do funcionário
		System.out.println("Informações do Funcionário:");
		funcionario.exibirInformacoes();

		// Exibindo informações do cliente
		System.out.println("\nInformações do Cliente:");
		cliente.exibirInformacoes();

		// Reajustando salário do funcionário
		funcionario.reajustarSalario(10); // Aumenta 10%
		System.out.println("\nInformações do Funcionário após reajuste salarial:");
		funcionario.exibirInformacoes();

		// Promovendo o funcionário
		Cargo novoCargo = new Cargo("Gerente de Projetos", 10000.00);
		funcionario.promover(novoCargo);
		System.out.println("\nInformações do Funcionário após promoção:");
	}
}
