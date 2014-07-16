package br.com.caelum.hibernate;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BuscarProduto {
	public static void main(String[] args){
		
		Session session = new HibernateFactory().getSession(); 
		Produto encontrado = (Produto)session.load(Produto.class, new Long(98304)); 	
		System.out.println("Produto encontrado:" + encontrado.getNome()); 
		session.close(); 
	}
}
