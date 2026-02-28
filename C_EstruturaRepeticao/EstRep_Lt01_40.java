/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.util.Scanner;

/*
    40. Receba 2 números inteiros. Verifique e mostre todos os números
    primos existentes entre eles.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_40 
{
    public static void main(String args[])
    {
        int x, y, menor, maior;
        boolean verdadeiro;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        x = scan.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        y = scan.nextInt();
        
        if (x > y)
        {
            menor = y;
            maior = x;
        }
        else
        {
            menor = x;
            maior = y;
        }
        
        do
        {
            verdadeiro = false;
            menor++;
            
            for (int i = 2; i < menor; i++)
            {
                if ((menor % i) == 0)
                {
                    verdadeiro = true;
                }
            }
            
            if (!verdadeiro)
            {
                System.out.println(menor);
            }
        }
        while(menor < maior);
        
        scan.close();
    }
}
