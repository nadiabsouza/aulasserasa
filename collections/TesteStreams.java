package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteStreams {
	
	public static void main(String[] args) {
		
		List<String>estudantes = new ArrayList<>();
		
		estudantes.add("Maria");
		estudantes.add("José");
		estudantes.add("Antonio");
		estudantes.add("Rui");
		estudantes.add("Pedro");
		estudantes.add("Ana");
		
		//imprimir todos os dados da lista 
		System.out.println("Lista de alunos");
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("==============================");

		//contador 
		
		System.out.println("Total de estudantes da lista: "+ estudantes.stream().count());
		
		// maior nome da lista 
		System.out.println("Maior nome: "+estudantes.stream().max(Comparator.comparing(String::length)));
		
		// saber qual o menor nome da lista 
		System.out.println("Maior nome: "+estudantes.stream().min(Comparator.comparing(String::length)));
		
	}

}
