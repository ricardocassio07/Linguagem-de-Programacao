/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    24. Receba um valor inteiro. Verifique e mostre se o número é divisível por 2 e 3.
    Programador: Cássio
    Data: 05/03/2026
*/

public class modproc_Lt02_24 
{
    static int x;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        x = scan.nextInt();
        
        calcular();
        
        scan.close();
        
    }
    
    static void calcular()
    {
        if ((x % 2 == 0) && (x % 3 == 0))
        {
            System.out.println("O numero e divisivel por 2 e 3!");
        }
        else
        {
            System.out.println("O numero nao e divisivel por 2 e 3!");
        }
    }
}
