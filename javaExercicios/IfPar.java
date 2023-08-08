package javaExercicios;

import java.util.Scanner;

public class IfPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		boolean par;
		
		System.out.println("Digite o numero:");
		num = ler.nextInt();
		
		if (num%2 == 0) {
			par = true;
		} else {
			par = false;
		}
		
		System.out.println(par);
		
		ler.close();
	}

}
