package textoestrings;

import javax.management.NotCompliantMBeanException;

public class TrabalhandoComStrings {
	
	public static void main(String[]args) {
		// metodos são da classe Character
		
		// verificar se o valor é um numero e retorna true ou falso
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('a'));
		
		System.out.println("==========================");
		
		
		// verificar se o valor é uma letra e retorna true e false
		System.out.println(Character.isLetter('f'));
		System.out.println(Character.isLetter('6'));
		
		System.out.println("==========================");
		//verificar se o valor é uma letra ou numero e retorna true e false
		System.out.println(Character.isLetterOrDigit('c'));
		System.out.println(Character.isLetterOrDigit('5'));
		System.out.println(Character.isLetterOrDigit('@'));
		
		
		System.out.println("============================");
		
		//verificar se o valor esta escrito com caracter mauisculo
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('A'));
		
		System.out.println("====================");
		//verificar se o valor esta escrito com caracter minusculo
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		
		//verificar se o valor é um espaço em branco
		System.out.println(Character.isWhitespace(' '));
		
		System.out.println("========Strings============");
		//Strings
		
		String arquivo = "escola.java";
		//verifica valor antigo e substitui pelo valor novo
		arquivo= arquivo.replace("java","class");
		System.out.println(arquivo);
		
		
		
		System.out.println("====================");
		//compra 2 valores
		String nome1= "nadia";
		String nome2= "Nadia";
		
		//compara conteudo e caracteres maiuscula/minuscula
		System.out.println(nome1.equals(nome2));
		
		//compara o conteudo do texto 
		System.out.println("====================");
		System.out.println(nome1.equalsIgnoreCase(nome2));

		System.out.println("====================");
        //verifica se inicia exatamente com a mesma sequencia de caracteres
		System.out.println(nome1.startsWith("nad"));
		System.out.println(nome1.startsWith("Nad"));
		
		//verifica se finaliza exatamente com a mesma sequencia de caracteres
		System.out.println("====================");
		System.out.println(nome1.endsWith("ia"));
		System.out.println(nome1.endsWith("na"));
		
		System.out.println("====================");
		//compara as letras de uma a uma 
		//muito usado para colocar em ordem alfabetica 
		//colections 
		System.out.println(nome1.compareTo(nome2));
		
		System.out.println("====================");
		// mostra o valor armazenado num determinado indice
		System.out.println(nome1.charAt(4));
		
		System.out.println("====================");
		//retorna uma parte de uma string (informar inicio e fim)
		System.out.println(nome1.substring(2,4));
		
		System.out.println("====================");
		// retorna a posição da 1 ocorrencia de uma letra 
		System.out.println(nome1.indexOf("a"));
		
		System.out.println("====================");
		//retorna a posição da ultima ocorrencia de uma letra
		System.out.println(nome1.lastIndexOf("a"));
		
	}
	
	
	
	
	
}
