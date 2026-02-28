/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import javax.swing.JOptionPane;

/*
   20. Receba três coeficientes A, B e C de uma equação do 2º grau, cuja a fórmula é Ax² + Bx + C. Verifique e mostre a existência de
   raízes reais e se caso exista, calcule e mostre.
   Programador: Cássio
   Data: 19/02/2026
*/
public class EstDec_Lt01_20 
{
    public static void main(String args[])
    {
        double A, B, C, delta, x1, x2;
        JOptionPane.showMessageDialog(null, "Dada a fórmula: Ax² + Bx + C");
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente C: "));   
        
        if (A != 0)
        {
            delta = ((Math.pow(B, 2)) - (4 * (A) * (C)));
            
            if (delta >= 0)
            {
                x1 = ((-(B) + (Math.sqrt(delta))) / (2 * (A)));
                x2 = ((-(B) - (Math.sqrt(delta))) / (2 * (A)));
                
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + " x2 = " + x2);
            } else
            {
                JOptionPane.showMessageDialog(null, "A EQUAÇÃO RESULTARÁ EM RAÍZES NÃO REAIS!");
            }
            
        } else
        {
            JOptionPane.showMessageDialog(null, "O coeficiente A não pode ser igual a 0 (zero)!");
        }   
    }
}
