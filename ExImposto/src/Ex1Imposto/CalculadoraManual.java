package Ex1Imposto;

import java.util.Scanner;

public class CalculadoraManual {

	public static void main(String[] args) {
		double salarioLiquido = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite seu salário");
		double salarioBruto = Double.parseDouble(keyboard.nextLine());
		
		// Implemente aqui
		
		System.out.println("Salario Liquido: " + salarioLiquido);
	}

}
