/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import java.util.Scanner;

/*
    30. Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos,
    meses e dias, considerando os anos bissextos e quantidade exata de dias de cada mês.
    Programador: Cássio
    Data: 14/03/2026
*/
public class modfun_Lt02_30 
{
    public static void main(String args[])
    {
        int diaNas, mesNas, anoNas;
        int diaAtual, mesAtual, anoAtual;
        
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Dia de Nascimento:");
            diaNas = scan.nextInt();
        }
        while(diaNas < 0);
        do
        {
            System.out.println("Mes de Nascimento:");
            mesNas = scan.nextInt();
        }
        while(mesNas < 0);
        do
        {
            System.out.println("Ano de Nascimento:");
            anoNas = scan.nextInt();
        }
        while(anoNas < 0);
        do
        {
            System.out.println("Dia Atual:");
            diaAtual = scan.nextInt();
        }
        while(diaAtual < 0);
        do
        {
            System.out.println("Mes Atual:");
            mesAtual = scan.nextInt();
        }
        while(mesAtual < 0);
        do
        {
            System.out.println("Ano Atual:");
            anoAtual = scan.nextInt();
        }
        while(anoAtual < 0);
        
        if ((anoAtual > anoNas)
             ||
             ((anoAtual == anoNas) && (mesAtual > mesNas))
             ||
             ((anoAtual == anoNas) && (mesAtual == mesNas) && (diaAtual >= diaNas)))
        {
            int[] resultado = calcular(diaNas, mesNas, anoNas, diaAtual, mesAtual, anoAtual);
            System.out.println("Idade:\n"
                    + resultado[0] + " anos\n" 
                    + resultado[1] + " meses\n"
                    + resultado[2] + " dias");
        }
        else
        {
            System.out.println("DADOS INVALIDOS!");
        }
    }
    
    public static int[] calcular(int diaNas, int mesNas, int anoNas, int diaAtual, int mesAtual, int anoAtual)
    {
        // Ajustar de dias:
        if (diaAtual < diaNas)
        {
            mesAtual--;
            
            if (mesAtual == 0)
            {
                mesAtual = 12;
                anoAtual--;
            }
            
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
        if (mesAtual < mesNas)
        {
            anoAtual--;
            mesAtual += 12;
        }
        
        int idadeDias = (diaAtual - diaNas);
        int idadeMeses = (mesAtual - mesNas);
        int idadeAnos = (anoAtual - anoNas);
        
        int[] resultado = new int[3];
        resultado[0] = idadeAnos;
        resultado[1] = idadeMeses;
        resultado[2] = idadeDias;
        
        return resultado;
    }
}
