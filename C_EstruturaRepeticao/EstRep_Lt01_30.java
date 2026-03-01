/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import javax.swing.JOptionPane;

/*
    30. Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos,
    meses e dias, considerando os anos bissextos e quantidade exata de dias de cada mês.
    Programador: Cássio
    Data: 26/02/2026
*/
public class EstRep_Lt01_30 
{
    public static void main(String args[])
    {
        int diaNas, mesNas, anoNas;
        int diaAtual, mesAtual, anoAtual;
        
        do
        {
            diaNas = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento: "));
        }
        while(diaNas < 0);
        do
        {
            mesNas = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento"));
        }
        while(mesNas < 0);
        do
        {
           anoNas = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:")); 
        }
        while(anoNas < 0);
        
        do
        {
            diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Dia atual:"));
        }
        while(diaAtual < 0);
        do
        {
            mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Mês atual:"));
        }
        while(mesAtual < 0);
        do
        {
            anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Ano atual:"));
        }
        while(anoAtual < 0);
        
        
        if ((anoAtual > anoNas) 
           || 
           ((anoAtual == anoNas) && (mesAtual > mesNas)) 
           || 
           ((anoAtual == anoNas) && (mesAtual == mesNas) && (diaAtual >= diaNas)))
        {
            // Ajustar de dias:
            if (diaAtual < diaNas)
            {
                mesAtual--;
                int diasMesAnterior;
                
                // Descobre dias do mês anterior:
                if (mesAtual == 2)
                {
                    if ((anoAtual % 4 == 0) && (anoAtual % 100 != 0 || anoAtual % 400 == 0))
                    {
                        diasMesAnterior = 29;
                    }
                    else
                    {
                        diasMesAnterior = 28;
                    }
                }
                else if (mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11)
                {
                    diasMesAnterior = 30;
                }
                else
                {
                    diasMesAnterior = 31;
                }
                
                diaAtual += diasMesAnterior;
            }
            
            // Ajuste de meses:
            if (mesAtual < mesAtual)
            {
                anoAtual--;
                mesAtual += 12;
            }
            
            int idadeDias = (diaAtual - diaNas);
            int idadeMeses = (mesAtual - mesNas);
            int idadeAnos = (anoAtual - anoNas);
            
            JOptionPane.showMessageDialog(null,
                "Idade:\n" +
                idadeAnos + " anos\n" +
                idadeMeses + " meses\n" +
                idadeDias + " dias"
            );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "DADOS INVÁLIDOS!");
        }
    }
}
