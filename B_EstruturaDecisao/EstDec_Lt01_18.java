/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import javax.swing.JOptionPane;

/**
   18. Receba dois valores inteiros. Calcule e mostre o resultdo da diferença do maior pelo menor.
   Programador: Cássio
   Data: 19/02/2026
 */
public class EstDec_Lt01_18 
{
    public static void main(String args[])
    {
        int a, b, diferenca;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
        
        if (a > b)
        {
            diferenca = (a - b);
        } 
        else
        {
            diferenca = (b - a);
        }
        
        JOptionPane.showMessageDialog(null, "A diferença entre " + a + " e " + b + " é igual a " + diferenca);
    }
}
