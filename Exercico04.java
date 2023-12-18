package exercicios;
import java.util.Scanner;

public class Exercico04 {

	static int fatorial(int numero01,int numero02) {
		if(numero01 < numero02) {
			return numero02 * fatorial(numero01,numero02-1);
		}else {
			return numero02;
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número!");
		int numero = sc.nextInt();		
		sc.close();
		int resultado = fatorial(1,numero);
		System.out.println(resultado);
		
	}
}
