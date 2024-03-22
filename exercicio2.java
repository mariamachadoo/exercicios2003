package exercicios2003;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
	int numero;
	System.out.println("Digite o número do dia da semana:");
	numero = ler.nextInt();
	
	if (numero == 1) {
		System.out.println("O dia da semana é domingo");
		
				}
	if (numero == 2){
		System.out.println("O dia da semana é segunda");
		
				}
	if (numero == 3){
		System.out.println("O dia da semana é terça");
		
				}
	if (numero == 4){
		System.out.println("O dia da semana é quarta");
		
				}
	if (numero == 5) {
		System.out.println("O dia da semana é quinta");
		
				}
	if (numero == 6) {
		System.out.println("O dia da semana é sexta");
		
				}
	if (numero == 7){
		System.out.println("O dia da semana é sábado");
		
				}
}
}
