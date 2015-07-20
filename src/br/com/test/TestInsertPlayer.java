package br.com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.Player;

public class TestInsertPlayer {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("basketballDb");
		EntityManager em = factory.createEntityManager();
		
		Player p = new Player();
		p.setName("Rajon Rondo");
		p.setNumber(9);
		p.setTeam("Boston Celtics");
		
		Player p1 = new Player();
		p1.setName("Kevin Garnett");
		p1.setNumber(5);
		p1.setTeam("Boston Celtics");
		
		Player p2 = new Player();
		p2.setName("Ray Allen");
		p2.setNumber(20);
		p2.setTeam("Boston Celtics");
		
		Player p3 = new Player();
		p3.setName("James Posey");
		p3.setNumber(16);
		p3.setTeam("Boston Celtics");
		
		em.getTransaction().begin();
		em.persist(p);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
