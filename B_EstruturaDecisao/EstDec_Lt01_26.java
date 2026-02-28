/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;

/*
   # 26: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
   Programador: Cássio
   Data: 20/02/2026
*/
public class EstDec_Lt01_26 
{
    public static <T> void print(T arg)
    {
        System.out.println(arg);
    }
    public static void main(String args[])
    {
        int x, y;
        
        Scanner scan = new Scanner(System.in);
        
        print("Digite um numero inteiro:");
        x = scan.nextInt();
        print("Digite outro numero inteiro:");
        y = scan.nextInt();
        
        if (x > y)
        {
            if (x % y == 0)
            {
                print("O numero " + x + " e multiplo de " + y + "!");
            }
            else
            {
                print("O numero " + x + " nao e multiplo de " + y + "!");
            }
        }
        else
        {
            if (y % x == 0)
            {
                print("O numero " + y + " e multiplo de " + x + "!");
            }
            else
            {
                print("O numero " + y + " nao e multiplo de " + x + "!");
            }
            
        }
        
    }
}
