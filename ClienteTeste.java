package desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 2500);
		Produto produto2 = new Produto("Monitor", 800);
		Produto produto3 = new Produto("Teclado", 300);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto2, 2);
		Item item3 = new Item(produto3, 2);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(item1);
		compra1.adicionarItem(item2);
		compra1.adicionarItem(item3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(item1);
		compra2.adicionarItem(item2);
		
		
		Cliente cliente1 = new Cliente();
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		cliente1.nome = "Tiago";
		
		System.out.println(cliente1.toString());		
		
	}

}
