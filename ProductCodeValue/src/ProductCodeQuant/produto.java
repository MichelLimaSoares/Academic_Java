
package ProductCodeQuant;

/**
 *
 * @author Michel
 * 
 * //program that receives the product code and its quantity, 
 * returning the total value
 * //programa que recebe o codigo do produto e sua quantidade, 
 * retornando o valor total
 * 
 */

// Import class Scanner
// Importe de classe Scanner
import java.util.Scanner;

// Starting Product class
// Iniciando classe Produto
public class produto {
    
// Import class Scanner
// Importe de classe Scanner
private static Scanner input;

    
    public static void main(String[] args) {
        
        // Product code and values
        // Codigo do produto e valores
        System.out.println("----------Tabela de produtos----------");
        System.out.println("| Código do produto | Preço unitário |");
        System.out.println("|-------------------|----------------|");
        System.out.println("|       1001        |     R$5,32     |");
        System.out.println("|       1002        |     R$6,45     |");
        System.out.println("|       1003        |     R$2,37     |");
        System.out.println("|       1004        |     R$5,32     |");
        System.out.println("|       1005        |     R$6,45     |");
        System.out.println("|       0           |     Sair       |");
        System.out.println("|-------------------|----------------|\n");

        // Declaring variables
        // Declarando variaveis
        input = new Scanner(System.in);
        System.out.println("|---  Digite o código do produto: ---|\n");
        System.out.println("|-------------------|----------------|\n");
        int code = input.nextInt(), qtde;
        double preco = 0, total = 0;
        
        // Receiving typed code
        // Recebendo codigo digitado
        switch (code) {
            case 1001:
                preco = 5.32;
                break;
            case 1002:
                preco = 6.45;
                break;
            case 1003:
                preco = 2.37;
                break;
            case 1004:
                preco = 5.32;
                break;
            case 1005:
                preco = 6.45;
                break;
            case 0:
                break;
            default:
                code = 1;
        }
              
        // Receiving quantity and Processing for outbound
        // Recebendo quantidade e Processando para saida
        if (code != 1 && code != 0) {
            System.out.println("|-------------------|----------------|\n");
            System.out.println("|---      Digite a quantidade:    ---|\n");
            System.out.println("|-------------------|----------------|\n");
            qtde = input.nextInt();
            total += preco * qtde;

        } else if (code == 0) {
            System.out.println("|-------------------|----------------|\n");
            System.out.println("|---             Saindo...        ---|\n");
            System.out.println("|-------------------|----------------|\n");
            
        } else {
            System.out.println("|-------------------|----------------|\n");
            System.out.println("|---         Código inválido.     ---|\n");
            System.out.println("|-------------------|----------------|\n");
        }
        
        // Output, showing total value
        // Saida, mostrando valor total
        System.out.println("|-------------------|----------------|\n");
        System.out.printf("         Preço total: R$%.2f.\n", total);
        System.out.println("\n|-------------------|----------------|");

    } // End main

}// End class




// Future implementations
// Futuras implementações
/*
       
        while (code != 0) {
           System.out.println("Digite o código do produto");
        }

if (code == 1) {
            System.out.println("Alimento não-perecível.");
        } else if (code >= 2 && code <= 4) {
            System.out.println("Alimento perecível.");
        } else if (code >= 5 && code <= 6) {
            System.out.println("Vestuário.");
        } else if (code == 7) {
            System.out.println("Higiene pessoal.");
        } else if (code >= 8 && code <= 15) {
            System.out.println("Limpeza e utensílios domésticos.");
        } else {
            System.out.println("Código inválido.");
        }
*/