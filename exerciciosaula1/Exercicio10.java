package exerciciosaula1;

public class Exercicio10 {
public static void main(String[] args) {
		
	String codigo = "A33245610";
	String descricao = "Sutia";
	int quantidade = 20;
	double precoCompra= 45.0;
	double percentualLucro = 15.0;
	double precoVenda = precoCompra*(1+percentualLucro/100);
	

	System.out.println("Preço compra: " + precoCompra);
	System.out.println("Percentual lucro: " + percentualLucro);
	System.out.println("Preço venda: " + precoVenda);
	System.out.println("Preço total: "+ precoVenda* quantidade);
	
		
	}

}
