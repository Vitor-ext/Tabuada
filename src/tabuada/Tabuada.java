/**
 *
 * @author Vitor de Jesus ❣🚀❣
 *
 */

package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int multiplicando, iniMultiplicador, finMultiplicador, valor1, valor2, produto;

        System.out.println("**********************************");
        System.out.println("*             TABUADA            *");
        System.out.println("**********************************");
        System.out.println("");

        System.out.print(" Informe seu Nome: ");
        String nome = teclado.nextLine();
        System.out.println("");

        System.out.println("Olá " + nome + " Seja bem vindo!");
        System.out.println("");

        System.out.print(" Informe o multiplicando:");
        multiplicando = teclado.nextInt();
        System.out.println(" Certo ! ");

        System.out.print(" Informe o valor inicial da Tabuada multiplicador:");
        valor1 = teclado.nextInt();
        System.out.println(" Certo ! ");

        System.out.print(" Informe o valor final da Tabuada multiplicador:");
        valor2 = teclado.nextInt();
        System.out.println(" Certo ! ");
        
        
        if(valor1 < valor2){
            iniMultiplicador = valor1;
            finMultiplicador = valor2;
        }
        else {
            finMultiplicador = valor1;
            iniMultiplicador = valor2;
        }
        while (iniMultiplicador <= finMultiplicador) {
            produto = multiplicando * iniMultiplicador;
            System.out.println(multiplicando + " X " + iniMultiplicador + " = " + produto);
            iniMultiplicador++;
        }

    }

}
