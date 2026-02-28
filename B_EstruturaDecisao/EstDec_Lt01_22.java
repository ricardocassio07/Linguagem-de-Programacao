/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import javax.swing.JOptionPane;

/*
   22. Receba dois valores inteiros e diferentes. Mostre seus valores em ordem crescente.
   Programador: Cássio
   Data: 19/02/2026
*/
public class EstDec_Lt01_22 
{
    public static void main(String args[])
    {
        int a, b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número inteiro: "));
        
        if (a > b)
        {
            JOptionPane.showMessageDialog(null, a + " " + b);
        }
        else
        {
            JOptionPane.showMessageDialog(null, b + " " + a);
        }
    }
}
