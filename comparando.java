package exercicios2003;
import java.util.Scanner;
public class comparando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String palavra1, palavra2;
		
		System.out.println("Informe a primeira palavra:");
		palavra1 = ler.nextLine();
		
		System.out.println("Informe a segunda palavra:");
		palavra2 = ler.nextLine();
		
		if (palavra1.equals (palavra2)){
			System.out.println(" As palavras são iguais");
		}
		else {
			System.out.println(" As palavras são diferentes");
			
		}
	}

}
