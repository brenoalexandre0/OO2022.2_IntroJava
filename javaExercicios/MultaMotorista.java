package javaExercicios;

import java.util.Scanner;

public class MultaMotorista {

	public static void main(String[] args) {
		
		System.out.println("Multa por excesso de velocidade");
		System.out.println("50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida");
		System.out.println("100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida");
		System.out.println("200 reais, se estiver acima de 31km/h da velocidade permitida");
		System.out.println();
		System.out.println("Velocidade Maxima:");
		Scanner ler = new Scanner(System.in);
		int velociMax = ler.nextInt();
		System.out.println("Velocidade do Motorista:");
		int velocidadeMotorista = ler.nextInt();
		
		float multa = 0;
		
		if (velocidadeMotorista - velociMax <= 10) {
			multa = 50.00f;
		} else if (velocidadeMotorista - velociMax >= 11 && velocidadeMotorista - velociMax <= 30) {
			multa = 100.00f;
		} else if (velocidadeMotorista - velociMax > 31) {
			multa = 200.00f;
		}
		
		System.out.printf("Multa: R$%.2f", multa);
		
		ler.close();
	}

}
