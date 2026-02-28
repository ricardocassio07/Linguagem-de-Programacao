/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.util.Scanner;

/*
    38. Receba 100 números inteiros, verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_38 
{
    public static void main(String args[])
    {
        int num, maior = 0, menor = 0;
        Scanner scan = new Scanner(System.in);
        int i = 0;
        boolean primeiro = true;
        while (i < 100)
        {
            System.out.println("Digite um número inteiro:");
            num = scan.nextInt();
            
            if (num > 0)
            {
                if (primeiro)
                {
                    maior = num;
                    menor = num;
                    primeiro = false;
                }
                
                if (num > maior)
                {
                    maior = num;
                }
                
                if (num < menor)
                {
                    menor = num;
                }
                
                i++;
            }
            
        }
        
        System.out.println("maior = " + maior + "\nmenor = " + menor);
        
        scan.close();
    }
}
