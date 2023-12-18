package exercicios;

public class Exercicio08 {
	static int encontrarMaiorElemento(int[][] matriz) {
	       int maiorElemento = matriz[0][0];

	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                if (matriz[i][j] > maiorElemento) {
	                    maiorElemento = matriz[i][j];
	                }
	            }
	        }

	        return maiorElemento;
	    }
		
		public static void main(String[]args) {
			int[][] numeros = {
					{3,4,2,1},
					{9,7,10,13},
					{22,38,42,11}
			};
			
			int maiorElemento = encontrarMaiorElemento(numeros);
			System.out.println(maiorElemento);
			
		}
}
