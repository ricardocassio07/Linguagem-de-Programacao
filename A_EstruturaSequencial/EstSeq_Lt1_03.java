/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    3. Receba a base e a altura de um triângulo. Calcule e mostre a sua área:
*/
public class EstSeq_Lt1_03 {
    public static void main(String args[]){
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:"));
        area = ((base * altura)/2);
        JOptionPane.showMessageDialog(null, "A area do triâgulo é " + area);
    }
}
