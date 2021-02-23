package desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 2500);
		Produto produto2 = new Produto("Monitor", 800);
		Produto produto3 = new Produto("Teclado", 300);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(produto1, 2);
		compra1.adicionarItem(produto2, 2);
		compra1.adicionarItem(produto3, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(produto1, 2);
		compra2.adicionarItem(produto3, 2);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("Caneta", 5.5, 2);
		compra3.adicionarItem("Caderno", 10.99, 3);
		
		
		Cliente cliente1 = new Cliente();
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		cliente1.adicionarCompra(compra3);
		cliente1.nome = "Tiago";
		
		System.out.println(cliente1.toString());		
		
	}

}
