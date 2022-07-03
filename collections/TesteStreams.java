package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
		System.out.println("Menor nome: "+estudantes.stream().min(Comparator.comparing(String::length)));
		
		// saber todos os nomes que contem a letra "R"
		System.out.println("Nomes que contem r: "+ estudantes.stream()
		.filter((estudante)-> estudante.toLowerCase().contains("r"))
		.collect(Collectors.toList()));
		
		//exibe os n primeiros valores da collection
		System.out.println("Os primeiros 3 itens" +estudantes.stream()
		.limit(3)
		.collect(Collectors.toList())
		);
		
		
		// retorna um valor booleano de acordo com o criterio da busca
		System.out.println("Possui a letra Q em todos os nomes?"+estudantes.stream()
		.allMatch((elemento)-> elemento.contains("q")) // todos tem a letra 
		);
		
		// retorna um valor booleano de acordo com o criterio da busca
		System.out.println("Possui a letra A no nomes?"+estudantes.stream()
		.anyMatch((elemento)-> elemento.contains("a")) // se pelo menos 1 tem a letra 
		);
		
		// retorna um valor booleano de acordo com o criterio da busca
		System.out.println("Ninguem possui a letra W no nome?"+estudantes.stream()
		.noneMatch((elemento)-> elemento.contains("w"))  // se ninguem tem a letra
		);
		
		// retorna uma nova coleção com o tamanho de cada nome
		System.out.println("Nova coleção com o tamanho"+estudantes.stream()
		.map((estudante)-> estudante.concat("-").concat(String.valueOf(estudante.length())))
		.collect(Collectors.toList())
		);
		
				
		
		
	}

}
