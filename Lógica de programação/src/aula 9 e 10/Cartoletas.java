
/**
 * @author klaus
 *
 */
package exercicicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cartoletas {

	public static void main(String[] args) {
		// vari�veis
		        int jogador;
		        
				double pre�o,media,valor = 0;
				// objetos
				Scanner teclado = new Scanner(System.in);
				DecimalFormat formatador = new DecimalFormat("#00.00");
				// Entrada
				System.out.println("== PARA GANHAR CARTOLETAS ==");
			    System.out.println("");
			    System.out.print("Digite o pre�o do jogador: ");
				pre�o = teclado.nextDouble();
				System.out.print("Digite a media do jogador: ");
				media = teclado.nextDouble();
				// processamento	
				jogador = (int) (pre�o * (1.2 + valor) - media);
			     //saida
			     System.out.println("====================");
			     System.out.println("");
			     System.out.println("== Pontua�ao do jogador ==");
			     System.out.println("");
			   
			     System.out.println("Jogador: R$  " + formatador.format(jogador));
			    
			  // estrutura de controle condicional
			     if (media >= 0.50 ) {
			    	 System.out.println("Valorizou");
			     } else {
			    	 System.out.println("Desvalorizou");
			     }
			     
			     teclado.close();
			}

		} 

			