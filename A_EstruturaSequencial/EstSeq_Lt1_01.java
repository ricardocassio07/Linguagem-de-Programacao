/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    1. Receba o valor de um dos lados de um quadrado e calcule a sua área.
*/
public class EstSeq_Lt1_01 {
    public static void main(String args[]){
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
        area = (lado * lado);
        JOptionPane.showMessageDialog(null, "A área do quadrado é " + area);
    }
}
