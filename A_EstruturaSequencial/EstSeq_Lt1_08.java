/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    8. Receba o valor de um depósito em poupaça. Calcule e mostre o valor após 1 mês de aplicação,
    sabendo que rende 1,3% a.m.
*/
public class EstSeq_Lt1_08 {
    public static void main(String args[]){
        double deposito, valorFinal, c;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        valorFinal = (deposito * 1.13);
        
        JOptionPane.showMessageDialog(null, "O valor após um mês é: R$" + valorFinal);
    }
}
