package fgabank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno{
	
	// mockado
	private String usuario= "usuariopadrao";
	private String senha= "mudar 123";
	
	

	public Gerente() {
		
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super(nome, cpf, ctps, salario, dataAdmissao);
		
	}
	
	@Override
	public double getBonus() {
	return this.getSalario()* 0.1;
	
}

	@Override
	public boolean autenticarSistemas(String usuario, String senha) {
		if(this.usuario.equals(usuario)&& this.senha.equals(senha)) {
			return true;
		}
		return false;
	}

	public boolean autenticarSistema(String string, String string2) {
		
		return false;
	}
	
	@Override
	public boolean mudarSenha(String senhaAntiga, String senhaNova) {
		if(this.senha.equals(senhaAntiga)&& senhaNova.length()==8) {
			this.senha = senhaNova;
			return true;
			
		}
		return false;
	}
	
	@Override
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo) {
		if (this.usuario.equals(usuarioAntigo) && usuarioNovo.length() == 12) {
			this.usuario = usuarioNovo;
			return true;
			}
			return false;

	}
	
}



