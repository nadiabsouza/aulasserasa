package collections;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class TesteOptional {
	
	public static void main(String[] args) {
		
		Optional<String>listaString = Optional.of("Valor optional presente"); // recebe valor do tipo que estamos trabalhando, nesse caso string. 
		listaString.ifPresentOrElse(System.out::println, ()->System.out.println("Não está presente"));// expressão lambda
		
		Optional<String>listaNula = Optional.ofNullable(null); // espera um possivel valor nulo 
		listaNula.ifPresentOrElse(System.out::println, ()-> System.out.println("Nulo o valor não esta presente"));
		
		Optional<String>listaVazia = Optional.empty();// verifica se a lista esta vazia 
		listaVazia.ifPresentOrElse(System.out::println, ()-> System.out.println("Vazio o valor não esta presente"));
		
	  //Optional<String>listaComErro = Optional.of(null);// erro pois não aceita o tipo null
	  //listaComErro.ifPresentOrElse(System.out::println, ()-> System.out.println("Erro o valor não esta presente"));
		
		System.out.println("Valores inteiros");
		OptionalInt.of(22).ifPresent(System.out::println);
		
		System.out.println("Valores decimais");
		OptionalDouble.of(22.55).ifPresent(System.out::println);
		
		System.out.println("Valores inteiros longos");
		OptionalLong.of(22L).ifPresent(System.out::println);
		
		
	}

}
