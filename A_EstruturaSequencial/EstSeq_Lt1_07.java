/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
    7. Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre
    seu volume.
*/
public class EstSeq_Lt1_07 {
    public static void main(String args[]){
        double C, L, A, V;
        
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento da figura:"));
        L = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura da figura:"));
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura da figura:"));
        
        V = (C * L * A);
        
        JOptionPane.showMessageDialog(null, "O volume total desse paralelepípedo é " + V);
    }
}
