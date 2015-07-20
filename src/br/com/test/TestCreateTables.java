package br.com.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCreateTables {
	public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("basketballDb");
			factory.close();
	}
}


