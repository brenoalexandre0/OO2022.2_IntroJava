package javaExercicios;

import java.util.Scanner;

public class AlturaAluno {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de alunos:");
		Scanner ler = new Scanner(System.in);
		int quantAluno = ler.nextInt();
		
		float[] aluno = new float[quantAluno];
		
		float maisAlto = 0, maisBaixo = 3;
		int alunoAlto = 0, alunoBaixo = 0;
		boolean maisAltoAcontece = false;
		boolean maisBaixoAcontece = false;
		
		for (int i = 0; i < quantAluno; i++) {
			System.out.print("Aluno " + i + ":");
			aluno[i] = ler.nextFloat();
			
			if (maisAlto < aluno[i]) {
				maisAlto = aluno[i];
				alunoAlto = i;
				maisAltoAcontece = true;
			}
			
			if (maisBaixo > aluno[i]) {
				maisBaixo = aluno[i];
				alunoBaixo = i;
				maisBaixoAcontece = true;
			}
		}
		
		if (maisAltoAcontece && maisBaixoAcontece) {
			System.out.println("Aluno mais alto: " + alunoAlto + ", Altura: " + maisAlto);
			System.out.println("Aluno mais baixo: " + alunoBaixo + ", Altura: " + maisBaixo);
		}
		
		ler.close();
	}

}
