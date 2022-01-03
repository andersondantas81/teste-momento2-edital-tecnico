package Tecnico;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;*/

public class Exercicio02 {
	
	private static void ordenar(int primeiroValor, int segundoValor, int terceiroValor) {
		int aux;
		boolean troca = true; 
		while(troca ) {
			troca= false;
			for(int i = 0; i < 3; i++) {
				if(primeiroValor > segundoValor) {
					aux = segundoValor;
					segundoValor = primeiroValor;
					primeiroValor = aux;
					troca = true;
				}
				if(segundoValor > terceiroValor) {
					aux = terceiroValor;
					terceiroValor = segundoValor;
					segundoValor= aux;
					troca = true;
				}
			}
		}
		System.out.println(primeiroValor + ", "+segundoValor + ", "+terceiroValor);
		
	}
	
	public static void main(String[] args) {
		
		ordenar(3,2,1);		
		
		
		/*
		 * List<Integer> listaOrdenada = new ArrayList<Integer>(); Scanner scanner = new
		 * Scanner(System.in);
		 * 
		 * System.out.println("Informe o primeiro número:");
		 * listaOrdenada.add(scanner.nextInt());
		 * System.out.println("Informe o segundo número:");
		 * listaOrdenada.add(scanner.nextInt());
		 * System.out.println("Informe o terceiro número:");
		 * listaOrdenada.add(scanner.nextInt());
		 * 
		 * Collections.sort(listaOrdenada); System.out.println(listaOrdenada);
		 */
	}

}
