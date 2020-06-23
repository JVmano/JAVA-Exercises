import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		int valor = 0;
		Scanner va = new Scanner(System.in);	

		System.out.print("Escreva qualquer quantia em R$: ");
		valor = va.nextInt();

		System.out.print(valor / 100 + " notas de R$ 100,00 \n");
		valor = valor % 100;

		System.out.print(valor / 50 + " notas de R$ 50,00 \n");
		valor = valor % 50;
		
		System.out.print(valor / 20 + " notas de R$ 20,00 \n");
		valor = valor % 20;

		System.out.print(valor / 10 + " notas de R$ 10,00 \n");
		valor = valor % 10;

		System.out.print(valor / 5 + " notas de R$ 5,00 \n");
		valor = valor % 5;

		System.out.print(valor / 2 + " notas de R$ 2,00 \n");
		valor = valor % 2;

		System.out.print(valor / 1 + " notas de R$ 1,00 \n");
		valor = valor % 1;
		 
	}
}

