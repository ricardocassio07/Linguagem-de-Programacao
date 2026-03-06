/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import javax.swing.JOptionPane;

/*
    19. Receba 2 valores reais. Calcule e mostre o maior deles.
    Programador: Cássio
    Data: 05/03/2026
*/
public class modproc_Lt02_19 
{
    static double x, y;
    
    public static void main(String args[])
    {
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("DIgite outro número real:"));
        
        calcular();
    }
    
    static void calcular()
    {
        if (x > y)
        {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi " + x);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi " + y);
        }
    }
}
