package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMaps {
	
	public static void main(String[] args) {
		
		
		//put => adicionar valores ao map
		Map<String,Integer>quadroMedalhasOlimpicas2020 = new HashMap<>();
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Japão", 58);
		quadroMedalhasOlimpicas2020.put("Grã Bretnania", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);
		
		
		//buscar informação atraves de uma chave e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("EUA"));
		
		//buscar informação atraves de um valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));
		
		//informa o tamanho do map 
		System.out.println(quadroMedalhasOlimpicas2020.size());
		
		//remover valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
		System.out.println("===============================");
		for (String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key +" => "+ quadroMedalhasOlimpicas2020.get(key));

	}
		
TreeMap<String, Integer>quadroMedalhasOlimpicas2016 = new TreeMap<>();
		
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Japão", 50);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		System.out.println(quadroMedalhasOlimpicas2016.firstKey()); //pega a primeira chave
		System.out.println(quadroMedalhasOlimpicas2016.lastKey()); //pega a ultima chave
		
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China")); //mostra a chave anterior 
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China")); //mostra a chave posterior

}
}
	
