/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
   19. Receba dois valores reais. Calcule e mostre o maior deles.
   Programador: Cássio
   Data: 19/02/2026
*/
public class modfun_Lt02_19 
{
    public static void main(String args[])
    {
        double a, b, maior;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real:"));
        
        maior = calcular(a, b);
        
        JOptionPane.showMessageDialog(null, "O maior número digitado foi o número " + maior);
    }
    
    static double calcular(double x, double y)
    {
        if (x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}
