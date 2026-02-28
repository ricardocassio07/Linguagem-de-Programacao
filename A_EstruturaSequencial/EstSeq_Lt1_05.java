/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    5. Receba os coeficientes A, B e C de uma equação do segundo grau (ax² + bx + c). Calcule e
    mostre as raízes reais (considerar que a equação possui duas raízes).
*/
public class EstSeq_Lt1_05 {
    public static void main(String args[]){
        double A, B, C, x1, x2, delta;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente A:"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente B:"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente C:"));
        
        if (A > 0){
            delta = ((B * B) - (4 * (A) * (C)));

            if (delta < 0){
                JOptionPane.showMessageDialog(null, "Não existem raízes reais para essa equação!");
            } else{
                x1 = ((-(B) + Math.sqrt(delta))/(2 * (A)));
                x2 = ((-(B) - Math.sqrt(delta))/(2 * (A)));
                JOptionPane.showMessageDialog(null, "X1= " + x1 + " X2= " + x2);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Isso não é uma equação do segundo grau!");
        }
    }
}
