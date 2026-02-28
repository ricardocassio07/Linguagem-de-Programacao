/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.util.Scanner;

/*
    35. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado
    da somatória.
    Programador: Cássio
    Data: 26/02/2026
*/
public class EstRep_Lt01_35 
{
    public static void main(String args[])
    {
        int n1, n2;
        int  soma = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        n1 = scan.nextInt();
        
        System.out.println("Digite outro numero inteiro:");
        n2 = scan.nextInt();
        
        if (n1 > n2)
        {
            int i = n2;
            while (i < n1)
            {
                soma += i;
            }
        }
        else if(n2 > n1)
        {
            int i = n1;
            while (i < n2)
            {
                soma += i;
            }
        }
        else
        {
            System.out.println("Soma = 0");
        }
        
        System.out.println("Soma = " + soma);
        
    }
}
