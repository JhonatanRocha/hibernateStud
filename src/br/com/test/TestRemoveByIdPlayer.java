package br.com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.Player;

public class TestRemoveByIdPlayer {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("basketballDb");
		EntityManager em = factory.createEntityManager();
		
		Player p = em.find(Player.class, 2); //(Classe, ID)
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}