/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import javax.swing.JOptionPane;

/*
    6. Receba os valores em "x" e "y". Efetue a troca de seus valores e mostre os seus conteúdos.
*/
public class EstSeq_Lt1_06 {
    public static void main(String args[]){
        double x, y, temp;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para X:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para Y:"));
        
        temp = x;
        x = y;
        y = temp;
        
        JOptionPane.showMessageDialog(null, "X= " + x + " Y= " + y);
    }
}
