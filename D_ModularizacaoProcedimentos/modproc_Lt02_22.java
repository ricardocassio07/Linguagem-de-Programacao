/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import javax.swing.JOptionPane;

/*
    22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
    Programador: Cássio
    Data: 05/03/2026
*/
public class modproc_Lt02_22 
{
    static int x, y;
    
    public static void main(String args[])
    {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        
        calcular();
        
    }
    
    static void calcular()
    {
        if (x > y)
        {
            JOptionPane.showMessageDialog(null, "[" + y + ", " + x + "]");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "[" + x + ", " + y + "]");
        }
    }
}
