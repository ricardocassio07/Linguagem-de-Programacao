/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_Matrizes;

import java.math.BigInteger;

/*
    03. Criar um programa matriz |8||8| onde o programa irá carregar segundo:
        |Casa | 1| 2| 3| 4| ...| *Exibir a soma 
        |Valor| 1| 2| 4| 8| ...| dos valores
    Programador: Cássio
    Data: 21/03/2026
*/

public class mat_Lt02_03 
{
    public static void main(String args[])
    {
        BigInteger soma = carregarMatriz();
        System.out.println("Soma dos termos: " + soma);
    }
    
    public static BigInteger carregarMatriz()
    {
        BigInteger numAtual = BigInteger.ONE, soma = BigInteger.ZERO;
        int expoente = 0;
        for (int i = 0; i < 8; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 8; j++)
            {
                soma = soma.add(numAtual);
                System.out.print(numAtual + "| ");
                
                numAtual = numAtual.multiply(BigInteger.valueOf(2));
                expoente++;
            }
            System.out.println();
        }
        return soma;
    }
    
    /*
    public static void main(String args[])
    {
        long soma = carregarMatriz();
        System.out.println("Soma dos termos: " + soma);
    }
    
    public static long carregarMatriz()
    {
        long numAtual = 0, soma = 0;
        int expoente = 0;
        for (int i = 0; i < 8; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 8; j++)
            {
                numAtual = (long) Math.pow(2, expoente);
                soma += numAtual;
                System.out.print(numAtual);
                System.out.print("| ");
                expoente++;
            }
            System.out.println();
        }
        return soma;
    }
    
    */
}
