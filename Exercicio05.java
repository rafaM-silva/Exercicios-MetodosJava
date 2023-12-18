package exercicios;
import java.util.Scanner;

public class Exercicio05 {
	static int contarVogais(String texto) {
		
		String textoMinusculo = texto.toLowerCase();
			
		char[] caracteres = textoMinusculo.toCharArray();
		
		int quantidadeVogais = 0;
		
		for (int i = 0; i < caracteres.length; i++) {
			
			if(caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
				quantidadeVogais++;
			}
			
		}
		return quantidadeVogais;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
	        System.out.println("Digite um texto!");
	        String texto = sc.nextLine();
	        sc.close();
	        System.out.println("O texto digitado tem "+contarVogais(texto) + " vogais");

	        
	    }
}
