package br.com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.Player;

public class TestUpdatePlayer {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("basketballDb");
		EntityManager em = factory.createEntityManager();
		
		Player p = em.find(Player.class, 3); //(Classe, ID)
		em.getTransaction().begin();
		p.setName("Kevin McHale");
		p.setNumber(32);
		p.setTeam("Boston Celtics");
		em.getTransaction().commit();
		em.close();
	}
}
