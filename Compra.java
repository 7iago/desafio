package desafio;

import java.util.ArrayList;


public class Compra {
	ArrayList<desafio.Item> itens =  new ArrayList<desafio.Item>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double obterValorTotal(){
		double total = 0;
		for(Item item:itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}

	@Override
	public String toString() {
		return "\nitens da compra = " + itens.size() + ", produtos " + itens.toString() + ", \n Valor Total da compra = " + obterValorTotal() + "\n ";
	}

	
	
}


