package exerciciosaula1;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
	
	double pesoDaBagagem= 25.0;
	double valorExcesso= 0;
	
	if(pesoDaBagagem <= 20){
		valorExcesso=0;		
	}else if (pesoDaBagagem > 40){
	    valorExcesso=(pesoDaBagagem-20) * 1000;	
	}else{
		valorExcesso= (pesoDaBagagem-20) * 5000;
	}
	
	System.out.println("Valor pagamento: "+ valorExcesso);
	}
}

	
	
	
		
	
