package G_Vetores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/*
    01. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
        a) A média dos valores entre 10 e 20.
        b) A soma dos números ímpares.
    Programador: Cássio
    Data: 19/03/2026
*/

public class vet_Lt02_01 
{
    public static void main(String args[])
    {
        int num;
        int[] nums = new int[50];
        
        for (int i=0; i < 50; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
            nums[i] = num;
        }
        
        double media = media(nums);
        int soma = soma(nums);
        
        JOptionPane.showMessageDialog(null, "MÉDIA = " + media + "\nSOMA DOS ÍMPARES = " + soma);
    }

    static double media(int[] valores)
    {
        double soma = 0;
        for (int i = 0; i < 50; i++)
        {
            soma += valores[i];
        }
        return soma/50.0;
    }
    
    static int soma(int[] valores)
    {
        int soma = 0;
        for (int i = 0; i < 50; i++)
        {
            if (valores[i] % 2 != 0)
            {
                soma += valores[i];
            }
        }
        return soma;
    }
}
