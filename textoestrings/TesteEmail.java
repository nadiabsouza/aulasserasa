package textoestrings;

public class TesteEmail {
	public static void main(String[] args) {
		
		ExpressoesRegulares	emailValido = new ExpressoesRegulares("teste@teste.com.br");
		System.out.println("Email: "+emailValido.getEmail());
		
		ExpressoesRegulares	emailInvalido = new ExpressoesRegulares("testeteste.com.br");
		
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2("21", "214555555");
	    System.out.println(telefoneValido.toString());
	    
	    ExpressoesRegulares2 dddInavalido = new ExpressoesRegulares2("210", "214555555");
	    ExpressoesRegulares2 numeroInvalido = new ExpressoesRegulares2("21", "2145555550");
	    
	
	}
	
	

}
