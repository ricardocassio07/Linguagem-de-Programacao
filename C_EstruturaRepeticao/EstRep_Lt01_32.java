/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import javax.swing.JOptionPane;

/*
    32. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
    Programador: Cássio
    Data: 26/02/2026
*/
public class EstRep_Lt01_32 
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        double resultado = 0;
        for (int i = 1; i <= num; i++)
        {
            resultado += (1.0/i);
        }
        JOptionPane.showMessageDialog(null, "A série resultará em " + resultado
        );
    }
}
