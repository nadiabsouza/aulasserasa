package exerciciosaula1;

public class Exercicio5 {
public static void main(String[] args) {
	
	int valorNumeroUm= 3;
	int valorNumeroDois =7;
	int valorNumeroTres =9;
	
	if (valorNumeroUm > valorNumeroDois && valorNumeroUm > valorNumeroTres)
	System.out.println("O valor "+ valorNumeroUm + " � o maior");
	else if (valorNumeroDois > valorNumeroUm && valorNumeroUm > valorNumeroTres)
	System.out.println("O valor "+ valorNumeroDois+ " � o maior");
	else
	System.out.println("o valor "+ valorNumeroTres +" � o maior");
	
	if (valorNumeroUm < valorNumeroDois && valorNumeroUm < valorNumeroTres)
		System.out.println("O valor "+ valorNumeroUm + " � o menor");
		else if (valorNumeroDois < valorNumeroUm && valorNumeroUm < valorNumeroTres)
		System.out.println("O valor "+ valorNumeroDois+ " � o menor");
		else
		System.out.println("o valor "+ valorNumeroTres +" � o menor");
}
}
