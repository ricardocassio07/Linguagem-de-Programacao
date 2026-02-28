/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    2. Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/
public class EstSeq_Lt1_02 {
    public static void main(String args[]){
        double salario, salarioReajustado;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário:"));
        salarioReajustado = (salario * 1.15);
        JOptionPane.showMessageDialog(null, "O valor do salário com reajuste é " + salarioReajustado);
    }
}
