/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;

/*
   25. Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo 
   é menor que 24 horas e pode começar num dia e terminar no outro.
   Programador: Cássio
   Data: 20/02/2026
*/
public class EstDec_Lt01_25 
{
    public static <T> void print(T arg){
        System.out.println(arg);
    }
    
    public static void main(String args[])
    {
        int horaInicial, minInicial, horaFinal, minFinal;
        
        Scanner scan = new Scanner(System.in);
        
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
            int inicio = ((horaInicial * 60) + minInicial);
            int fim = ((horaFinal * 60) + minFinal);
            
            int duracao = (fim - inicio);
            
            if (duracao < 0)
            {
                duracao += (24 * 60);
            }
            
            if ((duracao == 0) || (duracao == 24))
            {
                print("A partida deve durar mais que 0 e menos que 24 horas.");
            }
            else
            {
                int horas = duracao / 60;
                int minutos = duracao % 60;
                print("A partida durou " + horas + " horas e " + minutos + " minutos!");
            }
        }
        else
        {
            print("DADOS INVALIDOS");
        }
        
    }
}
