/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import javax.swing.JOptionPane;

/*
    20. Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula Ax² + Bx + C = 0. 
    Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
    Data: 05/03/2026
    Programador: Cássio
*/

public class modproc_Lt02_20 
{
    static double A, B, C, delta, x1, x2;
    
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null, "Ax² + Bx + C = 0");
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente 'A':"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente 'B':"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente 'C':"));
        
        calcular();
        
    }
    
    static void calcular()
    {   
        if (A != 0)
        {
            delta = ((Math.pow(B, 2)) - (4 * (A) * (C)));

            if (delta >= 0)
            {
                x1 = (((-(B)) - (Math.sqrt(delta))) / (2 * A));
                x2 = (((-(B)) + (Math.sqrt(delta))) / (2 * A));

                JOptionPane.showMessageDialog(null, "x1 = " + x1 + " x2 = " + x2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "A equação não possui raízes reais!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "DADOS INVÁLIDOS!");
        }
    } 
}
