package desafio;

import java.util.ArrayList;


public class Compra {
	ArrayList<desafio.Item> itens =  new ArrayList<desafio.Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
	}
	
	double obterValorTotal(){
		double total = 0;
		for(Item item:itens) {
			total += item.totalItem();
		}
		return total;
	}

	@Override
	public String toString() {
		return "\nitens da compra = " + itens.size() + ", produtos " + itens.toString() + ", \n Valor Total da compra = " + obterValorTotal() + "\n ";
	}

	
	
}


