package exercicios2003;

import java.util.Scanner;

public class primeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um valor:");
		numero = ler.nextInt();
		
		if (numero >= 10) {
			System.out.println("O número é maior que 10");
		}
		else {
			System.out.println("O número é menor que 10");
		}
	}

}
