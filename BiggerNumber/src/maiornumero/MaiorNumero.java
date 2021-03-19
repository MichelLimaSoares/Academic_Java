
package maiornumero;

import java.util.Scanner;

/**
 *
 * @author Michel
 * This program identifies the largest number between two 
 * variables
 * Este programa identifica o maior número entre duas
 * variáveis
 */
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner entrada;
        int n1;
        int n2;
        
        // starting scanner to receive user data
        // iniciando scanner para receber dados do usuário
        entrada = new Scanner(System.in);

        //Entrada dos dados
        System.out.println("Primeiro numero:");
        n1 = entrada.nextInt();
        System.out.println("Segundo numero:");
        n2 = entrada.nextInt();
        
        // Checking which is the largest number reported
        // Verificando qual é o maior dos números informados
        if (n1 > n2){
            // data output
            // saida de dados
            System.out.printf("O numero " + n1 + " é maior");}
        else{
            
            // Checking which is the largest number reported
            // Verificando qual é o maior dos números informados
            if(n2 > n1){
                // data output
                // saida de dados
                System.out.println("O numero " + n2 + " é maior");}
            
            // Checking which is the largest number reported
            // Verificando qual é o maior dos números informados
            else{
                
                // data output
                // saida de dados
                System.out.println("Os numeros digitados sao iguais");
            }
        }
    
    }
    
}
