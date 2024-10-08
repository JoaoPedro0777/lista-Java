package lista_atividades;

public class atividade19 {

	public static void main(String[] args) {
		int[] dado = {1,2,3,4,5,6};
		int resultado = 0 , num1 = 0 , num2 = 0 , num3 = 0 , num4 = 0 , num5 = 0 , num6 = 0;
		
		System.out.println("\tLançamento de um dado!");
		System.out.println("\nDado lançado:");
		for(int i = 0 ; i < 100 ; i++){
			for(int j = 0 ; j < dado.length ; j++){
				resultado = dado[j];
				if(resultado == 1){
					num1 += 1;
				}
				if(resultado == 2){
					num2 += 1;
				}
				if(resultado == 3){
					num3 += 1;
				}
				if(resultado == 4){
					num4 += 1;
				}
				if(resultado == 5){
					num5 += 1;
				}
				if(resultado == 6){
					num6 += 1;
				}
			}	
		}
		System.out.println("\n\tQuantidade de vezes que saiu: ");
		System.out.printf("\nNúmero 1: %d\nNúmero 2: %d\nNúmero 3: %d\nNúmero 4: %d\nNúmero 5: %d\nNúmero 6: %d\n",num1, num2, num3, num4, num5, num6);
	}
}
