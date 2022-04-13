package exerciciosaula1;

public class Exercicio13 {
	public static void main(String[] args) {
		
		double salarioBase= 1500.00;
		int numeroDependentes= 2;
		double salarioBruto= salarioBase + (100*numeroDependentes); // da para fazer sem os () 
		
		System.out.println("Salario Bruto: "+ salarioBruto);
		System.out.println("Salario Liquido: "+ (salarioBase-(salarioBase*0.10)));
	
		
		
		
	}

}
