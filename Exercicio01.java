package exercicios;
import java.util.Scanner;

public class Exercicio01 {
	static int soma(int valor01,int valor02) {
		return valor01+valor02;
	}
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor01 = sc.nextInt();
		
		System.out.println("IDigite outro valor");
		int valor02 = sc.nextInt();
		
		System.out.println("A soma dos valore é: "+Exercicio01.soma(valor01,valor02));
		sc.close();
		
	}

}
