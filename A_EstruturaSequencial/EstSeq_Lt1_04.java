/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    4. Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida
    em Fahrenheint(F) = ((9 * C + 160)/5)
*/
public class EstSeq_Lt1_04 {
    public static void main(String args[]){
        double F, C;
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius (ºC):"));
        F = ((9 * C + 160)/5);
        JOptionPane.showMessageDialog(null, F + "ºF");
    }
}
