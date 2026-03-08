/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
    20. Receba três coeficientes A, B e C de uma equação do 2º grau, cuja fórmula é Ax² + Bx + C. Verifique e mostre a existência de
    raízes reais e, se caso exista, calcule e mostre,
    Programador: Cássio
    Data: 08/03/2026
*/
public class modfun_Lt02_20 
{
    public static void main(String args[])
    {
        double A, B, C;
        JOptionPane.showMessageDialog(null, "Dada a fórmula: Ax² + Bx + C");
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente A:"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente B:"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente C:"));
        
        if (A != 0)
        {
            double[] resultados = calcular(A, B, C);
            
            if (resultados == null)
            {
                JOptionPane.showMessageDialog(null, "A EQUAÇÃO RESULTARÁ EM RAÍZES NÃO REAIS!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "x1 = " + resultados[0] + " x2 = " + resultados[1]);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O coeficiente A não pode ser igual a 0 (zero)!");
        }
    }
    
    static double[] calcular(double A, double B, double C)
    {
        double delta = (Math.pow(B, 2) - (4 * (A) * (C)));
        
        if (delta >= 0)
        {
            double x1 = (((-(B)) + (Math.sqrt(delta)) / (2 * (A))));
            double x2 = (((-(B)) - (Math.sqrt(delta)) / (2 * (A))));
            double[] resultados = new double[2];
            resultados[0] = x1;
            resultados[1] = x2;
            return resultados;
        }
        else
        {
            return null;
        }
        
    }
    
}
