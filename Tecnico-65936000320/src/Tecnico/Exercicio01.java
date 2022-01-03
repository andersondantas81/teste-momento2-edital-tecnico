package Tecnico;

public class Exercicio01 {

	public static void menorValor(int a,  int b,  int c, int d) {
		int menor = 0;
		
		if((a < b) && (a < c) && (a < d)) {
			menor = a;
		}else if ((b < c) && (b < d)) {
			menor = b;
		}else if (c < d) {
			menor = c;
		}else menor = d;
		
		System.out.println("O menor valor é: " + menor);
		
	}
	
	public static void maiorValor(int a, int b, int c, int d) {
		int maior = 0;
		
		if((a > b) && (a > c) && (a > d)) {
			maior = a;
		}else if ((b > c) && (b > d)) {
			maior = b;
		}else if (c > d) {
			maior = c;
		}else maior = d;


		System.out.println("O maior valor é: " + maior);
		
	}
	
	public static void main(String[] args) {
			
		menorValor(20, 40, 10, 30);
		maiorValor(20, 40, 10, 30);		
		
	}

}
