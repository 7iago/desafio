package desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
	
	double totalCompras() {
		double total = 0;
		for(Compra compra:compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		return "nome = " + nome + "\n, compras = " + compras.toString() + ",\n total das Compras = " + totalCompras() + " ";
	}

	
	
}
