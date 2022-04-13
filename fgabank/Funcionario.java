package fgabank;

import java.time.LocalDate;

public abstract class Funcionario {
	
	private final double INDICE = 0.05;// constante 
	private String nome;
	private String cpf;
	private String ctps;
	private double salario;
	private LocalDate dataAdmissao;
	
	
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		
	}
    
	
	/**
	 * Calculo de bonus para todos os funcionarios
	 * @version 1.0 
	 * @since 01/04/2022
	 * @author Nadia Souza
	 * @return valor calculado da bonificação
	 */
	
	public double getBonus() {
		return this.salario * INDICE;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
	@Override
	public String toString() {
		
		return "Nome: "+getNome()+"\n CTPS: "+ getCtps()+ "\n Data Admissão: "+ getDataAdmissao()+"\n Salario: "+getSalario();
		
	}

	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}


 