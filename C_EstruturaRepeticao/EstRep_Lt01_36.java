/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import javax.swing.JOptionPane;

/*
    36. Receba um número N. Calcule e mostre a série 1 + 1/2! + ... 1/N!
    Programador: Cássio
    Data: 26/02/2026
*/
public class EstRep_Lt01_36 
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int fatorial = 1;
        double resultado = 0;
        
        if (num > 0)
        {
            for (double i = 0; i < num; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    fatorial *= j;
                }
                resultado += 1.0/fatorial;
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
