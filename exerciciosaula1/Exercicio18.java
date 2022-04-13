package exerciciosaula1;

public class Exercicio18 {
	public static void main(String[] args) {
		
		int idade= 12;
		String categoria;
		
		if(idade >18) {
			categoria = "Senior";
		}else if (idade >=5 && idade<=7) {
			categoria = "Infantil A";
		}else if (idade >=8 && idade<=10) {
			categoria = "Infantil B";
		}else if (idade >=11 && idade<=13) {
			categoria = "Juvenil A";
		}else {
			categoria = "Juvenil B";
		}
			
		System.out.println("Categoria: "+categoria);
		
	}

}
