/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    26. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
    Programador: Cássio
    Data: 07/03/2026
*/
public class modproc_Lt02_26 
{
    static int x, y;
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        x = scan.nextInt();
        
        System.out.println("Digite outro numero inteiro");
        y = scan.nextInt();
        
        calcular();
        
        scan.close();
    }
    
    static void calcular()
    {
        if (x > y)
        {
            if (x % y == 0)
            {
                System.out.println("O numero " + x + " e multiplo de " + y + "!");
            }
            else
            {
                System.out.println("O numero " + x + " nao e multiplo de  " + y + "!");
            }
        }
        else
        {
            if (y % x == 0)
            {
                System.out.println("O numero " + y + " e multiplo de " + x + "!");
            }
            else
            {
                System.out.println("O numero " + y + " nao e multiplo de " + x + "!");
            }
        }
    }
}
