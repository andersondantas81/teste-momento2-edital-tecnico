package Tecnico;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro:");
		int numero = scanner.nextInt();
		
		if(numero == 0) {
			System.out.println("O n�mero � 0");
			return;
		}
		if (numero >= 0) {
			if(numero % 2 == 0) {
				System.out.println("O n�mero � par e positivo");
				return;
			}
			System.out.println("O n�mero � �mpar e positivo");
		} else if(numero % 2 == 0) {
			System.out.println("O n�mero � par e negativo");
		}else System.out.println("O n�mero � �mpar e negativo");
		
	}

}
