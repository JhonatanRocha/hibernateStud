package br.com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.Player;

public class TestFindByIdPlayer {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("basketballDb");
		EntityManager em = factory.createEntityManager();
		
		Player p = em.find(Player.class, 2); //(Classe, ID)
		System.out.println("NOME: " + p.getName() + "; NÚMERO: " + p.getNumber() + "; TIME: " + p.getTeam());
	}
}
