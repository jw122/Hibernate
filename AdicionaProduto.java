package br.com.caelum.hibernate;

import org.hibernate.Session;

public class AdicionaProduto {
	
	public static void main(String[] args){
		
		Produto p = new Produto();
		p.setNome("Brazuca"); 
		p.setDescricao("Bola de futebol"); 
		p.setPreco(120.00); 
		
		Session session = new HibernateFactory().getSession();
		session.beginTransaction(); 
		session.save(p);
		
		System.out.println("ID do produto:" + p.getId()); 

		session.getTransaction().commit(); 
		session.close(); 
		

	}
}
