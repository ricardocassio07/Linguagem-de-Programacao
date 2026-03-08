/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
   23. Receba três valores obrigatoriamente em ordem crescente e um quarto valor não necessariamente em ordem.
   mostre os quatro números em ordem crescente.
   Programador: Cássio
   Data: 08/03/2026
*/
public class modfun_Lt02_23 
{
    public static void main(String args[])
    {
        double a, b, c, d;
        
        do
        {
            JOptionPane.showMessageDialog(null, "Digite três números em ordem crescente:");
            a = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número:"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Segundo número:"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Terceiro número:"));
        }
        while((a > b) || (b > c));
        
        d = Double.parseDouble(JOptionPane.showInputDialog("Agora digite um número qualquer:"));
        
        double[] n = ordenar(a, b, c, d);
        
        JOptionPane.showMessageDialog(null, "[" + n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + "]");
    }
    
    static double[] ordenar(double w, double x, double y, double z)
    {
        double[] L = new double[4];
        if (z < w)
        {
            L[0] = z;
            L[1] = w;
            L[2] = x;
            L[3] = y;
        }
        else if (z < x)
        {
            L[0] = w;
            L[1] = z;
            L[2] = x;
            L[3] = y;
        }
        else if (z < y)
        {
            L[0] = w;
            L[1] = x;
            L[2] = z;
            L[3] = y;
        }
        else
        {
            L[0] = w;
            L[1] = x;
            L[2] = y;
            L[3] = z;
        }
        
        return L;
    }
}
