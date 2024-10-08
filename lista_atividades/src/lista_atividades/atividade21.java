package lista_atividades;

import javax.swing.JOptionPane;

public class atividade21 {

	public static void main(String[] args) {
		int op_usuario , valor_atual = 0 , valor_anterior = 1 , aux = 0;

		System.out.println("\tSequência Fibonacci.\n");
		op_usuario = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de termos desejadas da sequência Fibonacci:"));
		System.out.printf("Sequência: ");
		do{
			aux = valor_atual;
			valor_atual += valor_anterior;
			valor_anterior = aux;

			System.out.printf(valor_atual+" ");
			op_usuario--;
		}
		while(op_usuario != 0);
	}
}
