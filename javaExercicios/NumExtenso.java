package javaExercicios;

import java.util.Scanner;

public class NumExtenso {

	public static void main(String[] args) {
		System.out.println("Digite um número de 1 a 10:");
		Scanner ler = new Scanner(System.in);
		int num = ler.nextInt();
		
		String numExtenso = extenso(num);
		
		System.out.println(numExtenso);
		
		ler.close();
	}

	public static String extenso(int num) {
		String str;
		
		switch (num) {
			case 1:
				str = "Um";
				break;
			case 2:
				str = "Dois";
				break;
			case 3:
				str = "Tres";
				break;
			case 4:
				str = "Quatro";
				break;
			case 5:
				str = "Cinco";
				break;
			case 6:
				str = "Seis";
				break;
			case 7:
				str = "Sete";
				break;
			case 8:
				str = "Oito";
				break;
			case 9:
				str = "Nove";
				break;
			case 10:
				str = "Dez";
				break;
			default:
				str = "Nao foi possivel mostrar seu extenso";
				break;
		}
		
		return str;
	}
}
