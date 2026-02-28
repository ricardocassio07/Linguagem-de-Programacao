/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

/*
    45. Calcule e mostre a série 1 - 2/4 + 3/9 - 4/16 + 5/25 + ... + 15/225.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_45 
{
    public static void main(String args[])
    {
        double resultado = 0;
        
        for (int i = 1; i <= 15; i++)
        {
            // Se i for ímpar, soma. Se for par, subtrai.
            if (i % 2 != 0)
            {
                resultado += (1.0 / i);
            }
            else
            {
                resultado -= (1.0 / i);
            }
        }
        
        System.out.printf("O resultado da série é: %.4f%n", resultado);
    }
}
