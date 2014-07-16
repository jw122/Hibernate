package br.com.caelum.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TesteDeConfiguracao {
	public static void main(String[] args){
		
		//Cria uma configuracao para a classe Produto
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Produto.class);
		SessionFactory factory = cfg.buildSessionFactory(); 
		
		//cria a sessao
		Session session = factory.openSession();
		System.out.println("session started!"); 
		
		//fecha a sessao
		session.close();
		
		factory.close();
	}
}
