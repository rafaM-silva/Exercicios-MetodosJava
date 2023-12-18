package exercicios;
import java.util.Scanner;

public class Exercicio02 {
	static boolean valorPrimo(int valor) {
		int divisores = 0;
		if(valor < 2) {
			return false;
		}else {
		for(int contadora = 1;contadora <= valor; contadora++) {
			if(valor%contadora==0) {
				divisores++;
			}
		}
		
		if(divisores < 3) {
			return true;
			} else {
				return false;
			}
		}
			
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		
		System.out.println(Exercicio02.valorPrimo(valor));
		sc.close();
		
		
	}
}
