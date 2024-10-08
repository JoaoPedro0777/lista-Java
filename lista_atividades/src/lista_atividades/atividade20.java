package lista_atividades;

import java.util.Scanner;

public class atividade20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valor = new int[100];
		int valor_usuario , maior_v = 0 , menor_v = 0 ;

		System.out.println("Informe quantos valores terá a lista:");
		valor_usuario = sc.nextInt();
		System.out.println("\nDigite os valores da lista: ");
		for(int i = 0 ; i < valor_usuario ; i++){
			System.out.printf(i+1+"° - ");
			valor[i] = sc.nextInt();
		}
		maior_v = valor[0];
		for(int i = 0 ; i < valor_usuario ; i++){
			if(maior_v < valor[i]){
				maior_v = valor[i];
			}
		}
		menor_v = valor[0];
		for(int i = 0 ; i < valor_usuario ; i++){
			if(menor_v > valor[i]){
				menor_v = valor[i];
			}
		}
		System.out.printf("\nO maior valor da lista é: %d.\nO menor valor da lista é: %d.", maior_v , menor_v);
	}
}
