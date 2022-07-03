package exerciciosDh;

public class TesteJogador {
	
	public class TesteJogadorComInterface {

		public static void main(String[] args) {
			
			Jogador jogador1 = new Jogador();
			
			Pistola pistola = new Pistola();
			pistola.atirar(15);
			pistola.recarregar(60);
			
			ArcoEFlexa arco = new ArcoEFlexa();
			arco.atirar(3);
			arco.recarregar(120);
			
			System.out.println(pistola.toString());
			
			Arma2 besta = new Arma2();
			besta.atirar(1);
			besta.recarregar(30);
			
			System.out.println(besta.toString());
			
			//exemplo ternário
			
			int idade =18;
			String resultado = idade>=18? "Maior idade": "Menor idade";
			System.out.println(resultado);
		}
		
	}

}	
	
	
	
			
			

