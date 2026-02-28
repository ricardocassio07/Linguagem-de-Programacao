/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;

/*
   24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
   Programador: Cássio
   Data: 19/02/2026
*/
public class EstDec_Lt01_24 
{
    public static void main(String args[])
    {
        int x;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        x = scan.nextInt();
        
        if ((x % 2 == 0) && (x % 3 == 0))
        {
            System.out.println("O numero e divisivel por 2 e 3");
        }
        else
        {
            System.out.println("O numero nao e divisivel por 2 e por 3");
        }
    }
}
