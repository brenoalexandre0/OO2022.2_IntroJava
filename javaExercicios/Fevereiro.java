package javaExercicios;

import java.util.Scanner; //leitura de dados

public class Fevereiro {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia:\n");    
        dia = ler.nextInt();
        System.out.print("Digite o mes:\n");
        mes = ler.nextInt();
        System.out.print("Digite o ano:\n");
        ano = ler.nextInt();
        if(mes >= 1 && mes <= 12) {
        // Data V�lida
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
                if(dia >= 1 && dia <= 31) {
                    System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else {
                    // Dia inv�lido
                    System.out.println("Data Invalida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if(dia >= 1 && dia <= 30) {
                	System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else {
                        // Dia inv�lido
                        System.out.println("Data Invalida");
                }
            } else if (mes == 2) {
                // Se o m�s � fevereiro, � necess�rio saber se o ano � bissexto ou n�o, ou seja, se fevereiro tem 28 ou 29 dias.
                if ((ano%4 == 0 && ano%100 != 0) || ano%400 == 0) {
                	if(dia >= 1 && dia <= 29) {
                		System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                	} else {
                            // Dia inv�lido
                            System.out.println("Data Invalida");
                    }
                } else {
                	if(dia >= 1 && dia <= 28) {
                		System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                	} else {
                            // Dia inv�lido
                            System.out.println("Data Invalida");
                    }
                }
            }
        } else {
            // Mes invalido
            System.out.println("Data Invalida");
        }
        
        ler.close();
    }
}
