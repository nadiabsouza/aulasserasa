package exerciciosaula1;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		int A =1;
		int B =2;
		int C =3;
		
		int auxiliar=0;
		
		System.out.println("Antes: A " +A+" -B "+B+" -C "+C);
		
		int aux = A;
		
		A = C;
		C=B;
		B = aux;
		System.out.println("Depois: A " +A+" -B "+B+" -C "+C);


				
		
	}

}
