package fgabank;

public class TestaBanco {

	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); // criar uma instancia = copia
//		pessoaNumero1.nome= "Jose das Couves";
//		pessoaNumero1.profissao= "Agricultor";
//		pessoaNumero1.cpf= "643.829.641-48";
//		
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profiss�o: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2=pessoaNumero1;
//		
//		System.out.println("======================");
//		
//		
//		System.out.println("Nome: "+pessoaNumero2.nome);
//		System.out.println("Nome: "+pessoaNumero1.nome);

		
//		
//		Pessoa pessoaNova= new Pessoa(); // instanciar a classe Pessoa
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println("Nome: "+pessoaNova.getNome());
//		{
//			
//		}
//		Pessoa pessoaComConstrutor1= new Pessoa("Jo�o dos Tomates","259.800.966-55","123.456-78");
//		
//		System.out.println("Nome: "+ pessoaComConstrutor1.getNome());
//		System.out.println("CPF: "+ pessoaComConstrutor1.getCpf());
//		System.out.println("RG: "+ pessoaComConstrutor1.getRg());
//		
	
      Conta conta1 = new Conta();
      conta1.setAgencia(1234);
      conta1.setNumeroConta(4433);;
      conta1.setTitular("Nadia Bernades");
      conta1.depositar(100);

      System.out.println("Agencia: "+conta1.getAgencia());
      System.out.println("Numero Conta: "+conta1.getNumeroConta());
      System.out.println("Titular: "+conta1.getTitular());
      System.out.printf("Saldo atual: R$ %.2f \n", conta1.getSaldo());
   
      if (conta1.sacar(20.0)) {
          System.out.println("Saque efetuado com sucesso!");
      } else {
          System.out.println("Verifique o valor da saque!");
      }
      
      
      System.out.printf("Saldo atual: R$ %.2f \n", conta1.getSaldo());
      
      Conta conta2 = new Conta();
      conta2.setAgencia(5599);
      conta2.setNumeroConta(5555);;
      conta2.setTitular("Natan Bernades");
      conta2.depositar(100);
      
      conta1.tranferir(50.0, conta2);
      System.out.printf("Saldo atual conta1: R$ %.2f \n", conta1.getSaldo());
      System.out.printf("Saldo atual conta2: R$ %.2f \n", conta2.getSaldo());

	}
	
}






     


		
	
		