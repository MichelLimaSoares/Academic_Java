/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  import java.util.Scanner;

/**
 *
 * @author Michel
 */
//public class MultiplicationTableJava {
//    
//
//    public static void main(String[] args){
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Digite um número para fazer a tabuada multiplicando de 1 até 10");
//        int n = in.nextInt();
//        System.out.println("");
//        {
//        for(int y = 0; y <= 10; y++)
//        System.out.println(" > "+n+" X "+y+" = "+n*y+" < ");
//
//        }
//
//    }
//
//}

public class MultiplicationTableJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Digite um número para fazer a tabuada multiplicando de 1 até 10: \n");
            int n = in.nextInt();

            System.out.println("\n" + "Tabuada do " + n + ":\n");

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}
    


    /*   public static void main (String args[]){
   
            int cont1, cont2, tab;
            cont1 = 1; cont2 = 1;
         
            while (cont1 <= 10)
            {
                while (cont2 <= 10)
                {
                    tab = cont1 * cont2;
                    System.out.println(cont1 + " x " + cont2 + " = " + tab);
                    cont2 = cont2 + 1;
                }
            cont2 = 1;
            cont1 = cont1 + 1;
            }
   
    }
    
}*/



    