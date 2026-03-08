/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
   21. Receba quatro notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre
   e mostre a média. Mostre a mensagem de acordo com a média:
        A. Se a média for >= 6.0, exiba "Aprovado";
        B. Se a média for >= 3.0 E < 6.0, exiba "Exame";
        C. Se a média for < 3.0, exiba "Retido".
   Programador: Cássio
   Data: 08/03/2026
*/
public class modfun_Lt02_21 
{
    public static void main(String args[])
    {
        double N1, N2, N3, N4;
        do
        {
            N1 = Double.parseDouble(JOptionPane.showInputDialog("N1:"));
            N2 = Double.parseDouble(JOptionPane.showInputDialog("N2:"));
            N3 = Double.parseDouble(JOptionPane.showInputDialog("N3:"));
            N4 = Double.parseDouble(JOptionPane.showInputDialog("N4:"));
        }
        while(N1 < 0 || N1 > 10 || N2 < 0 || N2 > 10 || N3 < 0 || N3 > 10 || N4 < 0 || N4 > 10);
        
        double media = calcular(N1, N2, N3, N4);
        
        if (media > 6.0)
        {
            JOptionPane.showMessageDialog(null, "O aluno está APROVADO!");
        }
        else if (media >= 3.0)
        {
            JOptionPane.showMessageDialog(null, "O aluno fará o EXAME!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O aluno está RETIDO!");
        }
        
        JOptionPane.showMessageDialog(null, "MEDIA: " + media);
    }
    
    static double calcular(double n1, double n2, double n3, double n4)
    {
        return ((n1 + n2 + n3 + n4) / 4);
    }
} 
