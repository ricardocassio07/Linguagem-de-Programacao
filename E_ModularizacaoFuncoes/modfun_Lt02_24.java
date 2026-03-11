/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
   24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
   Programador: Cássio
   Data: 11/03/2026
*/
public class modfun_Lt02_24 
{
    public static void main(String args[])
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        if (calcular(x))
        {
            JOptionPane.showMessageDialog(null, "O número " + x + " é divísivel por 2 e 3!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O número " + x + " não é divísivel por 2 e 3!");
        }
    }
    
    static boolean calcular(int num)
    {
        if ((num % 2 == 0) && (num % 3 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
