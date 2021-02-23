package desafio;

public class Item {
	Produto produto;
	int quantidade;
	
	public Item(Produto item, int quantidade) {
		super();
		this.produto = item;
		this.quantidade = quantidade;
	}



	double totalItem() {
		double total = quantidade * produto.preco;
		return total;
	}



	@Override
	public String toString() {
		return "Item = " + produto.nome + ", valor unitario = " + produto.preco +", quantidade = " + quantidade + ", total do Item = " + totalItem() + "\n ";
	}

	
	

	}
