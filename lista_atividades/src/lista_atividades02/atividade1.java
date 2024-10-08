package lista_atividades02;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0 , num2 = 0;
		
		System.out.println("\tMaior número!");
		System.out.printf("\nInforme um número: ");
		num1 = sc.nextDouble();
		System.out.printf("Informe um outro número: ");
		num2 = sc.nextDouble();
		
		if(num1 > num2){
			System.out.printf("\nO maior número informado é: %.1f",num1);
		}
		else if(num2 > num1){
			System.out.printf("\nO maior número informado é: %.1f",num2);
		}
		else if(num1 == num2){
			System.out.printf("\nOs números informados são iguais!");
		}
	}
}
