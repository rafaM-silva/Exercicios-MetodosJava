package exercicios;

public class Exercicio10 {

	static void ordemCrescente(int[] numeros) {
        
        for (int passo = 0; passo < numeros.length - 1; passo++) {
        	
            for (int i = 0; i < numeros.length - 1 - passo; i++) {
               
                if (numeros[i] > numeros[i + 1]) {
                    int guardaValor = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = guardaValor;
                }
            }
        }
		
	}
	
	public static void main(String[]args) {
		int[] numeros = {2,3,4,6,1,5};
		
		ordemCrescente(numeros);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "");
		}	
		
	}
}
