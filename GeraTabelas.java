package br.com.caelum.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraTabelas {
	public static void main(String[] args){
		//Cria uma configuracao para a classe Produto
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Produto.class); 
		new SchemaExport(cfg).create(true, true); 
	
	 
	}
	
	
}
