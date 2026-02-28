/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;

/*
   23. Receba três valores obrigatoriamente em ordem crescente e um quarto valor não necessariamente em ordem.
   mostre os quatro números em ordem crescente.
   Programador: Cássio
   Data: 19/02/2026
*/
public class EstDec_Lt01_23 
{
    public static void main(String args[])
    {
        double a, b, c, d, temp;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        a = scan.nextDouble();
        
        System.out.println("Digite outro número:");
        b = scan.nextDouble();
        
        System.out.println("Digite outro número:");
        c = scan.nextDouble();
        
        System.out.println("Digite outro número:");
        d = scan.nextDouble();
        
        if ((b > a) && (c > b))
        {
            if (d < a)
            {
                temp = a;
                a = d;
                d = temp;
            }
            else if (d < b)
            {
                temp = b;
                b = d;
                d = temp;  
            }
            else if (c < d)
            {
                temp = c;
                c = d;
                d = temp;
            }
            
            System.out.println(a + ", " + b + ", " + c + ", " + d);
        }
        else
        {
            System.out.println("VALORES INVALIDOS");
        }
    }
}
