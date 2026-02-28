/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import javax.swing.JOptionPane;

/*
   21. Receba quatro notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre
   e mostre a média. Mostre a mensagem de acordo com a média:
        A. Se a média for >= 6.0, exiba "Aprovado";
        B. Se a média for >= 3.0 E < 6.0, exiba "Exame";
        C. Se a média for < 3.0, exiba "Retido".
   Programador: Cássio
   Data: 19/02/2026
*/
public class EstDec_Lt01_21 
{
    public static void main(String args[])
    {
        double n1, n2, n3, n4, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno: "));
        
        media = ((n1 + n2 + n3 + n4) / 4);
        
        if (media >= 0 && media <= 10)
        {
           JOptionPane.showMessageDialog(null, "A média do aluno é " + media);
           if (media >= 6)
           {
               JOptionPane.showMessageDialog(null, "O ALUNO ESTÁ APROVADO");
           }
           else if(media >= 3)
           {
               JOptionPane.showMessageDialog(null, "O ALUNO ESTÁ DE RECUPERAÇÃO");
           }   
           else
           {
               JOptionPane.showMessageDialog(null, "O ALUNO ESTÁ RETIDO");
           }
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "As notas devem ser um valor de 0 a 10!");
        }
    }
}
