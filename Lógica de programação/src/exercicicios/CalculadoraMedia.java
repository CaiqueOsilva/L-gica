package exercicicios;
/**
 * @author Caique Oliveira
 */
import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		//variaveis
		String nome;
		double nota1,nota2,media;
		//objetos
	     Scanner teclado = new Scanner(System.in);
	     System.out.print("Digite o seu nome: ");
	   //Entrada
	     nome = teclado.nextLine();
	     System.out.print("Digite a nota1: ");
	     nota1 = teclado.nextDouble();
	     System.out.print("Digite a nota2: ");
	     nota2 = teclado.nextDouble();
	     //processamento
	     media = (nota1 + nota2) / 2;
	     //saida
	     System.out.println("====================");
	     System.out.println("");
	     System.out.println("== C�uculo da Media ==");
	     System.out.println("");
	     System.out.println("Nome:" + nome);
	     System.out.println("M�dia:" + media);
	     teclado.close();
	}

} 
