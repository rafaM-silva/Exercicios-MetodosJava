package exercicios;
import java.util.Scanner;

public class Exercicio07 {
	static double celsiusParaFahrenheit(double celsius) {
		return celsius = (celsius*9/5)+32;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius, para converção");
		double celsius = sc.nextDouble();
		sc.close();
		System.out.println(celsiusParaFahrenheit(celsius));
	}
}
