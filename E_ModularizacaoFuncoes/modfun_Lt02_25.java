/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import javax.swing.JOptionPane;

/*
   25. Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo 
   é menor que 24 horas e pode começar num dia e terminar no outro.
   Programador: Cássio
   Data: 11/03/2026
*/
public class modfun_Lt02_25 
{
    public static void main(String srgs[])
    {
        int horaInicial, minInicial, horaFinal, minFinal;
        
        boolean valido = false;
        do
        {
            horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Hora de Inicio:"));
            minInicial = Integer.parseInt(JOptionPane.showInputDialog("Minuto inicial:"));
            horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Hora final:"));
            minFinal = Integer.parseInt(JOptionPane.showInputDialog("Minuto final:"));
            
            if (!((horaInicial < 0) || (horaInicial > 23) || (minInicial < 0) || (minInicial > 23) 
              || (horaFinal < 0) || (horaFinal > 23) || (minFinal < 0) || (minFinal > 23)))
            {
                valido = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "DADOS INVÁLIDOS!");
            }
        }
        while(valido == false);
        
        String resultado = calcular(horaInicial, minInicial, horaFinal, minFinal);
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    static String calcular(int horaInicial, int minInicial, int horaFinal, int minFinal)
    {
        int inicio = ((horaInicial * 60) + minInicial);
        int fim = ((horaFinal * 60) + minFinal);
        
        int duracao = (fim - inicio);
        
        if (duracao < 0)
        {
            duracao += (24 * 60);
        }
        
        if ((duracao == 0) || (duracao == 24))
        {
            return ("A partida deve durar mais que 0 e menos que 24 horas!");
        }
        else
        {
            int horas = (duracao / 60);
            int minutos = (duracao % 60);
            return ("A partida durou " + horas + " horas e " + minutos + " minutos!");
        }
    }
}
