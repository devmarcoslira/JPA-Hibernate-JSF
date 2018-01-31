package com.empresa.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.empresa.Funcionario;

public class RepositorioFuncionario {
	
	EntityManagerFactory emf;
	EntityManager em;
	
		
	public RepositorioFuncionario() {
		emf = Persistence.createEntityManagerFactory("lira");
		em = emf.createEntityManager();
	}
	
	public Funcionario obtePorId(int id) {
		em.getTransaction().begin();
		Funcionario funcionario = em.find(Funcionario.class, id);
		em.getTransaction().commit();
		emf.close();
		return funcionario;
	}
	
	public void salvar(Funcionario funcionario) {
		em.getTransaction().begin();
		em.merge(funcionario);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void deletar(Funcionario funcionario) {
		em.getTransaction().begin();
		em.remove(funcionario);
		em.getTransaction().commit();
		emf.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select funcionario from Funcionario funcionario");
		List<Funcionario> funcionarios = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return funcionarios;
	}

}
