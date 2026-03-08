/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    25. Receba a hora de início e de final de um jogo (HH, MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo
    e menor que 24 horas e pode começar num dia e terminar no outro.
    Programador: Cássio
    Data: 06/03/2026
*/
public class modproc_Lt02_25 
{
    static int horaInicial, minInicial, horaFinal, minFinal;
    
    public static <T> void print(T arg)
    {
        System.out.println(arg);
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        boolean valido = false;
        do 
        {
            print("Hora inicio:");
            horaInicial = scan.nextInt();
            print("Minuto inicial:");
            minInicial = scan.nextInt();
            print("Hora final:");
            horaFinal = scan.nextInt();
            print("Minuto final:");
            minFinal = scan.nextInt();

            if (!(horaInicial < 0 || horaInicial >= 24 || horaFinal < 0 || horaFinal >= 24 || minInicial < 0 || minInicial > 59
                 || minFinal < 0 || minFinal > 59))
            {
                valido = true;
                calcular();
            }
            else
            {
                print("DADOS INVALIDOS!");
            }
        }
        while(valido == false);
        
    }
    
    static void calcular()
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
            print("A partida deve durar mais que ZERO e menos que VINTE E QUATRO horas");
        }
        else
        {
            int horas = (duracao / 60);
            int minutos = (duracao % 60);
            print("A partida durou " + horas + " horas e " + minutos + " minutos!");
        }
    }
}
