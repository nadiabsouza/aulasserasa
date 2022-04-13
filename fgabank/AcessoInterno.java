package fgabank;

public interface AcessoInterno {
	
	// os metodos n�o tem comportamento(corpo) s� assinatura
	public boolean autenticarSistemas (String usuario, String senha);

	
	
	/**
	 * @param String usuario => pode informar um usu�rio v�lido
	 * @param String senha => pode informar uma senha com ate 255 caracteres alfanumericos
	 * @return => retorna verdadeiro quando a senha estiver correta 
	 */
	
	public boolean autenticarSistema(String usuario, String senha);
	public boolean mudarSenha(String senhaAntiga, String senhaNova);
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo);
	

}
