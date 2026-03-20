/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Vetores;

import javax.swing.JOptionPane;

/*
    03. Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3° vetor (VT3[6]) e mostre
    os seus dados. VT1 |1|2|3| VT2 |4|5|6| VT3 |1|2|3|4|5|6|
    Programador: Cássio
    Data: 19/03/2026
*/

public class vet_Lt02_03 
{
    public static void main(String args[])
    {   
        int num = 0;
        int[] VT1 = new int[3];
        for (int i = 0; i < 3; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número de VT1:"));
            VT1[i] = num;
        }
        
        int[] VT2 = new int[3];
        for (int i = 0; i < 3; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número de VT2:"));
            VT2[i] = num;
        }
        
        int[] VT3 = concatenar(VT1, VT2);
        
        JOptionPane.showMessageDialog(null, "VT3 = [" + VT3[0] + ", " + VT3[1] + ", " + VT3[2] + ", " + VT3[3] + ", "
         + VT3[4] + ", " + VT3[5] + "]");
    }
    
    public static int[] concatenar(int[] vetor1, int[] vetor2)
    {
        int[] vetor3 = new int[6];
        for (int i = 0; i < 6; i++)
        {
            if (i >= 3)
            {
                vetor3[i] = vetor2[(i - 3)];
            }
            else
            {
                vetor3[i] = vetor1[i];
            }
        }
        return vetor3;
    }
}
