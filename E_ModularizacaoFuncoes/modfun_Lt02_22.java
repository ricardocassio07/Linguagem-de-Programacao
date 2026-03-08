/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
   22. Receba dois valores inteiros e diferentes. Mostre seus valores em ordem crescente.
   Programador: Cássio
   Data: 08/03/2026
*/
public class modfun_Lt02_22 
{
    public static void main(String args[])
    {
        int x, y;
        boolean valido = false;
        do
        {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
            if (x != y) {valido = true;}
        }
        while(valido == false);
        
        boolean xMaior = verificar(x, y);
        
        if (xMaior)
        {
            JOptionPane.showMessageDialog(null, "[" + y + ", " + x + "]");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "[" + x + ", " + y + "]");
        }
    }
    
    static boolean verificar(int a, int b)
    {
        if (a > b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
