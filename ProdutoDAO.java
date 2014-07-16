package br.com.caelum.hibernate;

import java.util.List;
import org.hibernate.Session;

public class ProdutoDAO {

	private Session session; 
	
	public ProdutoDAO(Session session){
		this.session = session; 
	}
	
	public void salva(Produto p){
		this.session.save(p); 
	}
	
	public void remove(Produto p){
		this.session.delete(p); 
	}
	
	public Produto procura(Long id){
		return (Produto) this.session.load(Produto.class, id); 
	}
	
	public void atualiza(Produto p){
		this.session.update(p);
	}
	
	public List<Produto> listaTudo(){
		return this.session.createCriteria(Produto.class).list(); 
	}
	
	public List<Produto> pagina(int inicio, int quantia){
		return this.session.createCriteria(Produto.class).
				setMaxResults(quantia).setFirstResult(inicio).list();
	}
}
