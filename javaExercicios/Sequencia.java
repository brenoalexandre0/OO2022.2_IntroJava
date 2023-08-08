package javaExercicios;

public class Sequencia {

	public static void main(String[] args) {
		int[] numerador = new int[50];
		int[] denominador = new int[50];
		double soma = 0;
		
		numerador[0] = 1;
		for (int i = 0; i < 50; i++) {
			if (i < 49) {
				numerador[i+1] = numerador[i]+2;
			}
			denominador[i] = i+1;
			soma += numerador[i]/denominador[i];
		}
		
		System.out.println(soma);
		
	}

}
