/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Vetores;

import javax.swing.JOptionPane;

/*
    05. Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
        ¹⁰∑i=1 (A[1] - A[21 - 1])
    Programador: Cássio
    Data: 19/03/2026
*/

public class vet_Lt02_05 
{
    public static void main(String args[])
    {
        int num;
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++)
        {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número inteiro:"));
        }
        int somatoria = somatoria(nums);
        JOptionPane.showMessageDialog(null, "∑ = " + somatoria);
    }
    
    public static int somatoria(int[] nums)
    {
        int resultado = 0;
        for (int i = 0; i < 10; i++)
        {
            resultado += (nums[i] - nums[(19 - i)]);
        }
        return resultado;
    }
}
