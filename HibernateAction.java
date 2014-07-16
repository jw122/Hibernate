package br.com.caelum.hibernate;

import java.util.List;

import org.hibernate.Session;

public class HibernateAction {

	public static void main(String[] args){
		Session session = new HibernateFactory().getSession(); 
		ProdutoDAO pDao = new ProdutoDAO(session); 
		
		novoProduto(pDao, session); 
		listarTudo(pDao); 
		
		session.close(); 
	}
	
	private static void novoProduto(ProdutoDAO pd, Session s){
		Produto p = new Produto();
		p.setNome("Carro"); 
		p.setDescricao("Fiat"); 
		p.setPreco(30000.00);
		
		s.beginTransaction(); 
		pd.salva(p); 
		System.out.println("ID do produto:" + p.getId()); 
		s.getTransaction().commit(); 
	}
	
	private static void listarTudo(ProdutoDAO pd){
		//listando todos os produtos
		List<Produto> lista = pd.listaTudo(); 
		for (Produto produtos: lista){
			System.out.println(produtos.getNome()); 
		}
	}
}
