package View;

import java.util.Scanner;

import Controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		OperacoesController OC = new OperacoesController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
				
		double soma = OC.Soma(n);
		sc.close();
		
		System.out.println(soma);

	}

}
