/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import javax.swing.JOptionPane;

/*
   19. Receba dois valores reais. Calcule e mostre o maior deles.
   Programador: Cássio
   Data: 19/02/2026
*/
public class EstDec_Lt01_19 
{
    public static void main(String args[])
    {
        double a, b;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número real: "));
        
        if (a > b)
        {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi " + a);
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi " + b);
        }
    }
}
