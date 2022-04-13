package arrays;

public class TesteComArrays {
	public static void main(String[] args) {
		
	//unidimensional => vetor
	int[]idades1 ={1,5,7,80,4}; //já está inicializado -> pq já tem valores
	int[]idades2 = new int[5];  //não possui dados escritos pelo usuário
	
    String[]nomes = {"Julia","Maria","Pedro"};
    String[]nomes2 = new String [3];
    
    System.out.println("Idade: "+idades1[3]+ " -Nome:" + nomes[0]);
    
    for (int i= 0;i <5;i++) {
    	System.out.println(idades1[i]);
    }
    
	for(int indice=0; indice< nomes.length; indice++) {
		System.out.println("Nomes: "+nomes[indice]);
	}	

    //array multidimensionaies
    
    //int linha || int coluna
    
    //int[]numeros= new int[3][3];
    //int[]valor= 1;
    
    
    //for(int linha=0; linha<3;linha++) {
    //for(int coluna=0; coluna<3; coluna++) {
    	//System.out.println(numeros[linha][coluna]);
    	//}
    //}   
}
}
