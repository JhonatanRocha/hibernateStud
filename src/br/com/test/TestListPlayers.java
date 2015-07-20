package br.com.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.model.Player;

public class TestListPlayers {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("basketballDb");
		EntityManager em = factory.createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
	    CriteriaQuery<Player> query = builder.createQuery(Player.class);
	    Root<Player> root = query.from(Player.class);
	    query.select(root);

	    List<Player> ListPlayers = em.createQuery(query).getResultList();
		
		for(Player p : ListPlayers) {
			System.out.println("ID: " + p.getId() + "; NOME: " + p.getName() + "; NÚMERO: " + p.getNumber() + "; TIME: " + p.getTeam());
		}
	}
}
