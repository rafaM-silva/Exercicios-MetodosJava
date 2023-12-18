package exercicios;
import java.util.Scanner;

public class Exercicio06 {
	static int[] trocaValores(int numeros[]) {
		int valorX = numeros[0];
		int valorY = numeros[1];
		
		int guardaValor = valorX;
		
		numeros[0] = valorY;
		numeros[1] = guardaValor;
		
		return numeros;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor01 = sc.nextInt();
		System.out.println("Digite outro valor");
		int valor02 = sc.nextInt();
		int[] numeros = {valor01,valor02};
		sc.close();
		trocaValores(numeros);
        
        System.out.println("Os valores trocados agora são: " + numeros[0] + " e " + numeros[1]);
		
		
	}
}
