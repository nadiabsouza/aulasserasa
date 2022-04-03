package fgabank;

public class TestaBanco {

	public static void main(String[] args) {
		
//	Pessoa pessoaNumero1 = new Pessoa(); //cria uma instancia
//	pessoaNumero1.nome = "Jose das Couves";
//	pessoaNumero1.profissao = "Agricultor";
//	pessoaNumero1.cpf = "643.829.641-48";
//	
//	System.out.println("Nome: "+pessoaNumero1.nome);
//	System.out.println("Profissao: "+pessoaNumero1.profissao);
//	System.out.println("CPF: "+pessoaNumero1.cpf);
//	
//	Pessoa pessoaNumero2 = pessoaNumero1;
//	pessoaNumero2.nome = "Joao dos Tomates";
//	
//	
//	System.out.println("======================");
//	
//	System.out.println("Nome: "+pessoaNumero2.nome);
//	System.out.println("Nome: "+pessoaNumero1.nome);
		
//	Pessoa pessoaNova = new Pessoa (); //instanciar a classe Pessoa
//	pessoaNova.setNome("Jose das Couves");
//	System.out.println("Nome: "+pessoaNova.getNome());
//	
//	Pessoa pessoaComConstrutor1 = new Pessoa ("Joao dos Tomates","259.800.966-55","123,456-7");
//	System.out.println("Nome: "+pessoaComConstrutor1.getNome());
//	System.out.println("CPF: "+pessoaComConstrutor1.getCpf());
//	System.out.println("RG: "+pessoaComConstrutor1.getRg());
	

	PessoaFisica pfNadia = new PessoaFisica();
	pfNadia.setNome("Nadia Souza");
	pfNadia.setEmail("nadia12@gmail.com");	
	pfNadia.setTelefone("16911234587");
	pfNadia.setCpf("879.359.983-88");
	pfNadia.setProfissao("Estudante");	
	pfNadia.setRg("12345678-9");
		
	Conta conta1 = new Conta();
	conta1.setAgencia(1234);
	conta1.setNumeroConta(7889);
  //conta1.setSaldo(14000.58); >> não se deve alterar diretamente essa informacão. Ela apenas pode ser exibida.
	conta1.setTitular(pfNadia);
	
	
	conta1.depositar(1000.0);

	Conta conta2 = new Conta();
	conta2.setAgencia(5582);
	conta2.setNumeroConta(2234);
	
	
	
	conta1.tranferir(150.0, conta2);
	System.out.printf("Saldo Atual Nadia:R$ %.2f \n",conta1.getSaldo());
	System.out.printf("Saldo Atual Natan:R$ %.2f \n",conta2.getSaldo());
	
	ContaCorrente cc1 = new ContaCorrente();
	cc1.depositar(1000);
	System.out.println(cc1.getSaldo());
	System.out.println(cc1.getLimite());
	
	
	
	
	System.out.println("Agencia: "+conta1.getAgencia());
	System.out.println("Conta: "+conta1.getConta());	
	System.out.println("Titular: "+conta1.getTitular().getNome());
	System.out.printf("Saldo Atual:R$ %.2f \n",conta1.getSaldo());
	
	if (conta1.sacar(20.0)) {
		System.out.println("Saque efetuado com sucesso!");
	}else {
		System.out.println("Verifique valor do saque!");
	}
	
	System.out.printf("Saldo Atual:R$ %.2f \n",conta1.getSaldo());
	
	
}
	
	
}

