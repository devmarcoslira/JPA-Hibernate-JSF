package com.empresa.teste;


import java.util.List;

import com.empresa.Funcionario;
import com.empresa.repositorio.RepositorioFuncionario;

public class Teste {

	public static void main(String[] args) {
		
		RepositorioFuncionario repositorioFuncionario = new RepositorioFuncionario();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("José Raimundo");
		funcionario.setMatricula("159852");
		funcionario.setCargo("Analista de Requisitos");
		funcionario.setSalario(5000);
		
		repositorioFuncionario.salvar(funcionario);
		
		/*ALTERAR DADOS
		Funcionario funcionario = repositorioFuncionario.obtePorId(2);
		funcionario.setNome("Alexandre Martins");
		System.out.println(funcionario.getNome());
		repositorioFuncionario.salvar(funcionario);
		*/
		
		//####################################################################	
		
		/*LER DADOS (LISTAR)
		List<Funcionario> funcionarios = repositorioFuncionario.listarTodos();
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
		}
		*/
		
		//####################################################################	
		
		/*DELETAR DADOS
		Funcionario funcionario = repositorioFuncionario.obtePorId(2);
		repositorioFuncionario.deletar(funcionario);
		*/
		
		
	}

}
