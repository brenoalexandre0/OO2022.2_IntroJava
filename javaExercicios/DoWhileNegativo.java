package javaExercicios;

import java.util.Scanner;

public class DoWhileNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
			num = ler.nextInt();
			if (num >= 0) {
				soma += num;
			}
		}while(num >= 0);
		
		System.out.println("A soma é: " + soma);
		
		ler.close();
	}

}
