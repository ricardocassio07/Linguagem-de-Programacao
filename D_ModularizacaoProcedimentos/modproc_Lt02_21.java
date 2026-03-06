/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import javax.swing.JOptionPane;

/*
    21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre
    a mensagem de acordo com a média:
        A. Se a média for >= 6.0 exibir "Aprovado";
        B. Se a média for >= 3.0 E < 6.0 exibir "Exame";
        C. Se a média for < 3.0 exibir "Retido".
*/
public class modproc_Lt02_21 
{
    static double n1, n2, n3, n4, media;
    
    public static void main(String args[])
    {
        boolean valido = false;
        do
        {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N1:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N2:"));
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N3:"));
            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N4:"));
            
            if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10 || n4 < 0 || n4 > 10) 
            {
                JOptionPane.showMessageDialog(null, "DADOS INVÁLIDOS!");
            }   
            else
            {
                valido = true;
            }
        }
        while(valido == false);
        
        calcular();
        
        JOptionPane.showMessageDialog(null, "MÉDIA = " + media);
        
    }
    
    static void calcular()
    {
        media = ((n1 + n2 + n3 + n4) / 4);
        if (media >= 6)
        {
            JOptionPane.showMessageDialog(null, "O aluno está APROVADO!");
        }
        else if (media <= 3 && media < 6)
        {
            JOptionPane.showMessageDialog(null, "O aluno deve fazer o EXAME!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O aluno está REPROVADO!");
        }
    }
}
