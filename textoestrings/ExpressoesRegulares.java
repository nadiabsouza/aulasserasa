package textoestrings;

import tratamentoexceptions.IIIlegalArgumentException;

public class ExpressoesRegulares {
	
	
	private String email;

	public ExpressoesRegulares (String email) {
		if(email==null ||!email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email invalido");
			
		}
		
		
		
	
	
	this.email=email;
	
		
	}
	
	public String getEmail() {
		return this.email;
		
		
	}

}
