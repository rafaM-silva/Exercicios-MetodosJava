package exercicios;
import java.util.Scanner;

public class Exercicio09 {
		static boolean ehPalindromo(String palavra) {
		
		String textoMinusculo = palavra.toLowerCase();
		
		char[] caracteres = textoMinusculo.toCharArray();
		
		

	    for (int i = 0; i < caracteres.length / 2; i++) {
	        char guardaCaracteres = caracteres[i];
	        caracteres[i] = caracteres[caracteres.length - 1 - i];
	        caracteres[caracteres.length - 1 - i] = guardaCaracteres;
	    }
	    
	    String caracteresParaString = new String(caracteres);

	    return textoMinusculo.equals(caracteresParaString);		
		
	}
	
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite uma palavra para descobrir se ela é um palindromo ou não");
		String palavra = sc.nextLine();
		sc.close();
		System.out.println(ehPalindromo(palavra));
				
	}
}
