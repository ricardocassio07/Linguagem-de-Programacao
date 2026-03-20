/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Vetores;

import javax.swing.JOptionPane;

/*
    02. Criar e coletar um vetor[100] inteiro e exibir:
        A) O maior e menor valor;
        B) A média dos valores.
    Programador: Cássio
    Data: 19/03/2026
*/

public class vet_Lt02_02 
{
    public static void main(String args[])
    {
        int num;
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
            nums[i] = num;
        }
        
        int[] menorMaior = menorMaior(nums);
        double media = media(nums);
        
        JOptionPane.showMessageDialog(null, "MENOR VALOR = " + menorMaior[0] + "\nMAIOR VALOR = " + menorMaior[1] + "\nMÉDIA = " + media);
    }
    
    static int[] menorMaior(int[] valores)
    {
        int menor = 0, maior = 0;
        int[] resultado = new int[2];
        for (int i = 0; i < 100; i++)
        {
            if ((menor == 0) && (maior == 0))
            {
                menor = maior = valores[i];
            }
            if (valores[i] > maior)
            {
                maior = valores[i];
            }
            if (valores[i] < menor)
            {
                menor = valores[i];
            }
        }
        resultado[0] = menor;
        resultado[1] = maior;
        return resultado;
    }
    
    static double media(int[] valores)
    {
        double soma = 0;
        for (int i = 0; i < 100; i++)
        {
            soma += valores[i];
        }
        return soma/100.0;
    }
}
