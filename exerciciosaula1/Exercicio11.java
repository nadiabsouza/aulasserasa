package exerciciosaula1;

public class Exercicio11 {
	public static void main(String[] args) {
	
	String nome= "Joana Soares";
	int diaNascimento= 20;
	int mesNascimento= 5;
	int anoNascimento= 1980;
	
	int diaAtual= 16;
	int mesAtual= 3;
	int anoAtual= 2022;
	
	int idade = 0;
	
	
	
	
   if ((mesAtual>mesNascimento) || (mesAtual==mesNascimento && diaAtual >= diaNascimento)){
	   idade= anoAtual - anoNascimento;
   }else {
	   idade= anoAtual - anoNascimento-1;
	   
	   System.out.println("Idade: "+ idade);
   
	   
   }
	   
   }
   
   
			
}


