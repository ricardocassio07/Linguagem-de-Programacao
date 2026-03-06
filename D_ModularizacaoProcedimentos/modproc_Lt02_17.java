/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import javax.swing.JOptionPane;

/*
    17. Calcule a quatidade de litros gastos em uma viagem, sabendo que o automóvel faz 12km/l.
    Receber o tempo de percuso e a velocidade média.
    Programador: Cássio
    Data: 05/03/2026
*/

public class modproc_Lt02_17 
{
    static int d, t, vm, L;
    public static void main(String args[])
    {
        t = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo total do percurso em horas:"));
        vm = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média da viagem em km/h:"));
        
        calcular();
        
        JOptionPane.showMessageDialog(null, "Foram gastos " + L + " litros!");
        
    }
    
    static void calcular() 
    {
        d = (vm/t);
        L = (d/12);
    }
}
