/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import javax.swing.JOptionPane;

/*
    33. Receba um número inteiro. Calcule e mostre a seu fatorial;
    Programador: Cássio
    Data: 26/02/2026
*/
public class EstRep_Lt01_33 
{
    public  static void main(String args[])
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        if (num == 1 || num == 0)
        {
            JOptionPane.showMessageDialog(null, num + "! = 1");
            
        }
        else if (num > 1)
        {
            int resultado = 1;
            for (int i = num; i > 1; i--)
            {
                resultado *= i;
            }
            JOptionPane.showMessageDialog(null, num + "! = " + resultado);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O número deve ser maior que zero!");
        }
    }
}
