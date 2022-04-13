package exerciciosaula1;

public class Exercicio17 {
	public static void main(String[] args) {
		
		double altura= 1.73;
		char sexo= 'F';
		double pesoIdeal=0;
		
		if(sexo =='F'){
			pesoIdeal = (62.1 * altura) - 47;
		}else if(sexo == 'M'){
			pesoIdeal = (72.7 * altura) - 58;
		}else {
		}
			System.out.println("Valor informado é invalido! Verifique.");
		
		    System.out.println("Peso ideal: "+ pesoIdeal);

		
	}

}
