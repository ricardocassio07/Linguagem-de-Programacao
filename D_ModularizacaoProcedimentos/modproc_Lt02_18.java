/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import javax.swing.JOptionPane;

/*
    18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor.
    Programador: Cássio
    Data: 05/03/2026
*/
public class modproc_Lt02_18 
{
    static int x, y, diferenca;
    
    public static void main(String args[])
    {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        
        calcular();
        
    }
    
    static void calcular()
    {
        if(x > y)
        {
            diferenca = (x - y);
            JOptionPane.showMessageDialog(null, "x - y = " + diferenca);
        }
        else
        {
            diferenca = (y - x);
            JOptionPane.showMessageDialog(null, "y - x = " + diferenca);
        }
    }
}
