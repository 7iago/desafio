package desafio;

public class Item {
	Produto item;
	int quantidade;
	
	
	
	public Item(Produto item, int quantidade) {
		super();
		this.item = item;
		this.quantidade = quantidade;
	}



	double totalItem() {
		double total = quantidade * item.preco;
		return total;
	}



	@Override
	public String toString() {
		return "Item = " + item.nome + ", valor unitario = " + item.preco +", quantidade = " + quantidade + ", total do Item = " + totalItem() + "\n ";
	}

	
	

	}
